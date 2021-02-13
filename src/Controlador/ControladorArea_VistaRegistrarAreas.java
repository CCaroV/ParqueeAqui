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
    private Area areaAutomovil;
    private Area areaCampero;
    private Area areaCamioneta;
    private Area areaVehiculoPesado;
    private Area areaMotocicleta;
    private Area areaBicicleta;
    private VistaRegistrarAreas vista;
    public ControladorArea_VistaRegistrarAreas(Area areaAutomovil,Area areaCampero,
                                               Area areaCamioneta, Area areaVehiculoPesado, 
                                               Area areaMotocicleta, Area areaBicicleta,
                                               VistaRegistrarAreas vista){
        this.areaAutomovil=areaAutomovil;
        this.areaBicicleta=areaBicicleta;
        this.areaCamioneta=areaCamioneta;
        this.areaCampero=areaCampero;
        this.areaMotocicleta=areaMotocicleta;
        this.areaVehiculoPesado=areaVehiculoPesado;
        this.vista=vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.getBtnRegistrar())){
            this.areaAutomovil.setQ_cuposTotales(Integer.parseInt(vista.getAuto()));
        }
    }
}
