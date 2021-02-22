/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author fedc
 */
public class VistaFactura extends JFrame {

    private final JLabel lblTitulo = new JLabel("Factura");
    private final JLabel lblTxtPlaca = new JLabel("Placa:");
    private final JLabel lblPlaca = new JLabel();
    private final JLabel lblTxtModelo = new JLabel("Modelo:");
    private final JLabel lblModelo = new JLabel();
    private final JLabel lblTxtFechaEntrada = new JLabel("Fecha de entrada:");
    private final JLabel lblFechaEntrada = new JLabel();
    private final JLabel lblTxtHoraEntrada = new JLabel("Hora de entrada:");
    private final JLabel lblHoraEntrada = new JLabel();
    private final JLabel lblTxtMinutos = new JLabel("Minutos");
    private final JLabel lblMinutos = new JLabel();
    private final JLabel lblTxtPago = new JLabel("Valor a pagar:");
    private final JLabel lblPago = new JLabel();
    private final JLabel lblTxtCedula = new JLabel("Cédula:");
    private final JLabel lblCedula = new JLabel();
    private final JLabel lblTxtColor = new JLabel("Color:");
    private final JLabel lblColor = new JLabel();
    private final JLabel lblTxtFechaSalida = new JLabel("Fecha de salida:");
    private final JLabel lblFechaSalida = new JLabel();
    private final JLabel lblTxtHoraSalida = new JLabel("Hora de salida:");
    private final JLabel lblHoraSalida = new JLabel();//4433211000809907 Carlos Rodríguez 
    private final JLabel lblTxtTarifa = new JLabel("Tarifa:");
    private final JLabel lblTarifa = new JLabel();

    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);

    public VistaFactura() throws HeadlessException {
        super("Parueé Aquí");
        Container c = getContentPane();
        
        // Se Agregan todos los textos
        c.add(lblTitulo);
        c.add(lblTxtPlaca);
        c.add(lblPlaca);
        c.add(lblTxtModelo);
        c.add(lblModelo);
        c.add(lblTxtFechaEntrada);
        c.add(lblFechaEntrada);
        c.add(lblTxtHoraEntrada);
        c.add(lblHoraEntrada);
        c.add(lblTxtMinutos);
        c.add(lblMinutos);
        c.add(lblTxtPago);
        c.add(lblPago);
        c.add(lblTxtCedula);
        c.add(lblCedula);
        c.add(lblTxtColor);
        c.add(lblColor);
        c.add(lblTxtFechaSalida);
        c.add(lblFechaSalida);
        c.add(lblTxtHoraSalida);
        c.add(lblHoraSalida);
        c.add(lblTxtTarifa);
        c.add(lblTarifa);

    }

}
