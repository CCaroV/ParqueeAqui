/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.CaException;

/**
 *
 * @author Sebastian Wilches
 */
public class ClienteDAO {

    private Cliente cliente;

    public ClienteDAO() {
        cliente = new Cliente();
    }

    public void incluirCliente() throws CaException {
        try {
            //QUERY a ejecutar para registrar el area
            String strSQL = "INSERT INTO Cliente (k_cliente, n_nombre, n_apellido, n_direccion) VALUES (?,?,?,?)";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, cliente.getK_cliente());
            prepStmt.setString(2, cliente.getN_nombre());
            prepStmt.setString(3, cliente.getN_apellido());
            prepStmt.setString(4, cliente.getN_direccion());
            //Se ejecuta la sentencia
            prepStmt.executeUpdate();
            prepStmt.close();
            //Se hace commit de los cambios
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new CaException("ClienteDAO", "No pudo crear el cliente" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void modificarCliente() throws CaException {
        try {
            //QUERY a ejecutar para registrar el area
            String strSQL = "UPDATE Cliente SET(n_nombre=?, n_direccion=?) WHERE k_cliente=?";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, cliente.getN_nombre());
            prepStmt.setString(2, cliente.getN_direccion());
            prepStmt.setInt(3, cliente.getK_cliente());
            //Se ejecuta la sentencia
            prepStmt.executeUpdate();
            prepStmt.close();

        } catch (SQLException e) {
            throw new CaException("ClienteDAO", "No pudo actualizar el cliente, " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void buscarCliente() throws CaException {
        try {
            //QUERY a ejecutar para buscar el cliente
            String strSQL = "SELECT k_cliente, n_nombre, n_apellido, n_direccion FROM Cliente WHERE k_cliente = ?";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, cliente.getK_cliente());
            //Se ejecuta la sentencia
            ResultSet rs = prepStmt.executeQuery();
            //Se recuperan los valores
            while (rs.next()) {
                cliente.setK_cliente(rs.getInt(1));
                cliente.setN_nombre(rs.getString(2));
                cliente.setN_apellido(rs.getString(3));
                cliente.setN_direccion(rs.getString(4));
            }
        } catch (SQLException e) {
            throw new CaException("ClienteDAO", "No pudo recuperar el Cliente " + e.getMessage());
        }
    }
}
