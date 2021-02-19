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
    private String n_direccion;

    public String getN_nivelServicio() {
        return n_nivelServicio;
    }

    public String getN_localidad() {
        return n_localidad;
    }

    public String getN_parqueadero() {
        return n_parqueadero;
    }

    public int getK_parqueadero() {
        return k_parqueadero;
    }

    public String getN_direccion() {
        return n_direccion;
    }
    
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
    public void setN_direccion(String n_direccion) {
        this.n_direccion = n_direccion;
    }
    public Parqueadero(){
        this.k_parqueadero=0;
        this.n_localidad=null;
        this.n_nivelServicio=null;
        this.n_direccion=null;
        this.n_parqueadero=null;
    }
}   
