/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.ParqueaderoDAO;
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
            vista.dispose();
            VistaRegistrarAreas vv = new VistaRegistrarAreas();
            Area a = new Area();
            a.setParqueadero(parqueadero);
            ControladorArea_VistaRegistrarAreas cavra = new ControladorArea_VistaRegistrarAreas(a, vv);
            vv.asignarOyente(cavra);
            vv.mostrar();
        }
        if (e.getSource().equals(vista.getBtnVolver())) {
            this.vista.dispose();
            Home h = new Home();
            VistaHome vh = new VistaHome();
            ControladorHome ch = new ControladorHome(vh, h);
            vh.asignaOyentes(ch);
            vh.mostrar();
        }
    }

}
