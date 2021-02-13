/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Area;
import Vista.VistaRegistrarAreas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControladorArea_VistaRegistrarAreas implements ActionListener {
    private Area area;
    
    private VistaRegistrarAreas vista;
    public ControladorArea_VistaRegistrarAreas(Area area, VistaRegistrarAreas vista){
        this.area=area;
        this.vista=vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.getBtnRegistrar())){
            this.area.setQ_cuposAutomovil(Integer.parseInt(vista.getAuto()));
        }
    }
}
