/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelo.Tarifa2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.CaException;

/**
 *
 * @author Sebastian Wilches
 */
public class TarifaDAO {

    private Tarifa2 tarifa;

    public TarifaDAO() {
        tarifa = new Tarifa2();
    }

    public void incluirTarifa() throws CaException {
        try {
            //QUERY a ejecutar para registrar el area
            String strSQL = "INSERT INTO tarifa (k_tarifa, n_tipo, v_tarifa, k_parqueadero) VALUES (?,?,?,?)";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, tarifa.getK_tarifa());
            prepStmt.setString(2, tarifa.getN_tipo());
            prepStmt.setDouble(3, tarifa.getV_tarifa());
            prepStmt.setInt(4, tarifa.getParqueadero().getK_parqueadero());
            //Se ejecuta la sentencia
            prepStmt.executeUpdate();
            prepStmt.close();
            //Se hace commit de los cambios
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new CaException("TarifaDAO", "No pudo crear la tarifa " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void modificarTarifa() throws CaException {
        try {
            //QUERY a ejecutar para registrar el area
            String strSQL = "UPDATE Tarifa SET(v_tarifa=?) WHERE k_tarifa=?";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setDouble(1, tarifa.getV_tarifa());
            prepStmt.setInt(2, tarifa.getK_tarifa());
            //Se ejecuta la sentencia
            prepStmt.executeUpdate();
            prepStmt.close();

        } catch (SQLException e) {
            throw new CaException("TarifaDAO", "No pudo actualizar la tarifa, " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void buscarTarifa() throws CaException {
        try {
            //QUERY a ejecutar para buscar la tarifa
            String strSQL = "SELECT k_tarifa, n_tipo, v_tarifa, k_parqueadero FROM Tarifa WHERE k_tarifa = ?";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, tarifa.getK_tarifa());

            //Se ejecuta la sentencia
            ResultSet rs = prepStmt.executeQuery();
            //Se recuperan los valores
            while (rs.next()) {
                tarifa.setK_tarifa(rs.getInt(1));
                tarifa.setN_tipo(rs.getString(2));
                tarifa.setV_tarifa(rs.getDouble(3));
                tarifa.getParqueadero().setK_parqueadero(rs.getInt(4));
            }
        } catch (SQLException e) {
            throw new CaException("TarifaDAO", "No pudo recuperar la tarifa " + e.getMessage());
        }
    }
}
