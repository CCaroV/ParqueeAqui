/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorHome;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author fedc
 */
public class VistaHome extends JFrame {
    
    private final JLabel lblTitulo = new JLabel("Parqueé aquí");
    private final JLabel lblNomParqueadero = new JLabel("Parqueadero:");
    
    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);
    
    private JComboBox boxNomParqueadero;
    
    private final JButton btnReservar = new JButton("Reservar");
    private final JButton btnConstVehiculo = new JButton("Consulta de vehículo");
    private final JButton btnConstRecaudo = new JButton("Consulta de recaudo");
    private final JButton btnConstFlujo = new JButton("Consulta de Flujo");
    private final JButton btnRegistrarParqueadero = new JButton("Registrar un nuevo parqueadero");
    private ArrayList<String> nomParqueaderos= new ArrayList<String>();
    
    public final ArrayList<String> getNomParqueaderos() {
        return nomParqueaderos;
    }
    public void setNomParqueaderos(ArrayList<String> nomParqueaderos){
        this.nomParqueaderos=nomParqueaderos;
    }
    
    public VistaHome() throws HeadlessException {
        super("Bienvenido");              
        this.boxNomParqueadero = new JComboBox();
        Container c = getContentPane();
        c.setLayout(null);
        
        c.add(lblTitulo);
        c.add(lblNomParqueadero);
        
        c.add(boxNomParqueadero);
        
        c.add(btnReservar);
        c.add(btnConstVehiculo);
        c.add(btnConstRecaudo);
        c.add(btnConstFlujo);
        c.add(btnRegistrarParqueadero);
        
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(100, 50, 450, 30);
        lblNomParqueadero.setFont(fontTexto);
        lblNomParqueadero.setBounds(60, 150, 250, 25);
        
        boxNomParqueadero.setBounds(170, 150, 200, 25);
        
        btnReservar.setBounds(50, 300, 170, 30);
        btnConstRecaudo.setFont(new Font("Calibri", Font.PLAIN, 12));
        btnConstRecaudo.setBounds(230, 300, 170, 30);
        btnConstVehiculo.setFont(new Font("Calibri", Font.PLAIN, 12));
        btnConstVehiculo.setBounds(50, 340, 170, 30);
        btnConstFlujo.setBounds(230, 340, 170, 30);
        btnRegistrarParqueadero.setBounds(50, 380, 350, 30);
        
        
    }
    
    public void mostrar() {
        setSize(450, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public JButton getBtnReservar() {
        return btnReservar;
    }

    public JButton getBtnConstVehiculo() {
        return btnConstVehiculo;
    }

    public JButton getBtnConstRecaudo() {
        return btnConstRecaudo;
    }

    public JButton getBtnConstFlujo() {
        return btnConstFlujo;
    }

    public JButton getBtnRegistrarParqueadero() {
        return btnRegistrarParqueadero;
    }
    
    public void asignaOyentes(ControladorHome c) {
        btnReservar.addActionListener(c);
        btnConstRecaudo.addActionListener(c);
        btnConstVehiculo.addActionListener(c);
        btnConstFlujo.addActionListener(c);
        btnRegistrarParqueadero.addActionListener(c);
    }
}
