/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorVehiculo_VistaRegistrarVehiculo;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Home
 */
public class VistaRegistrarVehiculo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -5208906840336992088L;
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
    
    private JComboBox boxTipoVehiculo;
    private final String tipoVehiculo[]= {"Automovil","Camioneta","Campero","Vehiculo Pesado","Motocicleta","Bicicleta"};
    
    
    
    private final JTextField fldPlaca = new JTextField();

    public VistaRegistrarVehiculo() throws HeadlessException {
        super("Parqueé Aquí");

        Container k = getContentPane();
        k.setLayout(null);

        // Agrega los textos
        k.add(lblTitulo);
        k.add(lblTipoVehiculo);
        k.add(lblPlaca);
        k.add(lblHora);
        k.add(lblFecha);
        k.add(lblFechaEntrada);
        k.add(lblHoraEntrada);

        // Agrega los botones
        k.add(btnRegistrar);
        k.add(btnVolver);

        // Agrega las cajas de texto
        k.add(fldPlaca);

        // posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(250, 50, 450, 30);
        lblTipoVehiculo.setFont(fontTexto);
        lblTipoVehiculo.setBounds(60, 150, 300, 30);
        lblPlaca.setFont(fontTexto);
        lblPlaca.setBounds(400, 150, 300, 30);
        lblHora.setFont(fontTexto);
        lblHora.setBounds(240, 200, 300, 30);
        lblFecha.setFont(fontTexto);
        lblFecha.setBounds(520, 200, 300, 30);
        lblHoraEntrada.setFont(fontTexto);
        lblHoraEntrada.setBounds(120, 200, 300, 30);
        lblFechaEntrada.setFont(fontTexto);
        lblFechaEntrada.setBounds(400, 200, 300, 30);

        // Posición de los botones
        btnVolver.setBounds(250, 270, 85, 25);
        btnRegistrar.setBounds(370, 270, 170, 25);

        // Posición de las cajas de texto
        fldPlaca.setBounds(450, 150, 150, 30);
        
    }

    public void mostrar() {
        setSize(800, 400);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public String getPlaca() {
        return this.fldPlaca.getText();
    }

    
    public String getTipoVehiculo(){
         return this.boxTipoVehiculo.getSelectedItem().toString();
    }
     
     
    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }
    
    public JLabel getLblHora() {
        return lblHora;
    }

    public void setLblHora(String lblHora) {
        this.lblHora.setText(lblHora);
    }

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public void setLblFecha(String lblFecha) {
        this.lblFecha.setText(lblFecha);
    }

    public void mensajeAlerta() {
        JOptionPane.showMessageDialog(this, "Llene todos los espacios con valores validos.", "Alerta",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void asignaOyentes (ControladorVehiculo_VistaRegistrarVehiculo c) {
        btnVolver.addActionListener(c);
        btnRegistrar.addActionListener(c);
    }

    

}
