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
public class Slot {
    private int k_slot;
    private boolean i_estado;

    public void setK_slot(int k_slot) {
        this.k_slot = k_slot;
    }

    public void setI_estado(boolean i_estado) {
        this.i_estado = i_estado;
    }

    public Slot() {
        this.k_slot = 0;
        this.i_estado = false;
    }
    
}
