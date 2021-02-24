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
public class Slot {

    private int k_slot;
    private boolean i_estado;
    private Parqueadero parqueadero;
    private Area area;

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public Area getArea() {
        return area;
    }

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

    public int getK_slot() {
        return k_slot;
    }

    public boolean isI_estado() {
        return i_estado;
    }

}
