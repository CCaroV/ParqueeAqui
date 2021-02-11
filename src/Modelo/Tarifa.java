/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author fedc
 */
public class Tarifa {

    private String localidad;
    private String numLocalidad;
    private int factorZona;
    private int numNiveles;
    private int tarifa;
    private boolean subterraneo;
    private String tipoVehiculo;

    public Tarifa() {
        localidad = null;
        numLocalidad = null;
        factorZona = 0;
        numNiveles = 0;
        subterraneo = false;
    }

    public Tarifa(String Localidad, String num) {
        this.localidad = Localidad;
        this.numLocalidad = num;
    }

    public void setSubterraneo(boolean iSubterraneo) {
        this.subterraneo = iSubterraneo;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
        System.out.println(this.localidad);
    }

    public void setNumLocalidad(String numLocalidad) {
        this.numLocalidad = numLocalidad;
        System.out.println(this.numLocalidad);
    }

    public void setFactorZona(int factorZona) {
        this.factorZona = factorZona;
    }

    public void setNumNiveles(int numNiveles) {
        this.numNiveles = numNiveles;
        System.out.println(this.numNiveles);
    }

    public int calcularTarifa() {
        return this.tarifa;
    }

}
