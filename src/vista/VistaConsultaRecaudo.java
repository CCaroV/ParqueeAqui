/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.*;
/**
 *
 * @author Home
 */
public class VistaConsultaRecaudo extends JFrame {
    private final JLabel lblTitulo = new JLabel("Consulta de Recaudo");
    private final JLabel lblFormato = new JLabel("dd/mm/yyyy");
    private final JLabel lblTxtFechaInicial = new JLabel("Fecha Inicial:");
    private final JLabel lblTxtFechaFinal = new JLabel("Fecha Final:");
    private final JLabel lblTxtCantidad = new JLabel("Cantidad Recaudada:");
    private final JLabel lblCantidad = new JLabel();
    
    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);
    private final Font fontSubTitulo = new Font("Calibri", Font.BOLD, 20);
    
    private final JButton btnInicio = new JButton("Inicio");
    private final JButton btnConsultar = new JButton("Consultar");
    
    private final JTextField fldFechaInicial = new JTextField();
    private final JTextField fldFechaFinal = new JTextField();
    
    public VistaConsultaRecaudo() throws HeadlessException{
        super("Parqueé Aquí");
        
        Container k =getContentPane();
        k.setLayout(null);
        
        //Agrega los textos
        k.add(lblTitulo);
        k.add(lblFormato);
        k.add(lblTxtFechaInicial);
        k.add(lblTxtFechaFinal);
        k.add(lblTxtCantidad);
        k.add(lblCantidad);
        
        //Agrega los botones
        k.add(btnConsultar);
        k.add(btnInicio);
        
        //Agrega las cajas de texto
        k.add(fldFechaFinal);
        k.add(fldFechaInicial);
        
        // posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(120, 50, 450, 40);
        lblFormato.setFont(fontTexto);
        lblFormato.setBounds(230, 95, 150, 30);
        lblTxtFechaInicial.setFont(fontTexto);
        lblTxtFechaInicial.setBounds(100, 120, 300, 30);
        lblTxtFechaFinal.setFont(fontTexto);
        lblTxtFechaFinal.setBounds(100, 170, 300, 30);
        lblTxtCantidad.setFont(fontTexto);
        lblTxtCantidad.setBounds(100, 220, 300, 30);
        lblCantidad.setFont(fontTexto);
        lblCantidad.setBounds(250, 220, 300, 30);
        
        //Posición de los botones
        btnInicio.setBounds(100, 270, 85, 25);
        btnConsultar.setBounds(220, 270, 170, 25);

        //Posición de las cajas de texto
        fldFechaInicial.setBounds(200, 120, 150, 30);
        fldFechaFinal.setBounds(200, 170, 150, 30);
        
        
    }
    public void mostrar(){
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    public String getFechaFinal(){
        return this.fldFechaFinal.getText();
    }
    
    public String getFechaInicial(){
        return this.fldFechaInicial.getText();
    }
    
     public JButton getBtnVolver() {
        return btnInicio;
    }

    public JButton getBtnRegistrar() {
        return btnConsultar;
    }
    
    public void mensajeAlerta() {
        JOptionPane.showMessageDialog(this, "Llene todos los espacios con valores validos.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
