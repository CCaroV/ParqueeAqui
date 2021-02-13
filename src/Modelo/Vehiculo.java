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
public class Vehiculo {
    private String k_vehiculo;
    private String n_modelo;
    private String n_marca;
    private String n_tipo;
    private String n_color;

    public void setK_vehiculo(String k_vehiculo) {
        this.k_vehiculo = k_vehiculo;
    }

    public void setN_modelo(String n_modelo) {
        this.n_modelo = n_modelo;
    }

    public void setN_marca(String n_marca) {
        this.n_marca = n_marca;
    }

    public void setN_tipo(String n_tipo) {
        this.n_tipo = n_tipo;
    }

    public void setN_color(String n_color) {
        this.n_color = n_color;
    }

    public Vehiculo() {
        this.k_vehiculo = "000xxx";
        this.n_modelo = null;
        this.n_marca = null;
        this.n_tipo = null;
        this.n_color = null;
    }
    
}
