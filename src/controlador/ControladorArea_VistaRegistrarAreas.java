/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.AreaDAO;
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
            this.area.setQ_cuposDisponibles(this.area.getQ_cuposTotales());
            Home h = new Home();
            VistaHome vh = new VistaHome(); 
            ControladorHome ch = new ControladorHome(vh, h);
            this.area.getParqueadero().setK_parqueadero(h.getNomParqueaderos().size()+1);     
            this.area.setK_area(h.getNomParqueaderos().size()+1);
            ParqueaderoDAO parqueaderoBD=new ParqueaderoDAO(this.area.getParqueadero());
            AreaDAO areaBD=new AreaDAO(this.area);
            try {
                parqueaderoBD.registrarParquedero();
                areaBD.registrarArea();
            } catch (CaException ex) {
                Logger.getLogger(ControladorParqueadero_VistaRegistroParqueadero.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.vista.dispose();
            
            vh.asignaOyentes(ch);           
            vh.mostrar();
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

