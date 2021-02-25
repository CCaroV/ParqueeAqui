/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import controlador.ControladorHome;
import dao.HomeDAO;
import modelo.Home;
import vista.VistaHome;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import util.CaException;

/**
 *
 * @author fedc
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CaException {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println("No fue posible establecer un diesño diferente: " + e);
        }
        
        Home home = new Home();
        VistaHome vistaHome = new VistaHome();
        ControladorHome controlador = new ControladorHome(vistaHome, home);
        vistaHome.asignaOyentes(controlador);
        vistaHome.mostrar();
        

    }

}
