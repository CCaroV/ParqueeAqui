/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Parqueadero;
import Vista.VistaHome;
import Vista.VistaRegistroParqueadero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControladorParqueadero_VistaRegistroParqueadero implements ActionListener {
    private final VistaRegistroParqueadero vista;
    private final Parqueadero parqueadero;
    public ControladorParqueadero_VistaRegistroParqueadero(Parqueadero parqueadero, VistaRegistroParqueadero vista){
        this.parqueadero=parqueadero;
        this.vista=vista;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(vista.getBtnRegistrar())){
            this.parqueadero.setN_localidad(this.vista.getLocalidad());
            this.parqueadero.setN_nivelServicio(this.vista.getNumNiveles());
            this.parqueadero.setN_parqueadero(this.vista.getNomParqueadero());
            
        }
        if(e.getSource().equals(vista.getBtnVolver())){
            
        }
    }
    
}
