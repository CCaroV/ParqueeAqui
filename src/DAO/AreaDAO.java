/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Area;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Parqueadero;
import util.CaException;

/**
 *
 * @author User
 */
public class AreaDAO {

    Area area;

    public AreaDAO(Area area) {
        this.area = area;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    //Metodo que registra el area de un parqueadero
    public void registrarArea() throws CaException {
        try {
            //QUERY a ejecutar para registrar el area
            String strSQL = "INSERT INTO area (k_area, q_cuposdisponibles, q_cupostotales, k_parqueadero,"
                    + "q_cupoautomovil, q_cupocampero, q_cupocamioneta, q_cupopesado,"
                    + "q_cupomotocicleta, q_cupobicicleta) VALUES(?,?,?,?,?,?,?,?,?,?)";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            //Asignacion de valores a las columnas de la tabla
            prepStmt.setInt(1, this.area.getK_area());
            prepStmt.setInt(2, this.area.getQ_cuposDisponibles());
            prepStmt.setInt(3, this.area.getQ_cuposTotales());
            prepStmt.setInt(4, this.area.getParqueadero().getK_parqueadero());
            prepStmt.setInt(5, this.area.getQ_cuposAutomovil());
            prepStmt.setInt(6, this.area.getQ_cuposCampero());
            prepStmt.setInt(7, this.area.getQ_cuposCamioneta());
            prepStmt.setInt(8, this.area.getQ_cuposVehiculoPesado());
            prepStmt.setInt(9, this.area.getQ_cuposMotocicleta());
            prepStmt.setInt(10, this.area.getQ_cuposBicicleta());
            //Ejecucion del QUERY
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new CaException("AreaDAO", "No pudo crear el area" + e.getMessage());
        } finally {
            //Liberacion conexion BD
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void cambioCupos() throws CaException {
        try {
            String strSQL = "UPDATE area SET q_cuposdisponibles = ?, q_cupoautomovil = ?, "
                    + "q_cupocampero = ?, q_cupocamioneta = ?, q_cupopesado = ?, "
                    + "q_cupomotocicleta = ?, q_cupobicicleta = ? WHERE k_parqueadero = ? AND k_area = ?;";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, this.area.getQ_cuposDisponibles());
            prepStmt.setInt(2, this.area.getQ_cuposAutomovil());
            prepStmt.setInt(3, this.area.getQ_cuposCampero());
            prepStmt.setInt(4, this.area.getQ_cuposCamioneta());
            prepStmt.setInt(5, this.area.getQ_cuposVehiculoPesado());
            prepStmt.setInt(6, this.area.getQ_cuposMotocicleta());
            prepStmt.setInt(7, this.area.getParqueadero().getK_parqueadero());
            prepStmt.setInt(8, this.area.getQ_cuposDisponibles());
            prepStmt.setInt(9, this.area.getK_area());
        } catch (SQLException e) {
            throw new CaException("AreaDAO", "No pudo actualizar los datos" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void proyectaCupos() throws CaException {
        try {
            String strSQL = "SELECT q_cuposdisponibles, q_cupoautomovil, q_cupocampero, q_cupocamioneta,"
                    + "q_cupopesado, q_cupomotocicleta, q_cupobicicleta FROM area WHERE k_area = ?;";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()) {
                
            }
        } catch (SQLException e) {
            throw new CaException("AreaDAO", "No pudo proyectar los datos" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
}
