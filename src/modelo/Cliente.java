/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Cliente {

    private int k_cliente;
    private String n_nombre;
    private String n_apellido;
    private ArrayList<String> v_telefono = new ArrayList<String>();
    private String n_direccion;

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

    public Cliente() {
        this.k_cliente = 0;
        this.n_nombre = null;
        this.n_apellido = null;
        this.n_direccion = null;
    }

    public int getK_cliente() {
        return k_cliente;
    }

    public String getN_nombre() {
        return n_nombre;
    }

    public String getN_apellido() {
        return n_apellido;
    }

    public ArrayList<String> getV_telefono() {
        return v_telefono;
    }

    public String getN_direccion() {
        return n_direccion;
    }

    public void setN_direccion(String n_direccion) {
        this.n_direccion = n_direccion;
    }

}
