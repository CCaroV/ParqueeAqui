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
public class VistaConsultaFlujo  extends JFrame{
    
    private final JLabel lblTitulo = new JLabel("Consulta de Flujo");
    private final JLabel lblCantidad = new JLabel("Cantidad de vehiculos:");
    private final JLabel lblTxtAuto = new JLabel("Automovil:");
    private final JLabel lblTxtCamioneta = new JLabel("Camioneta:");
    private final JLabel lblTxtCampero = new JLabel("Campero");
    private final JLabel lblTxtVehiculoPesado = new JLabel("Vehiculo pesado:");
    private final JLabel lblTxtMoto = new JLabel("Motocicleta:");
    private final JLabel lblTxtBicicleta = new JLabel("Bicicleta:");
    private final JLabel lblTxtFechaConsulta = new JLabel("Fecha de consulta:");

    private final JComboBox boxFecha;
    private final String Fecha[] = new String[10];
    
    private  JLabel lblAuto = new JLabel();
    private  JLabel lblCamioneta = new JLabel();
    private  JLabel lblCampero = new JLabel();
    private  JLabel lblVehiculoPesado = new JLabel();
    private  JLabel lblMatricula = new JLabel();
    private  JLabel lblMotocicleta = new JLabel();
    private  JLabel lblBicicleta = new JLabel();
   
    
    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);
    private final Font fontSubTitulo = new Font("Calibri", Font.BOLD, 20);
    
    private final JButton btnVolver = new JButton("Volver");
    private final JButton btnConsultar = new JButton("Consultar");
    
    
    public VistaConsultaFlujo() throws HeadlessException {
        super("Parqueé Aquí");
        this.boxFecha = new JComboBox(Fecha);
        Container k =getContentPane();
        k.setLayout(null);
        
        //Agrega los textos
        k.add(lblTitulo);
        k.add(lblTxtFechaConsulta);
        k.add(lblCantidad);
        k.add(lblTxtAuto);
        k.add(lblTxtCamioneta);
        k.add(lblTxtCampero);
        k.add(lblTxtVehiculoPesado);
        k.add(lblTxtMoto);
        k.add(lblTxtBicicleta);
      
        
        //Agrega las respuestas a los textos
        k.add(lblAuto);
        k.add(lblCamioneta);
        k.add(lblCampero);
        k.add(lblVehiculoPesado);
        k.add(lblMotocicleta);
        k.add(lblBicicleta);
        
        //Agrega los botones
        k.add(btnConsultar);
        k.add(btnVolver);
        
        //Agrega el combobox
        k.add(boxFecha);
        
        // posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(250, 50, 450, 40);
        lblTxtFechaConsulta.setFont(fontTexto);
        lblTxtFechaConsulta.setBounds(210, 120, 450, 40);
        lblCantidad.setFont(fontSubTitulo);
        lblCantidad.setBounds(250, 170, 300, 30);
        lblTxtAuto.setFont(fontTexto);
        lblTxtAuto.setBounds(220, 220, 300, 30);
        lblTxtCamioneta.setFont(fontTexto);
        lblTxtCamioneta.setBounds(220, 270, 300, 30);
        lblTxtCampero.setFont(fontTexto);
        lblTxtCampero.setBounds(220, 320, 300, 30);
        lblTxtVehiculoPesado.setFont(fontTexto);
        lblTxtVehiculoPesado.setBounds(220, 370, 300, 30);
        lblTxtMoto.setFont(fontTexto);
        lblTxtMoto.setBounds(220, 420, 300, 30);
        lblTxtBicicleta.setFont(fontTexto);
        lblTxtBicicleta.setBounds(220, 470, 300, 30);
        
        
        
        //Posición de los botones
        btnVolver.setBounds(200, 520, 85, 25);
        btnConsultar.setBounds(320, 520, 170, 25);

        //Posición de el combobox
        boxFecha.setBounds(330, 120, 150, 30);
        
        
        
        //Posición de los pedidos a la base de datos
        lblAuto.setFont(fontTexto);
        lblAuto.setBounds(420, 220, 300, 30);
        lblCamioneta.setFont(fontTexto);
        lblCamioneta.setBounds(420, 270, 300, 30);
        lblCampero.setFont(fontTexto);
        lblCampero.setBounds(420, 320, 300, 30);
        lblVehiculoPesado.setFont(fontTexto);
        lblVehiculoPesado.setBounds(420, 370, 300, 30);
        lblMotocicleta.setFont(fontTexto);
        lblMotocicleta.setBounds(420, 420, 300, 30);
        lblBicicleta.setFont(fontTexto);
        lblBicicleta.setBounds(420, 470, 300, 30);
        
    }
    
    public void mostrar(){
        setSize(700, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public JButton getBtnVolver() {
        return btnVolver;
    }
    
    public JButton getBtnConsultar() {
        return btnConsultar;
    }
    
    public void mensajeAlerta() {
        JOptionPane.showMessageDialog(this, "Llene todos los espacios con valores validos.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }
    
 
}
