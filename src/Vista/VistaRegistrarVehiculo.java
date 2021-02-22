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
 * @author Home
 */
public class VistaRegistrarVehiculo extends JFrame{
    
    private final JLabel lblTitulo = new JLabel("Registro de Vehículo");
    private final JLabel lblTipoVehiculo = new JLabel("Tipo de Vehículo:");
    private final JLabel lblPlaca = new JLabel("Placa:");
    private final JLabel lblHoraEntrada = new JLabel("Hora de entrada:");
    private final JLabel lblFechaEntrada = new JLabel("Fecha de Entrada:");
    
    private JLabel lblHora = new JLabel();
    private JLabel lblFecha = new JLabel();
    
    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);
    
    private final JButton btnVolver = new JButton("Volver");
    private final JButton btnRegistrar = new JButton("Registrar");

    private final JTextField fldTipoVehiculo = new JTextField();
    private final JTextField fldPlaca = new JTextField();
    
    public VistaRegistrarVehiculo() throws HeadlessException {
        super("Parqueé Aquí");
        
        Container k =getContentPane();
        k.setLayout(null);
        
        //Agrega los textos
        k.add(lblTitulo);
        k.add(lblTipoVehiculo);
        k.add(lblPlaca);
        k.add(lblHora);
        k.add(lblFecha);
        k.add(lblFechaEntrada);
        k.add(lblHoraEntrada);
        
        //Agrega los botones
        k.add(btnRegistrar);
        k.add(btnVolver);
        
        //Agrega las cajas de texto
        k.add(fldPlaca);
        k.add(fldTipoVehiculo);
        
        // posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(250, 50, 450, 30);
        lblTipoVehiculo.setFont(fontTexto);
        lblTipoVehiculo.setBounds(60, 150, 300, 30);
        lblPlaca.setFont(fontTexto);
        lblPlaca.setBounds(400, 150, 300, 30);
        lblHora.setFont(fontTexto);
        lblHora.setBounds(280, 200, 300, 30);
        lblFecha.setFont(fontTexto);
        lblFecha.setBounds(530, 200, 300, 30);
        lblHoraEntrada.setFont(fontTexto);
        lblHoraEntrada.setBounds(120, 200, 300, 30);
        lblFechaEntrada.setFont(fontTexto);
        lblFechaEntrada.setBounds(400, 200, 300, 30);
        
        //Posición de los botones
        btnVolver.setBounds(250, 270, 85, 25);
        btnRegistrar.setBounds(370, 270, 170, 25);

        //Posición de las cajas de texto
        fldPlaca.setBounds(450, 150, 150, 30);
        fldTipoVehiculo.setBounds(180, 150, 150, 30);
        
        
    }
    
    
    public void mostrar(){
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public String getPlaca(){
        return this.fldPlaca.getText();
    }
    
    public String getTipoVehiculo(){
        return this.fldTipoVehiculo.getText();
    }
    
    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }
    
    public void mensajeAlerta() {
        JOptionPane.showMessageDialog(this, "Llene todos los espacios con valores validos.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
