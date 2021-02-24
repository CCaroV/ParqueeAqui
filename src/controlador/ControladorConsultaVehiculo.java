/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;
import modelo.Home;
import modelo.Vehiculo;
import vista.VistaConsultaVehiculo;
import vista.VistaHome;

/**
 *
 * @author chris
 */
public class ControladorConsultaVehiculo implements ActionListener {

    private final Vehiculo vehiculo;
    private final Cliente cliente;
    private final VistaConsultaVehiculo vista;

    public ControladorConsultaVehiculo(Vehiculo vehiculo, Cliente cliente, VistaConsultaVehiculo vista) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.getBtnConsultar())) {
            
        } else if (e.getSource().equals(vista.getBtnVolver())) {
            this.vista.dispose();
            mostrarHome();
        }
    }
    
    private void mostrarHome() {
        Home home = new Home();
        VistaHome vistaHome = new VistaHome();
        ControladorHome ch = new ControladorHome(vistaHome, home);
        vistaHome.asignaOyentes(ch);
        vistaHome.mostrar();
    }

}
