/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import controlador.ControladorHome;
import modelo.Home;
import vista.VistaHome;
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

        Home home = new Home();
        VistaHome vistaHome = new VistaHome();
        ControladorHome controlador = new ControladorHome(vistaHome, home);
        vistaHome.asignaOyentes(controlador);
        vistaHome.mostrar();

    }

}
