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
import modelo.Cliente;
import modelo.Contrato;
import modelo.Servicio;
import proyectofinal.ProyectoFinal;
import util.CaException;
import vista.VistaConsultaFlujo;
import vista.VistaConsultaRecaudo;
import vista.VistaRegistroSalida;

/**
 *
 * @author fedc
 */
public class ControladorHome implements ActionListener {

    VistaHome vista;
    Home modelo;

    public ControladorHome(VistaHome vista, Home modelo) {
        /*HomeDAO homeBD = new HomeDAO();
        try {
            homeBD.buscarNombresParqueaderos();
        } catch (CaException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelo.setNomParqueaderos(homeBD.getHome().getNomParqueaderos());
        vista.setNomParqueaderos(modelo.getNomParqueaderos());*/
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(vista.getBtnSalida())) {
            this.vista.dispose();
            
            VistaRegistroSalida vistaSalida = new VistaRegistroSalida();
            Vehiculo vehiculo = new Vehiculo();
            Cliente cliente = new Cliente();
            Contrato contrato = new Contrato();
            ControladorRegistroSalida controlSalida = new ControladorRegistroSalida(vistaSalida, vehiculo, cliente, contrato);
            
            vistaSalida.asignaOyentes(controlSalida);
            vistaSalida.mostrar();
            
        } else if (ae.getSource().equals(vista.getBtnReservar())) {
            this.vista.dispose();

            //Aplicando MVC al registro del vehículo
            Vehiculo vehiculo = new Vehiculo();
            Servicio servicio = new Servicio();
            VistaRegistrarVehiculo vistaReservar = new VistaRegistrarVehiculo();
            ControladorVehiculo_VistaRegistrarVehiculo controlVehiculo = new ControladorVehiculo_VistaRegistrarVehiculo(vehiculo, servicio, vistaReservar);

            vistaReservar.asignaOyentes(controlVehiculo);
            vistaReservar.mostrar();

        } else if (ae.getSource().equals(vista.getBtnConstVehiculo())) {

        } else if (ae.getSource().equals(vista.getBtnConstRecaudo())) {
            this.vista.dispose();

            VistaConsultaRecaudo vistaRecaudo = new VistaConsultaRecaudo();
            ControladorConsultaRecaudo controladorRecaudo = new ControladorConsultaRecaudo(vistaRecaudo);

            vistaRecaudo.asignaOyentes(controladorRecaudo);
            vistaRecaudo.mostrar();

        } else if (ae.getSource().equals(vista.getBtnConstFlujo())) {
            this.vista.dispose();

            Contrato contrato = new Contrato();
            VistaConsultaFlujo vistaFlujo = new VistaConsultaFlujo();
            ControladorConsultaFlujo controlFlujo = new ControladorConsultaFlujo(vistaFlujo, contrato);
            
            vistaFlujo.asignaOyentes(controlFlujo);

            vistaFlujo.mostrar();
        } else if (ae.getSource().equals(vista.getBtnRegistrarParqueadero())) {
            this.vista.dispose();

            VistaRegistroParqueadero vistaParqueadero = new VistaRegistroParqueadero();
            Parqueadero parqueadero = new Parqueadero();
            ControladorParqueadero_VistaRegistroParqueadero controlParqueadero = new ControladorParqueadero_VistaRegistroParqueadero(parqueadero, vistaParqueadero);

            vistaParqueadero.asignaOyentes(controlParqueadero);
            vistaParqueadero.mostrar();
        }
    }
}
