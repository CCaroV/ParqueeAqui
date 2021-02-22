/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Sebastian Wilches
 */
public class Tarifa2 {
    //Atributos asociados a la clase Tarifa2
    private int k_tarifa;
    private String n_tipo;
    private double v_tarifa;
    //Referencia parqueadero en la que se asociara la tarifa
    //parqueadero p;

    //Metodo constructor
    public Tarifa2(int k_tarifa, String n_tipo, double v_tarifa) {
        this.k_tarifa = k_tarifa;
        this.n_tipo = n_tipo;
        this.v_tarifa = v_tarifa;
        //this.p = p;
    }

    //Metodos get y set
    public int getK_tarifa() {
        return k_tarifa;
    }

    public String getN_tipo() {
        return n_tipo;
    }

    public double getV_tarifa() {
        return v_tarifa;
    }

    public void setV_tarifa(double v_tarifa) {
        this.v_tarifa = v_tarifa;
    }
    
    
}
