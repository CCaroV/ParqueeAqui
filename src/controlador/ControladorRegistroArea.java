/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.VistaRegistrarAreas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author fedc
 */
public class ControladorRegistroArea implements ActionListener {

    // modelo;
    VistaRegistrarAreas vista;

    public ControladorRegistroArea(/*RegistroParqueadero modelo,*/VistaRegistrarAreas vista) {
        //this.modelo = modelo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

}
