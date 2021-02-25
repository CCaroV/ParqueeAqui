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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import util.CaException;

/**
 *
 * @author User
 */
public class ControladorParqueadero_VistaRegistroParqueadero implements ActionListener, ItemListener {

    private final VistaRegistroParqueadero vista;
    private final Parqueadero parqueadero;
    private final Home home = new Home();
    private final VistaHome vistaHome = new VistaHome();
    private final ControladorHome ch = new ControladorHome(vistaHome, home);

    public ControladorParqueadero_VistaRegistroParqueadero(Parqueadero parqueadero, VistaRegistroParqueadero vista) {
        this.parqueadero = parqueadero;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.getBtnRegistrar())) {
            this.parqueadero.setK_parqueadero(vistaHome.getTotalParqueadero() + 1);
            this.parqueadero.setN_localidad(this.vista.getLocalidad());
            this.parqueadero.setN_nivelServicio(this.parqueadero.getN_localidad());
            this.parqueadero.setN_parqueadero(this.vista.getNomParqueadero());
            this.parqueadero.setN_direccion(this.vista.getDireccion());
            this.parqueadero.setI_subterraneo(this.vista.getCheck());
            this.parqueadero.setQ_pisos(Integer.parseInt(this.vista.getNumNiveles()));
            this.parqueadero.setQ_areas(Integer.parseInt(this.vista.getNumAreas()));

            vista.dispose();
            
            ParqueaderoDAO parqueaderoBD = new ParqueaderoDAO(parqueadero);
            try {
                parqueaderoBD.registrarParquedero();
            } catch (CaException ex) {
                Logger.getLogger(ControladorParqueadero_VistaRegistroParqueadero.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(vista, "Error al registrar el parqueadero", "Error", JOptionPane.ERROR_MESSAGE);
            }

            VistaRegistrarAreas vistaArea = new VistaRegistrarAreas();
            Area area = new Area();
            area.setParqueadero(parqueadero);
            ControladorArea_VistaRegistrarAreas controlArea = new ControladorArea_VistaRegistrarAreas(area, vistaArea, this.parqueadero.getQ_areas(), this.parqueadero);
            vistaArea.asignarOyente(controlArea);
            vistaArea.mostrar();

        } else if (e.getSource().equals(vista.getBtnVolver())) {
            this.vista.dispose();
            
            mostrarHome();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource().equals(vista.getSi()) && vista.getNo().isSelected()) {
            vista.setNo(false);
        } else if (e.getSource().equals(vista.getNo()) && vista.getSi().isSelected()) {
            vista.setSi(false);
        }
    }

    private void mostrarHome() {
        vistaHome.asignaOyentes(ch);
        vistaHome.mostrar();
    }

}
