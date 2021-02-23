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
public class EstaEstaMalPeroSirveComoInicioDeUnaNuevaYNoSupeComoBorrarla  extends JFrame{
    
    
    private final JLabel lblTxtNomPropietario = new JLabel("Propietario:");
    private final JLabel lblTxtTipoVehiculo = new JLabel("Tipo de vehículo:");
    private final JLabel lblTxtMatricula = new JLabel("Matricula");
    private final JLabel lblTxtCedula = new JLabel("Cedula:");
    private final JLabel lblTxtServicio = new JLabel("Tipo de servicio:");
    private final JLabel lblTxtMarca = new JLabel("Marca:");
    private final JLabel lblTxtModelo = new JLabel("Modelo:");
    private final JLabel lblTxtColor = new JLabel("Color");
    private final JLabel lblTxtHoraEntrada = new JLabel("Hora de entrada:");
    private final JLabel lblTxtFechaEntrada = new JLabel("Fecha de entrada:");
    private final JLabel lblTxtHoraSalida = new JLabel("Hora de salida:");
    private final JLabel lblTxtFechaSalida = new JLabel("Fecha de salida:");
    
    private  JLabel lblNomPropietario = new JLabel();
    private  JLabel lblTipoVehiculo = new JLabel();
    private  JLabel lblMatricula = new JLabel();
    private  JLabel lblCedula = new JLabel();
    private  JLabel lblServicio = new JLabel();
    private  JLabel lblMarca = new JLabel();
    private  JLabel lblModelo = new JLabel();
    private  JLabel lblColor = new JLabel();
    private  JLabel lblHoraEntrada = new JLabel();
    private  JLabel lblFechaEntrada = new JLabel();
    private  JLabel lblHoraSalida = new JLabel();
    private  JLabel lblFechaSalida = new JLabel();
    
    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);
    
    private final JButton btnVolver = new JButton("Volver");
    
    public EstaEstaMalPeroSirveComoInicioDeUnaNuevaYNoSupeComoBorrarla() throws HeadlessException {
        super("Parqueé Aquí");
        
        Container k =getContentPane();
        k.setLayout(null);
        
        //Agrega los textos
        k.add(lblTxtTipoVehiculo);
        k.add(lblTxtMatricula);
        k.add(lblTxtCedula);
        k.add(lblTxtServicio);
        k.add(lblTxtMarca);
        k.add(lblTxtModelo);
        k.add(lblTxtColor);
        k.add(lblTxtHoraSalida);
        k.add(lblTxtFechaSalida);
        k.add(lblTxtFechaEntrada);
        k.add(lblTxtHoraEntrada);
        
        //Agrega las respuestas a los textos
        
        k.add(lblTipoVehiculo);
        k.add(lblMatricula);
        k.add(lblCedula);
        k.add(lblServicio);
        k.add(lblMarca);
        k.add(lblModelo);
        k.add(lblColor);
        k.add(lblFechaEntrada);
        k.add(lblHoraEntrada);
        
        //Agrega los botones
        k.add(btnVolver);
      
        // posición y fuente de los textos
        
        lblTxtTipoVehiculo.setFont(fontTexto);
        lblTxtTipoVehiculo.setBounds(60, 150, 300, 30);
        lblTxtCedula.setFont(fontTexto);
        lblTxtCedula.setBounds(60, 250, 300, 30);
        lblTxtServicio.setFont(fontTexto);
        lblTxtServicio.setBounds(60, 300, 300, 30);
        lblTxtMarca.setFont(fontTexto);
        lblTxtMarca.setBounds(60, 350, 300, 30);
        lblTxtModelo.setFont(fontTexto);
        lblTxtModelo.setBounds(60, 400, 300, 30);
        lblTxtColor.setFont(fontTexto);
        lblTxtColor.setBounds(60, 450, 300, 30);
        lblTxtHoraEntrada.setFont(fontTexto);
        lblTxtHoraEntrada.setBounds(60, 500, 300, 30);
        lblTxtFechaEntrada.setFont(fontTexto);
        lblTxtFechaEntrada.setBounds(60, 550, 300, 30);
        
        //Posición de los botones
        btnVolver.setBounds(250, 600, 85, 25);
        
        
    }
    
    public void mostrar(){
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public JButton getBtnVolver() {
        return btnVolver;
    }
    
    public void mensajeAlerta() {
        JOptionPane.showMessageDialog(this, "Llene todos los espacios con valores validos.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }
    
 
}
