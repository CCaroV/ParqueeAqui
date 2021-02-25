/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Slot;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import util.CaException;

/**
 *
 * @author Sebastian Wilches
 */
public class SlotDAO {

    private Slot slot;
    int cantidadSlots=0;
    
    public SlotDAO(Slot slot) {
        this.slot = slot;
    }

    public void incluirSlot() throws CaException {
        
        try {
            //QUERY a ejecutar para registrar el area
            String strSQL = "INSERT INTO slot (k_slot, i_estado, k_area, k_parqueadero) VALUES (?,?,?,?)";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, slot.getK_slot()+cantidadSlots);
            //System.out.println(slot.getK_slot());
            prepStmt.setBoolean(2, slot.isI_estado());
            prepStmt.setInt(3, slot.getArea().getK_area());
            //System.out.println(slot.getArea().getK_area());
            prepStmt.setInt(4, slot.getParqueadero().getK_parqueadero());
            //Se ejecuta la sentencia
            prepStmt.executeUpdate();
            prepStmt.close();
            //Se hace commit de los cambios
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new CaException("SlotDAO", "No pudo crear el slot" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void modificarSlot() throws CaException {
        try {
            //QUERY a ejecutar para registrar el area
            String strSQL = "UPDATE Slot SET i_estado=? WHERE k_slot=?";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setBoolean(1, slot.isI_estado());
            System.out.println(slot.isI_estado());
            prepStmt.setInt(2, slot.getK_slot());
            System.out.println(slot.getK_slot());
            //Se ejecuta la sentencia
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            throw new CaException("SlotDAO", "No pudo actualizar el slot, " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public void buscarSlot() throws CaException {
        try {
            //QUERY a ejecutar para buscar el slot
            String strSQL = "SELECT k_slot, k_area, k_parqueadero FROM Slot WHERE i_estado IS false LIMIT 1;";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            //Se ejecuta la sentencia
            ResultSet rs = prepStmt.executeQuery();
            //Se recuperan los valores
            while (rs.next()) {
                slot.setK_slot(rs.getInt(1));
                slot.getArea().setK_area(rs.getInt(2));
                slot.getParqueadero().setK_parqueadero(rs.getInt(3));
            }
        } catch (SQLException e) {
            throw new CaException("SlotDAO", "No pudo recuperar el slot " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }
    
    public void cantidadSlots() throws CaException{
        try{
            String strSQL2 = "SELECT COUNT(k_slot) FROM slot";
            Connection conexion2 = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt2 = conexion2.prepareStatement(strSQL2);
            ResultSet rs2 = prepStmt2.executeQuery();
            while (rs2.next()) {
                cantidadSlots = rs2.getInt(1);
            }
            prepStmt2.close();
        }catch (SQLException e) {
            throw new CaException("SlotDAO", "No pudo crear el slot" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
        
        
    }
}
