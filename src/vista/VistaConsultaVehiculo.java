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
public class VistaConsultaVehiculo extends JFrame{

    private final JLabel lblTitulo = new JLabel("Consulta de Vehiculo");
    private final JLabel lblPlaca = new JLabel("Placa:");
    private final JLabel lblTxtNomPropietario = new JLabel("Propietario:");
    private final JLabel lblTxtTipoVehiculo = new JLabel("Tipo de vehículo:");
    private final JLabel lblTxtCedula = new JLabel("Cedula:");
    private final JLabel lblTxtServicio = new JLabel("Tipo de servicio:");
    private final JLabel lblTxtMarca = new JLabel("Marca:");
    private final JLabel lblTxtModelo = new JLabel("Modelo:");
    private final JLabel lblTxtColor = new JLabel("Color");
    private final JLabel lblTxtHoraEntrada = new JLabel("Hora de entrada:");
    private final JLabel lblTxtFechaEntrada = new JLabel("Fecha de entrada:");
    private final JLabel lblTxtHoraSalida = new JLabel("Hora de salida:");
    private final JLabel lblTxtFechaSalida = new JLabel("Fecha de salida:");
    private final JLabel lblTxtTelefono = new JLabel("Telefono:");
    
    private  JLabel lblNomPropietario = new JLabel();
    private  JLabel lblTipoVehiculo = new JLabel();
    private  JLabel lblCedula = new JLabel();
    private  JLabel lblServicio = new JLabel();
    private  JLabel lblMarca = new JLabel();
    private  JLabel lblModelo = new JLabel();
    private  JLabel lblColor = new JLabel();
    private  JLabel lblHoraEntrada = new JLabel();
    private  JLabel lblFechaEntrada = new JLabel();
    private  JLabel lblHoraSalida = new JLabel();
    private  JLabel lblFechaSalida = new JLabel();
    private  JLabel lblTelefono = new JLabel();
    
    
    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);
    private final Font fontSubTitulo = new Font("Calibri", Font.BOLD, 20);
    
    private final JButton btnVolver = new JButton("Volver");
    private final JButton btnConsultar = new JButton("Consultar");
    
    private final JTextField fldPlaca = new JTextField();
    private final JTextField fldFecha = new JTextField();
    
    public VistaConsultaVehiculo() throws HeadlessException {
        super("Parqueé Aquí");
        
        Container k =getContentPane();
        k.setLayout(null);
        
        //Agrega los textos
        k.add(lblTitulo);
        k.add(lblPlaca);
        k.add(lblTxtNomPropietario);
        k.add(lblTxtTipoVehiculo);
        k.add(lblTxtCedula);
        k.add(lblTxtServicio);
        k.add(lblTxtMarca);
        k.add(lblTxtModelo);
        k.add(lblTxtColor);
        k.add(lblTxtHoraSalida);
        k.add(lblTxtFechaSalida);
        k.add(lblTxtFechaEntrada);
        k.add(lblTxtHoraEntrada);
        k.add(lblTxtTelefono);
        
        //Agrega las respuestas a los textos
        k.add(lblNomPropietario);
        k.add(lblTipoVehiculo);
        k.add(lblCedula);
        k.add(lblServicio);
        k.add(lblMarca);
        k.add(lblModelo);
        k.add(lblColor);
        k.add(lblFechaEntrada);
        k.add(lblHoraEntrada);
        k.add(lblFechaSalida);
        k.add(lblHoraSalida);
        k.add(lblTelefono);
        
        //Agrega los botones
        k.add(btnConsultar);
        k.add(btnVolver);
        
        //Agrega las cajas de texto
        k.add(fldFecha);
        k.add(fldPlaca);
        
        // posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(270, 50, 450, 40);
        lblPlaca.setFont(fontTexto);
        lblPlaca.setBounds(60, 120, 300, 30);
        lblTxtFechaEntrada.setFont(fontTexto);
        lblTxtFechaEntrada.setBounds(60, 170, 300, 30);
        lblTxtNomPropietario.setFont(fontTexto);
        lblTxtNomPropietario.setBounds(60, 220, 300, 30);
        lblTxtTipoVehiculo.setFont(fontTexto);
        lblTxtTipoVehiculo.setBounds(60, 270, 300, 30);
        lblTxtCedula.setFont(fontTexto);
        lblTxtCedula.setBounds(60, 320, 300, 30);
        lblTxtServicio.setFont(fontTexto);
        lblTxtServicio.setBounds(60, 370, 300, 30);
        lblTxtMarca.setFont(fontTexto);
        lblTxtMarca.setBounds(370, 220, 300, 30);
        lblTxtModelo.setFont(fontTexto);
        lblTxtModelo.setBounds(370, 270, 300, 30);
        lblTxtColor.setFont(fontTexto);
        lblTxtColor.setBounds(370, 320, 300, 30);
        lblTxtFechaSalida.setFont(fontTexto);
        lblTxtFechaSalida.setBounds(370, 170, 300, 30);
        lblTxtHoraSalida.setFont(fontTexto);
        lblTxtHoraSalida.setBounds(370, 370, 300, 30);
        lblTxtHoraEntrada.setFont(fontTexto);
        lblTxtHoraEntrada.setBounds(370, 120, 300, 30);
        lblTxtTelefono.setFont(fontTexto);
        lblTxtTelefono.setBounds(60, 420, 300, 30);
        
        
        //Posición de los botones
        btnVolver.setBounds(200, 450, 85, 25);
        btnConsultar.setBounds(320, 450, 170, 25);

        //Posición de las cajas de texto
        fldPlaca.setBounds(200, 120, 150, 30);
        fldFecha.setBounds(200, 170, 150, 30);
        
        //Posición de los pedidos a la base de datos
        lblNomPropietario.setFont(fontTexto);
        lblNomPropietario.setBounds(200, 220, 300, 30);
        lblTipoVehiculo.setFont(fontTexto);
        lblTipoVehiculo.setBounds(200, 270, 300, 30);
        lblCedula.setFont(fontTexto);
        lblCedula.setBounds(200, 320, 300, 30);
        lblServicio.setFont(fontTexto);
        lblServicio.setBounds(200, 370, 300, 30);
        lblMarca.setFont(fontTexto);
        lblMarca.setBounds(480, 220, 300, 30);
        lblModelo.setFont(fontTexto);
        lblModelo.setBounds(480, 270, 300, 30);
        lblColor.setFont(fontTexto);
        lblColor.setBounds(480, 320, 300, 30);
        lblFechaSalida.setFont(fontTexto);
        lblFechaSalida.setBounds(480, 170, 300, 30);
        lblHoraSalida.setFont(fontTexto);
        lblHoraSalida.setBounds(480, 370, 300, 30);
        lblHoraEntrada.setFont(fontTexto);
        lblHoraEntrada.setBounds(480, 120, 300, 30);
        lblTelefono.setFont(fontTexto);
        lblTelefono.setBounds(200, 420, 300, 30);
    }
    
    public void mostrar(){
        setSize(750, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public String getPlaca(){
        return this.fldPlaca.getText();
    }
    
    public String getFecha(){
        return this.fldFecha.getText();
    }
    
    
    
    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JButton getBtnRegistrar() {
        return btnConsultar;
    }
    
    public void mensajeAlerta() {
        JOptionPane.showMessageDialog(this, "Llene todos los espacios con valores validos.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    /*public void asignaOyentes(Controlador c) {
        btnVolver.addActionListener(c);
        btnRegistrar.addActionListener(c);
    }*/
}
