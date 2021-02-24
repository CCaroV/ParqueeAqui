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
public class Pago {
    private int k_pago;
    private String n_formaPago;
    private float v_valorPagado;

    public void setK_pago(int k_pago) {
        this.k_pago = k_pago;
    }

    public void setN_formaPago(String n_formaPago) {
        this.n_formaPago = n_formaPago;
    }

    public void setV_valorPagado(float v_valorPagado) {
        this.v_valorPagado = v_valorPagado;
    }

    public Pago() {
        this.k_pago = 0;
        this.n_formaPago = null;
        this.v_valorPagado = 0;
    }
    
}
