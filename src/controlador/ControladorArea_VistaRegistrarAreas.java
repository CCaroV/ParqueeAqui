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

import dao.AreaDAO;
import dao.ParqueaderoDAO;
import javax.swing.JOptionPane;
import util.CaException;

/**
 *
 * @author User
 */
public class ControladorArea_VistaRegistrarAreas implements ActionListener {

    private final Area area;
    private final VistaRegistrarAreas vista;
    private int q_area;

    public ControladorArea_VistaRegistrarAreas(Area area, VistaRegistrarAreas vista, int q_area) {
        this.area = area;
        this.vista = vista;
        this.q_area = q_area;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.getBtnRegistrar())) {

            this.area.setQ_cuposAutomovil(Integer.parseInt(this.vista.getAuto()));
            this.area.setQ_cuposBicicleta(Integer.parseInt(this.vista.getBicicleta()));
            this.area.setQ_cuposCamioneta(Integer.parseInt(this.vista.getCamioneta()));
            this.area.setQ_cuposCampero(Integer.parseInt(this.vista.getCampero()));
            this.area.setQ_cuposMotocicleta(Integer.parseInt(this.vista.getMotocicleta()));
            this.area.setQ_cuposVehiculoPesado(Integer.parseInt(this.vista.getVehiculoPesado()));
            this.area.setQ_cuposTotales(this.area.getQ_cuposAutomovil(), this.area.getQ_cuposBicicleta(),
                    this.area.getQ_cuposCamioneta(), this.area.getQ_cuposCampero(),
                    this.area.getQ_cuposMotocicleta(), this.area.getQ_cuposVehiculoPesado());
            this.area.setQ_cuposDisponibles(this.area.getQ_cuposTotales());
            this.q_area--;

            //JOptionPane.showMessageDialog(this.vista, "Ingrese solo valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            this.vista.limpiarFields();
            if (this.q_area != 0) {
                JOptionPane.showMessageDialog(this.vista, "Área número " + String.valueOf(this.q_area) + " registrada", "Registro de áreas", JOptionPane.INFORMATION_MESSAGE);
                this.vista.limpiarFields();
            } else {

                ParqueaderoDAO parqueaderoBD = new ParqueaderoDAO(this.area.getParqueadero());
                AreaDAO areaBD = new AreaDAO(this.area);
                try {
                    parqueaderoBD.registrarParquedero();
                    areaBD.registrarArea();
                    JOptionPane.showMessageDialog(this.vista, "Áreas registradas con éxito", "Áreas registradas", JOptionPane.INFORMATION_MESSAGE);
                    asignarIdParqueadero();
                } catch (Exception ex) {
                    Logger.getLogger(ControladorParqueadero_VistaRegistroParqueadero.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(vista, "Error al registrar las áreas", "Error", JOptionPane.ERROR_MESSAGE);
                } finally {
                    this.vista.dispose();
                    mostrarHome();
                }
            }
        }

        if (e.getSource().equals(this.vista.getBtnVolver())) {
            mostrarVistaParqueadero();
            this.vista.dispose();
        }
    }

    private void mostrarVistaParqueadero() {
        VistaRegistroParqueadero vistaParqueadero = new VistaRegistroParqueadero();
        Parqueadero parqueadero = new Parqueadero();
        ControladorParqueadero_VistaRegistroParqueadero controlParqueadero = new ControladorParqueadero_VistaRegistroParqueadero(parqueadero, vistaParqueadero);
        vistaParqueadero.asignaOyentes(controlParqueadero);
        vistaParqueadero.mostrar();
    }

    private void asignarIdParqueadero() {
        Home h = new Home();
        this.area.getParqueadero().setK_parqueadero(h.getNomParqueaderos().size() + 1);
        this.area.setK_area(h.getNomParqueaderos().size() + 1);
    }

    private void mostrarHome() {
        Home home = new Home();
        VistaHome vistaHome = new VistaHome();
        ControladorHome ch = new ControladorHome(vistaHome, home);
        vistaHome.asignaOyentes(ch);
        vistaHome.mostrar();
    }

    public int getQ_area() {
        return q_area;
    }

    public void setQ_area(int q_area) {
        this.q_area = q_area;
    }

}
