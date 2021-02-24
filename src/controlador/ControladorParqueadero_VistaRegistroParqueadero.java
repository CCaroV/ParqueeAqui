/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Area;
import modelo.Home;
import modelo.Parqueadero;
import vista.VistaHome;
import vista.VistaRegistrarAreas;
import vista.VistaRegistroParqueadero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import dao.ParqueaderoDAO;
import util.CaException;

/**
 *
 * @author User
 */
public class ControladorParqueadero_VistaRegistroParqueadero implements ActionListener {

    private final VistaRegistroParqueadero vista;
    private final Parqueadero parqueadero;

    public ControladorParqueadero_VistaRegistroParqueadero(Parqueadero parqueadero, VistaRegistroParqueadero vista) {
        this.parqueadero = parqueadero;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.getBtnRegistrar())) {
            this.parqueadero.setN_localidad(this.vista.getLocalidad());
            this.parqueadero.setN_nivelServicio(this.parqueadero.getN_localidad());
            this.parqueadero.setN_parqueadero(this.vista.getNomParqueadero());
            this.parqueadero.setI_subterraneo(this.vista.getCheck());
            this.parqueadero.setV_pisos(Integer.parseInt(this.vista.getNumNiveles()));
            this.parqueadero.setV_areas(Integer.parseInt(this.vista.getNumAreas()));

            vista.dispose();

            VistaRegistrarAreas vistaArea = new VistaRegistrarAreas();
            Area area = new Area();
            area.setParqueadero(parqueadero);
            ControladorArea_VistaRegistrarAreas controlArea = new ControladorArea_VistaRegistrarAreas(area, vistaArea, this.parqueadero.getV_areas());
            vistaArea.asignarOyente(controlArea);
            vistaArea.mostrar();
            
        } else if (e.getSource().equals(vista.getBtnVolver())) {
            this.vista.dispose();

            mostrarHome();
        }
    }

    private void mostrarHome() {
        Home home = new Home();
        VistaHome vistaHome = new VistaHome();
        ControladorHome ch = new ControladorHome(vistaHome, home);
        vistaHome.asignaOyentes(ch);
        vistaHome.mostrar();
    }

}
