/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Controlador.ControladorTarifa;
import Modelo.Tarifa;
import Vista.VistaRegistroVehiculo;

/**
 *
 * @author fedc
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tarifa t = new Tarifa();
        VistaRegistroVehiculo v = new VistaRegistroVehiculo();
        ControladorTarifa c = new ControladorTarifa(v, t);
        v.asignaOyentes(c);
        v.mostrar();
    }
    
}
