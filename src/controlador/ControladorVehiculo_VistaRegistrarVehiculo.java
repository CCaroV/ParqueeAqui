/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Vehiculo;
import vista.VistaRegistrarVehiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Parqueadero;
import vista.VistaRegistroParqueadero;

/**
 *
 * @author User
 */
public class ControladorVehiculo_VistaRegistrarVehiculo implements ActionListener {

    private final Vehiculo vehiculo;

    private final VistaRegistrarVehiculo vista;

    public ControladorVehiculo_VistaRegistrarVehiculo(Vehiculo vehiculo, VistaRegistrarVehiculo vista) {
        this.vehiculo = vehiculo;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.getBtnRegistrar())) {
            this.vehiculo.setN_tipo(this.vista.getTipoVehiculo());
            this.vehiculo.setK_vehiculo(this.vista.getPlaca());

        }
        if (e.getSource().equals(this.vista.getBtnVolver())) {
            this.vista.dispose();
            VistaRegistroParqueadero vistaParqueadero = new VistaRegistroParqueadero();
            Parqueadero parqueadero = new Parqueadero();
            ControladorParqueadero_VistaRegistroParqueadero back = new ControladorParqueadero_VistaRegistroParqueadero(parqueadero, vistaParqueadero);
            vistaParqueadero.asignaOyentes(back);
            vistaParqueadero.mostrar();

        }
    }
}
