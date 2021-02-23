/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Vehiculo;
import Vista.VistaRegistrarVehiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControladorVehiculo_VistaRegistrarVehiculo implements ActionListener{
    Vehiculo vehiculo;
    VistaRegistrarVehiculo vista;
    public ControladorVehiculo_VistaRegistrarVehiculo(Vehiculo vehiculo, VistaRegistrarVehiculo vista){
        this.vehiculo=vehiculo;
        this.vista=vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.getBtnRegistrar())){
            //Metodo que añada vehiculo a la bd
        }
    }
    
}
