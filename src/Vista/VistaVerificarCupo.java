/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Tarifa;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author fedc
 */
public class VistaVerificarCupo extends JFrame {

    private final JLabel lblTitulo = new JLabel("Verificar cupo");
    private final JLabel lblTipoVehiculo = new JLabel("Tipo de vehículo");
    private final JLabel lblTxtCuposDisp = new JLabel("Número de cupos disponibles:");
    private final JLabel lblTxtTarifa = new JLabel("Tarifa:");
    private JLabel lblTarifa = new JLabel();
    private JLabel lblCuposDisp = new JLabel();

    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);
    
    private final JComboBox boxTipoAutomovil;
    
    public final JButton btnVolver = new JButton("Volver");
    public final JButton btnReservar = new JButton("Reservar");

    String tipoVehiculo[] = {"Campero", "Camión"};

    public VistaVerificarCupo() throws HeadlessException {
        super("Parqueé Aquí");
        this.boxTipoAutomovil = new JComboBox(tipoVehiculo);
        
        Container c = getContentPane();
        c.setLayout(null);
        
        c.add(lblTitulo);
        c.add(lblTipoVehiculo);
        c.add(lblTxtTarifa);
        c.add(lblTxtCuposDisp);
        c.add(lblTarifa);
        c.add(lblCuposDisp);
        
        c.add(boxTipoAutomovil);
        
        c.add(btnVolver);
        c.add(btnReservar);
        
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(110, 50, 450, 30);
        lblTipoVehiculo.setFont(fontTexto);
        lblTipoVehiculo.setBounds(70, 150, 250, 20);
        lblTxtTarifa.setFont(fontTexto);
        lblTxtTarifa.setBounds(70, 200, 250, 20);
        lblTxtCuposDisp.setFont(fontTexto);
        lblTxtCuposDisp.setBounds(70, 250, 250, 20);
        lblTarifa.setFont(fontTexto);
        lblTarifa.setBounds(70, 200, 250, 20);
        lblCuposDisp.setFont(fontTexto);
        lblCuposDisp.setBounds(70, 250, 250, 20);
        
        boxTipoAutomovil.setBounds(300, 150, 200, 20);
    }
    
    public void mostrar() {
        setSize(570, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

}
