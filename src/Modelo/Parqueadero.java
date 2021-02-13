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
public class Parqueadero {
    private String n_nivelServicio;
    private String n_localidad;
    private String n_parqueadero;
    private int k_parqueadero;
    private String n_calle;
    private String n_numero;
    private String n_barrio;

    public void setN_nivelServicio(String n_nivelServicio) {
        this.n_nivelServicio = n_nivelServicio;
    }

    public void setN_localidad(String n_localidad) {
        this.n_localidad = n_localidad;
    }

    public void setN_parqueadero(String n_parqueadero) {
        this.n_parqueadero = n_parqueadero;
    }

    public void setK_parqueadero(int k_parqueadero) {
        this.k_parqueadero = k_parqueadero;
    }

    public void setN_calle(String n_calle) {
        this.n_calle = n_calle;
    }

    public void setN_numero(String n_numero) {
        this.n_numero = n_numero;
    }

    public void setN_barrio(String n_barrio) {
        this.n_barrio = n_barrio;
    }
    public Parqueadero(){
        this.k_parqueadero=0;
        this.n_barrio=null;
        this.n_calle=null;
        this.n_localidad=null;
        this.n_nivelServicio=null;
        this.n_numero=null;
        this.n_parqueadero=null;
    }
}   
