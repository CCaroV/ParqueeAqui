/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public class Parqueadero {

    private float n_nivelServicio;
    private String n_localidad;
    private String n_parqueadero;
    private int k_parqueadero;
    private String n_direccion;
    private int v_pisos;
    private boolean i_subterraneo;

    public float getN_nivelServicio() {
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

    public int getV_pisos() {
        return v_pisos;
    }

    public boolean isI_subterraneo() {
        return i_subterraneo;
    }

    //Determinacion del factor nivel de servicio(FNS) dependiendo de la localidad
    public void setN_nivelServicio(String n_localidad) {
        if (n_localidad.equals("Usaquen, 1") || n_localidad.equals("Chapinero, 2") || n_localidad.equals("Santa Fe, 3")
                || n_localidad.equals("Suba, 11") || n_localidad.equals("Barrios Unidos, 12")
                || n_localidad.equals("Teusaquillo, 13") || n_localidad.equals("Los Mártires, 14")
                || n_localidad.equals("Antonio Nariño, 15") || n_localidad.equals("La Candelaría, 17")) {
            this.n_nivelServicio = 1.0f;
        } else {
            this.n_nivelServicio = 0.8f;
        }
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

    public void setV_pisos(int v_pisos) {
        this.v_pisos = v_pisos;
    }

    public void setI_subterraneo(boolean i_subterraneo) {
        this.i_subterraneo = i_subterraneo;
    }

    public Parqueadero() {
        this.k_parqueadero = 0;
        this.n_localidad = null;
        this.n_nivelServicio = 0.8f;
        this.n_direccion = "";
        this.n_parqueadero = null;
        this.v_pisos = 0;
        this.i_subterraneo = false;
    }
}
