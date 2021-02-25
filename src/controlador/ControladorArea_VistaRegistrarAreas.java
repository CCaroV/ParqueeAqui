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
import dao.SlotDAO;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import modelo.Slot;
import util.CaException;

/**
 *
 * @author User
 */
public class ControladorArea_VistaRegistrarAreas implements ActionListener {

    private final Area area;
    private final Parqueadero parqueadero;
    private final Slot slot = new Slot();
    private final VistaRegistrarAreas vista;
    private int q_area;

    private final Home home = new Home();
    private final VistaHome vistaHome = new VistaHome();
    private final ControladorHome ch = new ControladorHome(vistaHome, home);

    public ControladorArea_VistaRegistrarAreas(Area area, VistaRegistrarAreas vista, int q_area, Parqueadero parqueadero) {
        this.area = area;
        this.vista = vista;
        this.q_area = q_area;
        this.vistaHome.asignaOyentes(ch);
        this.parqueadero = parqueadero;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.getBtnRegistrar())) {
            this.area.setK_area(parqueadero.getK_parqueadero() * 100 + q_area);
            this.area.setQ_cuposAutomovil(Integer.parseInt(this.vista.getAuto()));
            this.area.setQ_cuposBicicleta(Integer.parseInt(this.vista.getBicicleta()));
            this.area.setQ_cuposCamioneta(Integer.parseInt(this.vista.getCamioneta()));
            this.area.setQ_cuposCampero(Integer.parseInt(this.vista.getCampero()));
            this.area.setQ_cuposMotocicleta(Integer.parseInt(this.vista.getMotocicleta()));
            this.area.setQ_cuposVehiculoPesado(Integer.parseInt(this.vista.getVehiculoPesado()));
            this.area.setQ_cuposTotales(this.area.getQ_cuposAutomovil(), this.area.getQ_cuposBicicleta(),
                    this.area.getQ_cuposCamioneta(), this.area.getQ_cuposCampero(),
                    this.area.getQ_cuposMotocicleta(), this.area.getQ_cuposVehiculoPesado());
            System.out.println(area.getQ_cuposTotales());
            this.area.setQ_cuposDisponibles(this.area.getQ_cuposTotales());
            this.q_area--;

            this.vista.limpiarFields();
            if (this.q_area != 0) {
                JOptionPane.showMessageDialog(this.vista, "Área número " + String.valueOf(this.q_area) + " registrada", "Registro de áreas", JOptionPane.INFORMATION_MESSAGE);
                this.vista.limpiarFields();
            }
            AreaDAO areaBD = new AreaDAO(this.area);
            SlotDAO slotBD = new SlotDAO(this.slot);
            try {
                areaBD.registrarArea();
                slotBD.cantidadSlots();
                for (int i = area.getQ_cuposTotales(); i > 0; i--) {
                    slot.setK_slot(i + q_area *1000);
                    slot.setArea(this.area);
                    slot.setParqueadero(this.parqueadero);
                    slot.setI_estado(false);
                    slotBD.incluirSlot();
                }

            } catch (HeadlessException | CaException ex) {
                Logger.getLogger(ControladorParqueadero_VistaRegistroParqueadero.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(vista, "Error al registrar las áreas", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                if (this.q_area == 0) {
                    this.vista.dispose();
                    mostrarHome();
                }
            }
        }
    }

    private void mostrarVistaParqueadero() {
        VistaRegistroParqueadero vistaParqueadero = new VistaRegistroParqueadero();
        Parqueadero parqueadero = new Parqueadero();
        ControladorParqueadero_VistaRegistroParqueadero controlParqueadero = new ControladorParqueadero_VistaRegistroParqueadero(parqueadero, vistaParqueadero);
        vistaParqueadero.asignaOyentes(controlParqueadero);
        vistaParqueadero.mostrar();
    }

    private void mostrarHome() {
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
