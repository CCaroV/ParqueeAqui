/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Area;
import Modelo.Parqueadero;
import Vista.VistaRegistrarAreas;
import Vista.VistaRegistroParqueadero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControladorArea_VistaRegistrarAreas implements ActionListener {
    private final Area area;
    
    private final VistaRegistrarAreas vista;
    public ControladorArea_VistaRegistrarAreas(Area area, VistaRegistrarAreas vista){
        this.area=area;
        this.vista=vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.getBtnRegistrar())){
            this.area.setQ_cuposAutomovil(Integer.parseInt(this.vista.getAuto()));
            this.area.setQ_cuposBicicleta(Integer.parseInt(this.vista.getBicicleta()));
            this.area.setQ_cuposCamioneta(Integer.parseInt(this.vista.getCamioneta()));
            this.area.setQ_cuposCampero(Integer.parseInt(this.vista.getCampero()));
            this.area.setQ_cuposMotocicleta(Integer.parseInt(this.vista.getMotocicleta()));
            this.area.setQ_cuposVehiculoPesado(Integer.parseInt(this.vista.getVehiculoPesado()));
            this.area.setQ_cuposTotales(this.area.getQ_cuposAutomovil(), this.area.getQ_cuposBicicleta(),
                                        this.area.getQ_cuposCamioneta(), this.area.getQ_cuposCampero(),
                                        this.area.getQ_cuposMotocicleta(), this.area.getQ_cuposVehiculoPesado());
            System.out.println(this.area.getQ_cuposTotales());
        }
        if(e.getSource().equals(this.vista.getBtnVolver())){
            this.vista.dispose();
            VistaRegistroParqueadero vistaParqueadero= new VistaRegistroParqueadero();
            Parqueadero parqueadero=new Parqueadero();
            ControladorParqueadero_VistaRegistroParqueadero back= new ControladorParqueadero_VistaRegistroParqueadero (parqueadero, vistaParqueadero);
            vistaParqueadero.asignaOyentes(back);
            vistaParqueadero.mostrar();
        }
    }
}
