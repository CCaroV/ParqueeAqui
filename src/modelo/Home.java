/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author fedc
 */
public class Home {

    private ArrayList<String> nomParqueaderos = new ArrayList<>();

    public Home() {
        
    }

    public ArrayList<String> getNomParqueaderos() {
        return nomParqueaderos;
    }

    public void setNomParqueaderos(ArrayList<String> nomParqueaderos) {
        this.nomParqueaderos = nomParqueaderos;
    }

    public void agregarParqueadero(String nomParqueadero) {
        this.nomParqueaderos.add(nomParqueadero);
    }

}
