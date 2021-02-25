/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Vehiculo;
import vista.VistaRegistrarVehiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Month;
import modelo.Home;
import modelo.Servicio;
import modelo.Slot;
import vista.VistaHome;

/**
 *
 * @author User
 */
public class ControladorVehiculo_VistaRegistrarVehiculo implements ActionListener {

    private final Vehiculo vehiculo;
    private final Servicio servicio;
    private final Slot slot;
    private final VistaRegistrarVehiculo vista;

    public ControladorVehiculo_VistaRegistrarVehiculo(Vehiculo vehiculo, Servicio servicio, Slot slot, VistaRegistrarVehiculo vista) {
        this.vehiculo = vehiculo;
        this.servicio = servicio;
        this.slot = slot;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.getBtnRegistrar())) {
            this.vehiculo.setN_tipo(this.vista.getTipoVehiculo());
            this.vehiculo.setK_vehiculo(this.vista.getPlaca());
            this.vista.setLblHora(getHora());
            this.vista.setLblFecha(getFecha());
            this.servicio.setF_fechaHoraInicio(Date.valueOf(getFecha()));
            
            
            
            this.servicio.setK_servicio(0);

        }
        if (e.getSource().equals(this.vista.getBtnVolver())) {
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

    private String getHora() {
        String minuto;
        String hora;
        if (LocalDateTime.now().getMinute() < 10) {
            minuto = "0" + String.valueOf(LocalDateTime.now().getMinute());
        } else {
            minuto = String.valueOf(LocalDateTime.now().getMinute());
        }
        if (LocalDateTime.now().getHour() < 10) {
            hora = "0" + String.valueOf(LocalDateTime.now().getMinute());
        } else {
            hora = String.valueOf(LocalDateTime.now().getHour());
        }
        return hora + ":" + minuto;
    }

    private String getFecha() {
        String dia;
        String mes;
        String anio = String.valueOf(LocalDateTime.now().getYear());
        if (LocalDateTime.now().getMonthValue() < 10) {
            mes = "0" + String.valueOf(LocalDateTime.now().getMonthValue());
        } else {
            mes = String.valueOf(LocalDateTime.now().getMonthValue());
        }
        if (LocalDateTime.now().getDayOfMonth() < 10) {
            dia = "0" + String.valueOf(LocalDateTime.now().getDayOfMonth());
        } else {
            dia = String.valueOf(LocalDateTime.now().getDayOfMonth());
        }
        return dia + "/" + mes + "/" + anio;
    }
}
