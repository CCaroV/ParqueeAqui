/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.CaException;

/**
 *
 * @author Sebastian Wilches
 */
public class ConsultaRecaudoDAO {
    
    
    public double consultarRecaudoBD(String FechaInicial, String FechaFinal) throws CaException{
        double valor= 0;
        try {
            String strSQL = "SELECT SUM(v_valorpagado) FROM pago p, servicio s WHERE p.k_servicio=s.k_servicio AND s.fechaHoraSalida> TO_DATE(?, 'DD/MM/YYYY') AND s.fechaHoraSalida< TO_DATE(?, 'DD/MM/YYYY')";
            Connection conexion = dao.ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, FechaInicial);
            prepStmt.setString(2, FechaFinal);
            
            ResultSet rs = prepStmt.executeQuery();
            //Se recuperan los valores
            while (rs.next()) {
                valor=rs.getDouble("v_valorpagado");
            }
        } catch (SQLException e) {
            throw new CaException("ConsultaRecaudoDAO", "No se pudo hacer la consultaRecaudo " + e.getMessage());
        } finally {
            dao.ServiceLocator.getInstance().liberarConexion();

        }
        return valor;
    }
}
