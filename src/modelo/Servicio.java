/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author User
 */
public class Servicio {

    private int k_servicio;
    private Date f_fechaHoraInicio;
    private Date f_fechaHoraSalida;
    private Slot slot;
    private Vehiculo vehiculo;

    public Servicio() {
        this.k_servicio = 0;
        this.f_fechaHoraInicio = null;
        this.f_fechaHoraSalida = null;
        this.slot = null;
        this.vehiculo = null;
    }

    public int getK_servicio() {
        return k_servicio;
    }

    public void setK_servicio(int k_servicio) {
        this.k_servicio = k_servicio;
    }

    public Date getF_fechaHoraInicio() {
        return f_fechaHoraInicio;
    }

    public void setF_fechaHoraInicio(Date f_fechaHoraInicio) {
        this.f_fechaHoraInicio = f_fechaHoraInicio;
    }

    public Date getF_fechaHoraSalida() {
        return f_fechaHoraSalida;
    }

    public void setF_fechaHoraSalida(Date f_fechaHoraSalida) {
        this.f_fechaHoraSalida = f_fechaHoraSalida;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
