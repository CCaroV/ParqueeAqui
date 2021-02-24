/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import dao.ServiceLocator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Pago;
import util.CaException;

/**
 *
 * @author chris
 */
public class PagoDAO {

    Pago pago;

    public PagoDAO(Pago pago) {
        this.pago = pago;
    }

    public void insertarPago() throws CaException {
        try {
            String strSQL = "INSERT INTO pago (k_pago, n_formapago, v_valorpagado, k_servicio)"
                    + "VALUES (?, ?, ?, ?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, pago.getK_pago());
            prepStmt.setString(2, pago.getN_formaPago());
            prepStmt.setFloat(3, pago.getV_valorPagado());
        } catch (SQLException e) {
            throw new CaException("Pago", "No se pudo generar el pago" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

}
