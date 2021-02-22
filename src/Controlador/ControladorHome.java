/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Home;
import Modelo.Tarifa;
import Vista.VistaHome;
import Vista.VistaRegistroParqueadero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fedc
 */
public class ControladorHome implements ActionListener {

    VistaHome vista;
    Home modelo;

    public ControladorHome(VistaHome vista, Home modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("escuchó el evento");
        if (ae.getSource().equals(vista.getBtnReservar())) {

        } else if (ae.getSource().equals(vista.getBtnConstVehiculo())) {

        } else if (ae.getSource().equals(vista.getBtnConstRecaudo())) {

        } else if (ae.getSource().equals(vista.getBtnConstFlujo())) {

        } else if (ae.getSource().equals(vista.getBtnRegistrarParqueadero())) {
            Tarifa m = new Tarifa();
            VistaRegistroParqueadero v = new VistaRegistroParqueadero();
            ControladorTarifa c = new ControladorTarifa(v, m);
            //v.asignaOyentes(c);
            v.mostrar();
        }
    }

}
