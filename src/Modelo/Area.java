/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public class Area {
    private int k_area;
    private int q_cuposDisponibles;
    private int q_cuposTotales;
    private int q_cuposAutomovil;
    private int q_cuposBicicleta;
    private int q_cuposCamioneta;
    private int q_cuposCampero;
    private int q_cuposMotocicleta;
    private int q_cuposVehiculoPesado;
    public void setK_area(int k_area) {
        this.k_area = k_area;
    }

    public void setQ_cuposDisponibles(int q_cuposDisponibles) {
        this.q_cuposDisponibles = q_cuposDisponibles;
    }

    public void setQ_cuposTotales(int q_cuposTotales) {
        this.q_cuposTotales = q_cuposTotales;
    }

    public void setQ_cuposAutomovil(int q_cuposAutomovil) {
        this.q_cuposAutomovil = q_cuposAutomovil;
    }

    public void setQ_cuposBicicleta(int q_cuposBicicleta) {
        this.q_cuposBicicleta = q_cuposBicicleta;
    }

    public void setQ_cuposCamioneta(int q_cuposCamioneta) {
        this.q_cuposCamioneta = q_cuposCamioneta;
    }

    public void setQ_cuposCampero(int q_cuposCampero) {
        this.q_cuposCampero = q_cuposCampero;
    }

    public void setQ_cuposMotocicleta(int q_cuposMotocicleta) {
        this.q_cuposMotocicleta = q_cuposMotocicleta;
    }

    public void setQ_cuposVehiculoPesado(int q_cuposVehiculoPesado) {
        this.q_cuposVehiculoPesado = q_cuposVehiculoPesado;
    }

    public Area() {
        this.k_area = 0;
        this.q_cuposDisponibles = 0;
        this.q_cuposTotales = 0;
        this.q_cuposAutomovil = 0;
        this.q_cuposBicicleta = 0;
        this.q_cuposCamioneta = 0;
        this.q_cuposCampero = 0;
        this.q_cuposMotocicleta = 0;
        this.q_cuposVehiculoPesado = 0;
    }
}
