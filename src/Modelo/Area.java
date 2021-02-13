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
    private String n_tipoArea;

    public void setK_area(int k_area) {
        this.k_area = k_area;
    }

    public void setQ_cuposDisponibles(int q_cuposDisponibles) {
        this.q_cuposDisponibles = q_cuposDisponibles;
    }

    public void setQ_cuposTotales(int q_cuposTotales) {
        this.q_cuposTotales = q_cuposTotales;
    }

    public void setN_tipoArea(String n_tipoArea) {
        this.n_tipoArea = n_tipoArea;
    }

    public Area() {
        this.k_area = 0;
        this.q_cuposDisponibles = 0;
        this.q_cuposTotales = 0;
        this.n_tipoArea = null;
    }
    
}
