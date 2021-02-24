/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import dao.ServiceLocator;
import modelo.Contrato;
import java.sql.*;
import modelo.Vehiculo;
import util.CaException;

/**
 *
 * @author chris
 */
public class ContratoDAO {

    Contrato contrato;
    Vehiculo vehiculo;

    public ContratoDAO(Contrato contrato, Vehiculo vehiculo) {
        this.contrato = contrato;
        this.vehiculo = vehiculo;
    }

    public void registrarContrato() throws CaException {
        try {
            String strSQL = "INSERT INTO caontrato (k_contrato, f_fechainicio, f_fechafinal, "
                    + "v_valorcontrato, i_estadocuenta, k_parqueadero, k_vehiculo, k_cliente) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, this.contrato.getK_contrato());
            prepStmt.setString(2, this.contrato.getF_fechaInicio());
            prepStmt.setString(3, this.contrato.getF_fechaFinal());
            prepStmt.setFloat(4, this.contrato.getV_valorContrato());
            prepStmt.setBoolean(5, this.contrato.isI_estadoContrato());
        } catch (SQLException e) {
            throw new CaException("Contrato", "No se pudo crear el contrato " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();

        }
    }

}
