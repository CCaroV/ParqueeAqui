/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author fedc
 */
public class Home {
    
    private ArrayList<String> nomParqueaderos;

    public ArrayList<String> getNomParqueaderos() {
        return nomParqueaderos;
    }

    public void setNomParqueaderos(ArrayList<String> nomParqueaderos) {
        this.nomParqueaderos = nomParqueaderos;
    }

    public Home() {
        this.nomParqueaderos=new ArrayList<String>();
    }
    
    public void agregarParqueadero(String nomParqueadero){
        this.nomParqueaderos.add(nomParqueadero);
    }
   
}
