/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Contrato;
import modelo.Home;
import vista.VistaConsultaFlujo;
import vista.VistaHome;

/**
 *
 * @author chris
 */
public class ControladorConsultaFlujo implements ActionListener, MouseListener {

    VistaConsultaFlujo vista;
    Contrato modelo;

    public ControladorConsultaFlujo(VistaConsultaFlujo vista, Contrato modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.getBtnConsultar())) {
            
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

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(vista.getFldFecha()) && vista.getFldFecha().getText().equals("DD/MM/AAAA")) {
            vista.setFldFecha("");
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
}
