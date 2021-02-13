/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Tarifa;
import Vista.VistaRegistroParqueadero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fedc
 */
public class ControladorTarifa implements ActionListener {

    private final VistaRegistroParqueadero vista;
    private final Tarifa modelo;

    public ControladorTarifa(VistaRegistroParqueadero vista, Tarifa modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(vista.getBtnRegistrar())) {
            System.out.println("Entró a botón registrar");
            if (vista.getNomParqueadero().equals("") || vista.getNumNiveles().equals("")) {
                vista.mensajeAlerta();
            } else {
                modelo.setNumNiveles(Integer.parseInt(vista.getNumNiveles()));
                String dividido[] = vista.getLocalidad().split(",");
                modelo.setLocalidad(dividido[0]);
                modelo.setNumLocalidad(dividido[1]);
                modelo.setSubterraneo(vista.getCheck());

            }
        }
    }

}
