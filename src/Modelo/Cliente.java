/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Cliente {
    private int k_cliente;
    private String n_nombre;
    private String n_apellido;
    private ArrayList<String> v_telefono= new ArrayList<String>();
    private String n_calle;
    private String n_numero;
    private String n_barrio;

    public void setK_cliente(int k_cliente) {
        this.k_cliente = k_cliente;
    }

    public void setN_nombre(String n_nombre) {
        this.n_nombre = n_nombre;
    }

    public void setN_apellido(String n_apellido) {
        this.n_apellido = n_apellido;
    }

    public void setV_telefono(ArrayList<String> v_telefono) {
        this.v_telefono = v_telefono;
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
    public Cliente() {
        this.k_cliente = 0;
        this.n_nombre = null;
        this.n_apellido = null;
        this.n_calle = null;
        this.n_numero = null;
        this.n_barrio = null;
    }
    
}
