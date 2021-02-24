/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Contrato;
import modelo.Home;
import vista.VistaConsultaFlujo;
import vista.VistaHome;

/**
 *
 * @author chris
 */
public class ControladorConsultaFlujo implements ActionListener {

    VistaConsultaFlujo vista;
    Contrato modelo;

    public ControladorConsultaFlujo(VistaConsultaFlujo vista, Contrato modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Entró");
        if (e.getSource().equals(this.vista.getBtnConsultar())) {

        } else if (e.getSource().equals(this.vista.getBtnVolver())) {
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
