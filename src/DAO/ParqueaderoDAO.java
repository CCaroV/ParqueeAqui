/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import modelo.Parqueadero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.CaException;

/**
 *
 * @author User
 */
public class ParqueaderoDAO {
    Parqueadero parqueadero = new Parqueadero();

    public ParqueaderoDAO(Parqueadero parqueadero) {
        this.parqueadero=parqueadero;
    }
    
    public void registrarParquedero()throws CaException {
      try {
          
            String strSQL = "INSERT INTO parqueadero (k_parqueadero, n_parqueadero, n_localidad, n_nivelservicio,"
                    + "n_direccion, v_pisos, i_subterraneo) VALUES(?,?,?,?,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, this.parqueadero.getK_parqueadero());
            prepStmt.setString(2, this.parqueadero.getN_parqueadero());
            prepStmt.setString(3, this.parqueadero.getN_localidad());
            prepStmt.setFloat(4, this.parqueadero.getN_nivelServicio());
            prepStmt.setString(5, this.parqueadero.getN_direccion());
            prepStmt.setInt(6, this.parqueadero.getV_pisos());
            prepStmt.setBoolean(7, this.parqueadero.isI_subterraneo());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();            
        }catch (SQLException e) {
           throw new CaException( "ParqueaderoDAO", "No pudo crear el parqueadero"+ e.getMessage());
        }  finally {
         ServiceLocator.getInstance().liberarConexion();
        }
    }
}
