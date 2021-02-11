/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Controlador.ControladorRegistroSalida;
import Controlador.ControladorTarifa;
import Modelo.RegistroSalida;
import Modelo.Tarifa;
import Vista.VistaRegistroSalida;
import Vista.VistaRegistroVehiculo;
import Vista.VistaVerificarCupo;

/**
 *
 * @author fedc
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tarifa m = new Tarifa();
        VistaRegistroVehiculo v = new VistaRegistroVehiculo();
        ControladorTarifa c = new ControladorTarifa(v, m);
        v.asignaOyentes(c);
        //v.mostrar();
        
        VistaVerificarCupo vi = new VistaVerificarCupo();
        //vi.mostrar();
        
        RegistroSalida mii = new RegistroSalida();
        VistaRegistroSalida vii = new VistaRegistroSalida();
        ControladorRegistroSalida cii = new ControladorRegistroSalida(vii, mii);
        vii.asignaOyentes(cii);
        vii.mostrar();
    }
    
}
