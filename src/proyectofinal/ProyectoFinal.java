/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Controlador.ControladorHome;
import Controlador.ControladorRegistroSalida;
import Controlador.ControladorTarifa;
import Modelo.Home;
import Modelo.RegistroSalida;
import Modelo.Tarifa;
import Vista.VistaHome;
import Vista.VistaRegistroSalida;
import Vista.VistaRegistroParqueadero;
import Vista.VistaVerificarCupo;
import Vista.VistaRegistrarVehiculo;
import Vista.VistaRegistrarAreas;
import javax.swing.UIManager;

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

        Tarifa m = new Tarifa();
        VistaRegistroParqueadero v = new VistaRegistroParqueadero();
        ControladorTarifa c = new ControladorTarifa(v, m);
        v.asignaOyentes(c);
        //v.mostrar();

        VistaVerificarCupo vi = new VistaVerificarCupo();
        //vi.mostrar();

        RegistroSalida mii = new RegistroSalida();
        VistaRegistroSalida vii = new VistaRegistroSalida();
        ControladorRegistroSalida cii = new ControladorRegistroSalida(vii, mii);
        vii.asignaOyentes(cii);
        //vii.mostrar();

        Home miii = new Home();
        VistaHome viii = new VistaHome();
        ControladorHome ciii = new ControladorHome(viii, miii);
        viii.asignaOyentes(ciii);
        viii.mostrar();
        
        VistaRegistrarVehiculo viv = new VistaRegistrarVehiculo();
        //viv.mostrar();
        
        VistaRegistrarAreas vv = new VistaRegistrarAreas();
        //vv.mostrar();
        
    }

}
