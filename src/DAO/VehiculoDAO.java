/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.CaException;

/**
 *
 * @author fedc
 */
public class VehiculoDAO {
    Vehiculo vehiculo;
    public VehiculoDAO(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
    }
    
       public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    //Metodo que registra el vehiculo
    public void registrarVehiculo()throws CaException {
        try {
            //QUERY para registrar el vehiculo
            String strSQL = "INSERT INTO vehiculo (k_vehiculo,n_modelo,n_marca,n_tipo,n_color) VALUES (?,?,?,?,?)";
            //Conexion a la BD
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);    
            //Asignacion de valores a las columnas de la tabla
            prepStmt.setString(1, this.vehiculo.getK_vehiculo());
            prepStmt.setString(2,this.vehiculo.getN_modelo());
            prepStmt.setString(3,this.vehiculo.getN_marca());
            prepStmt.setString(4, this.vehiculo.getN_tipo());
            prepStmt.setString(5, this.vehiculo.getN_color());
        }catch(SQLException e){
          throw new CaException( "VehiculoDAO", "No pudo registrar el vehiculo"+ e.getMessage());
        }  finally {
         //conexion BD
         ServiceLocator.getInstance().liberarConexion();
        }    
        
    }
}
