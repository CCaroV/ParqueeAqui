/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaConsultaRecaudo;
import DAO.ConsultaRecaudoDAO;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Home;
import util.CaException;
import vista.VistaHome;

/**
 *
 * @author Sebastian Wilches
 */
public class ControladorConsultaRecaudo implements ActionListener, MouseListener {

    private final VistaConsultaRecaudo vista;

    public ControladorConsultaRecaudo(VistaConsultaRecaudo vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.getBtnRegistrar())) {
            ConsultaRecaudoDAO consultaRecaudoDAO = new ConsultaRecaudoDAO();
            try {

                vista.setCantidad(consultaRecaudoDAO.consultarRecaudoBD(vista.getFechaInicial(), vista.getFechaFinal()));

            } catch (CaException ex) {
                Logger.getLogger(ControladorConsultaRecaudo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (e.getSource().equals(vista.getBtnVolver())) {
            this.vista.dispose();
            mostrarHome();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(vista.getFldFechaInicio()) && vista.getFechaInicial().equals("DD/MM/AAAA")) {
            vista.setFechaInicial("");
        } else if (e.getSource().equals(vista.getFldFechaFinal()) && vista.getFechaFinal().equals("DD/MM/AAAA")) {
            vista.setFechaFinal("");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private void mostrarHome() {
        Home home = new Home();
        VistaHome vistaHome = new VistaHome();
        ControladorHome ch = new ControladorHome(vistaHome, home);
        vistaHome.asignaOyentes(ch);
        vistaHome.mostrar();
    }

}
