/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Controlador.ControladorArea_VistaRegistrarAreas;
import Controlador.ControladorHome;
import Controlador.ControladorParqueadero_VistaRegistroParqueadero;
import Controlador.ControladorRegistroSalida;
import Controlador.ControladorTarifa;
import DAOs.HomeDAO;
import DAOs.ServiceLocator;
import Modelo.Area;
import Modelo.Home;
import Modelo.Parqueadero;
import Modelo.Tarifa;
import Vista.VistaHome;
import Vista.VistaRegistroSalida;
import Vista.VistaRegistroParqueadero;
import Vista.VistaVerificarCupo;
import Vista.VistaRegistrarVehiculo;
import Vista.VistaRegistrarAreas;
import Vista.VistaConsultaVehiculo;
import Vista.EstaEstaMalPeroSirveComoInicioDeUnaNuevaYNoSupeComoBorrarla;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import util.CaException;

/**
 *
 * @author fedc
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }
        //VistaVerificarCupo vi = new VistaVerificarCupo();
        //vi.mostrar();

        //VistaRegistroSalida vii = new VistaRegistroSalida();
        //ControladorRegistroSalida cii = new ControladorRegistroSalida();
        //vii.asignaOyentes(cii);
        //vii.mostrar();

        //VistaConsultaVehiculo vehiculo=new VistaConsultaVehiculo();
        //vehiculo.mostrar();
        Home miii = new Home();
        VistaHome viii = new VistaHome();
        ControladorHome ciii = new ControladorHome(viii, miii);
        viii.asignaOyentes(ciii);
        viii.mostrar();
        
    }

}
