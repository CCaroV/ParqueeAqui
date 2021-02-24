/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Home;
import modelo.Parqueadero;
import modelo.Vehiculo;
import vista.VistaHome;
import vista.VistaRegistrarVehiculo;
import vista.VistaRegistroParqueadero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import dao.HomeDAO;
import proyectofinal.ProyectoFinal;
import util.CaException;

/**
 *
 * @author fedc
 */
public class ControladorHome implements ActionListener{
    
    VistaHome vista;
    Home modelo;

    public ControladorHome(VistaHome vista, Home modelo) {
        HomeDAO homeBD = new HomeDAO();
        try {
            homeBD.buscarNombresParqueaderos();
        } catch (CaException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelo.setNomParqueaderos(homeBD.getHome().getNomParqueaderos());
        vista.setNomParqueaderos(modelo.getNomParqueaderos());
        this.vista = vista;
        this.modelo = modelo;       
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("escuchó el evento");
        if(ae.getSource().equals(vista.getBtnReservar())) {
            this.vista.dispose();
            Vehiculo vehiculo=new Vehiculo();
            VistaRegistrarVehiculo vistaReservar=new VistaRegistrarVehiculo();
            ControladorVehiculo_VistaRegistrarVehiculo c=new ControladorVehiculo_VistaRegistrarVehiculo(vehiculo,vistaReservar);
            vistaReservar.mostrar();
        } else if (ae.getSource().equals(vista.getBtnConstVehiculo())) {
            
        } else if (ae.getSource().equals(vista.getBtnConstRecaudo())) {
            
        } else if (ae.getSource().equals(vista.getBtnConstFlujo())) {
            
        } else if (ae.getSource().equals(vista.getBtnRegistrarParqueadero())) {
            this.vista.dispose();
            VistaRegistroParqueadero vistaParqueadero= new VistaRegistroParqueadero();
            Parqueadero parqueadero=new Parqueadero();
            ControladorParqueadero_VistaRegistroParqueadero back= new ControladorParqueadero_VistaRegistroParqueadero (parqueadero, vistaParqueadero);
            vistaParqueadero.asignaOyentes(back);
            vistaParqueadero.mostrar();
        }
    }
}
