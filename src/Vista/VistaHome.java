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
public class VistaHome extends JFrame {
    
    private final JLabel lblTitulo = new JLabel("Parqueé aquí");
    private final JLabel lblNomParqueadero = new JLabel("Parqueadero:");
    
    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);
    
    private final JComboBox boxNomParqueadero;
    
    private final JButton btnReservar = new JButton("Reservar");
    private final JButton btnConstVehiculo = new JButton("Consulta de vehículo");
    private final JButton btnConstRecaudo = new JButton("Consulta de recaudo");
    private final JButton btnConstFlujo = new JButton("Consulta de Flujo");
    private final JButton btnRegistrarParqueadero = new JButton("Registrar un nuevo parqueadero");
    
    private final String nomParqueaderos[] = new String[10];

    public VistaHome() throws HeadlessException {
        super("Bienvenido");
        this.boxNomParqueadero = new JComboBox(nomParqueaderos);
        
        Container c = getContentPane();
        c.setLayout(null);
        
        c.add(lblTitulo);
        c.add(lblNomParqueadero);
        
        c.add(boxNomParqueadero);
        
        c.add(btnReservar);
        c.add(btnConstVehiculo);
        c.add(btnConstRecaudo);
        c.add(btnConstFlujo);
        
        
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
        
        
    }
    
    public void mostrar() {
        setSize(450, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
}
