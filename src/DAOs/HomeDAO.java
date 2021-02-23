/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Modelo.Home;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.CaException;

/**
 *
 * @author User
 */
public class HomeDAO {
    private Home home;

    public HomeDAO() {
        this.home = new Home();
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }
    
    public void buscarNombresParqueaderos() throws CaException{
      try{
         String strSQL = "SELECT n_parqueadero FROM parqueadero";
         Connection conexion = ServiceLocator.getInstance().tomarConexion();
          PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
          ResultSet rs = prepStmt.executeQuery();
       
          while (rs.next()){
            
            this.home.agregarParqueadero(rs.getString(1));
            
          }
      }
      catch(SQLException e){
        throw new CaException("MunicipioDAO", "No pudo recuperar el Municipio "+ e.getMessage());
      }
      ServiceLocator.getInstance().liberarConexion();
    }
}
