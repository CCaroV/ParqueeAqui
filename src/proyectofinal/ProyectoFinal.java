/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

<<<<<<< HEAD
import Controlador.ControladorArea_VistaRegistrarAreas;
import Controlador.ControladorParqueadero_VistaRegistroParqueadero;
import Controlador.ControladorRegistroSalida;
import Controlador.ControladorTarifa;
import Modelo.Area;
import Modelo.Parqueadero;
=======
import Controlador.ControladorHome;
import Controlador.ControladorRegistroSalida;
import Controlador.ControladorTarifa;
import Modelo.Home;
import Modelo.RegistroSalida;
>>>>>>> main
import Modelo.Tarifa;
import Vista.VistaHome;
import Vista.VistaRegistroSalida;
import Vista.VistaRegistroParqueadero;
import Vista.VistaVerificarCupo;
import Vista.VistaRegistrarVehiculo;
import Vista.VistaRegistrarAreas;
import Vista.VistaConsultaVehiculo;
import Vista.VistaConsultaFlujo;
import Vista.VistaConsultaRecaudo;
import javax.swing.UIManager;

/**
 *
 * @author fedc
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }

        Parqueadero m = new Parqueadero();
        VistaRegistroParqueadero v = new VistaRegistroParqueadero();
        ControladorParqueadero_VistaRegistroParqueadero c = new ControladorParqueadero_VistaRegistroParqueadero(m, v);
        v.asignaOyentes(c);
        v.mostrar();

        VistaVerificarCupo vi = new VistaVerificarCupo();
        //vi.mostrar();

        VistaRegistroSalida vii = new VistaRegistroSalida();
        ControladorRegistroSalida cii = new ControladorRegistroSalida();
        vii.asignaOyentes(cii);
        //vii.mostrar();

        Home miii = new Home();
        VistaHome viii = new VistaHome();
        ControladorHome ciii = new ControladorHome(viii, miii);
        viii.asignaOyentes(ciii);
        //viii.mostrar();
        
        VistaRegistrarVehiculo viv = new VistaRegistrarVehiculo();
        viv.mostrar();
        
<<<<<<< HEAD
        /*VistaRegistrarAreas vv = new VistaRegistrarAreas();
        Area a=new Area();
        ControladorArea_VistaRegistrarAreas cavra=new ControladorArea_VistaRegistrarAreas(a,vv);
        vv.asignarOyente(cavra);
        vv.mostrar();*/
=======
        VistaRegistrarAreas vv = new VistaRegistrarAreas();
        //vv.mostrar();
        
        VistaConsultaVehiculo vvi = new VistaConsultaVehiculo();
        vvi.mostrar();
        
        VistaConsultaFlujo vvii = new VistaConsultaFlujo();
        vvii.mostrar();
        
        VistaConsultaRecaudo vviii = new VistaConsultaRecaudo();
        vviii.mostrar();
>>>>>>> main
        
    }

}
