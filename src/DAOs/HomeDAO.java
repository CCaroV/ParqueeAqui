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
    //Metodo que consulta los nombres de los parqueaderos
    public void buscarNombresParqueaderos() throws CaException{
      try{
          //QUERY de la consulta
         String strSQL = "SELECT n_parqueadero FROM parqueadero";
         //Conexion BD
         Connection conexion = ServiceLocator.getInstance().tomarConexion();
          PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
          //Ejecucion del QUERY
          ResultSet rs = prepStmt.executeQuery();
          //Asignacion de valores al objeto mientras halla una columna siguiente
          while (rs.next()){
            
            this.home.agregarParqueadero(rs.getString(1));
            
          }
      }
      catch(SQLException e){
        throw new CaException("HomeDAO", "No pudo recuperar el n_parqueadero "+ e.getMessage());
      }
      ServiceLocator.getInstance().liberarConexion();
    }
}
