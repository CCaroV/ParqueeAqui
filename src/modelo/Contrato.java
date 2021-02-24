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
public class Contrato {

    private boolean i_estadoContrato;
    private int k_contrato;
    private String f_fechaInicio;
    private String f_fechaFinal;
    private float v_valorContrato;

    public Contrato() {
        this.i_estadoContrato = false;
        this.k_contrato = 0;
        this.f_fechaInicio = null;
        this.f_fechaFinal = null;
        this.v_valorContrato = 0;
    }

    public void setI_estadoContrato(boolean i_estadoContrato) {
        this.i_estadoContrato = i_estadoContrato;
    }

    public boolean isI_estadoContrato() {
        return i_estadoContrato;
    }

    public int getK_contrato() {
        return k_contrato;
    }

    public String getF_fechaInicio() {
        return f_fechaInicio;
    }

    public String getF_fechaFinal() {
        return f_fechaFinal;
    }

    public float getV_valorContrato() {
        return v_valorContrato;
    }

    public void setK_contrato(int k_contrato) {
        this.k_contrato = k_contrato;
    }

    public void setF_fechaInicio(String f_fechaInicio) {
        this.f_fechaInicio = f_fechaInicio;
    }

    public void setF_fechaFinal(String f_fechaFinal) {
        this.f_fechaFinal = f_fechaFinal;
    }

    public void setV_valorContrato(float v_valorContrato) {
        this.v_valorContrato = v_valorContrato;
    }

}
