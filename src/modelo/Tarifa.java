/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sebastian Wilches
 */
public class Tarifa {

    //Atributos asociados a la clase Tarifa
    private int k_tarifa;
    private String n_tipo;
    private double v_tarifa;
    private Parqueadero parqueadero;
    //Referencia parqueadero en la que se asociara la tarifa
    //parqueadero p;

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    //Metodo constructor
    public Tarifa() {
        this.k_tarifa = 0;
        this.n_tipo = null;
        this.v_tarifa = 0;
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

    public void setK_tarifa(int k_tarifa) {
        this.k_tarifa = k_tarifa;
    }

    public void setN_tipo(String n_tipo) {
        this.n_tipo = n_tipo;
    }

}
