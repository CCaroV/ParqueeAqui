/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Servicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.CaException;

/**
 *
 * @author Sebastian Wilches
 */
public class ServicioDAO {

    private Servicio servicio;

    public ServicioDAO() {
        servicio = new Servicio();
    }

    public void incluirServicio() throws CaException {
        try {
            //QUERY a ejecutar para registrar el area
            String strSQL = "INSERT INTO servicio (k_servicio, f_fechaHoraInicio, f_fechaHoraSalida, k_slot, k_vehiculo) VALUES (?,?,?,?,?)";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, servicio.getK_servicio());
            prepStmt.setDate(2, servicio.getF_fechaHoraInicio());
            prepStmt.setDate(3, servicio.getF_fechaHoraSalida());
            prepStmt.setInt(4, servicio.getSlot().getK_slot());
            prepStmt.setString(5, servicio.getVehiculo().getK_vehiculo());
            //Se ejecuta la sentencia
            prepStmt.executeUpdate();
            prepStmt.close();
            //Se hace commit de los cambios
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new CaException("ServicioDAO", "No se pudo crear el servicio " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void modificarServicio() throws CaException {
        try {
            //QUERY a ejecutar para registrar el area
            String strSQL = "UPDATE Servicio SET(f_fechaHoraSalida=?) WHERE k_servicio=?";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setDate(1, servicio.getF_fechaHoraSalida());
            prepStmt.setInt(2, servicio.getK_servicio());
            //Se ejecuta la sentencia
            prepStmt.executeUpdate();
            prepStmt.close();

        } catch (SQLException e) {
            throw new CaException("ServicioDAO", "No pudo actualizar el servicio, " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void buscarServicio() throws CaException {
        try {
            //QUERY a ejecutar para buscar el servicio
            String strSQL = "SELECT k_servicio, f_fechaHoraInicio, f_fechaHoraSalida, k_slot, k_vehiculo FROM Servicio WHERE k_servicio = ?";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, servicio.getK_servicio());
            //Se ejecuta la sentencia
            ResultSet rs = prepStmt.executeQuery();
            //Se recuperan los valores
            while (rs.next()) {
                servicio.setK_servicio(rs.getInt(1));
                servicio.setF_fechaHoraInicio(rs.getDate(2));
                servicio.setF_fechaHoraSalida(rs.getDate(3));
                servicio.getSlot().setK_slot(rs.getInt(4));
                servicio.getVehiculo().setK_vehiculo(rs.getString(5));
            }
        } catch (SQLException e) {
            throw new CaException("ServicioDAO", "No pudo recuperar el servicio " + e.getMessage());
        }
    }
}
