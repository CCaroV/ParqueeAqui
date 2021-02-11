/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.RegistroSalida;
import Vista.VistaRegistroSalida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author fedc
 */
public class ControladorRegistroSalida implements ActionListener, ItemListener {

    private final VistaRegistroSalida vista;
    private final RegistroSalida modelo;

    public ControladorRegistroSalida(VistaRegistroSalida vista, RegistroSalida modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(vista.getBtnFactura())) {
            
        } else if (ae.getSource().equals(vista.getBtnVolver())) {
            
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (vista.getBoxTipoContrato().getSelectedItem().toString().equals("Minutos")) {
            vista.getFldNomCliente().setEditable(false);
            vista.getFldMarcaVehiculo().setEditable(false);
            vista.getFldModeloVehiculo().setEditable(false);
            vista.getFldCedula().setEditable(false);
            vista.getFldColor().setEditable(false);
        } else {
            vista.getFldNomCliente().setEditable(true);
            vista.getFldMarcaVehiculo().setEditable(true);
            vista.getFldModeloVehiculo().setEditable(true);
            vista.getFldCedula().setEditable(true);
            vista.getFldColor().setEditable(true);
        }
    }
    
    

}
