/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorRegistroSalida;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author fedc
 */
public class VistaRegistroSalida extends JFrame {

    private final JLabel lblTitulo = new JLabel("Registro  de salida");
    private final JLabel lblNomCliente = new JLabel("Nombre del cliente:");
    private final JLabel lblMarcaVehiculo = new JLabel("Marca del vehículo:");
    private final JLabel lblModeloVehiculo = new JLabel("Modelo:");
    private final JLabel lblTipoContrato = new JLabel("Tipo de contrato:");
    private final JLabel lblTxtHoraSalida = new JLabel("Hora de salida:");
    private final JLabel lblCedula = new JLabel("Cédula:");
    private final JLabel lblPlaca = new JLabel("Placa:");
    private final JLabel lblColor = new JLabel("Color:");
    private final JLabel lbltxtFechaSalida = new JLabel("Fecha de salida:");
    private final JLabel lbltxtTelefono = new JLabel("Telefono:");
    private JLabel lblFechaSalida = new JLabel();
    private JLabel lblHoraSalida = new JLabel();

    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);

    private final JComboBox boxTipoContrato;

    private final JButton btnVolver = new JButton("Volver");
    private final JButton btnFactura = new JButton("Factura");

    private final String tipoConrato[] = {"Minutos", "Días"};

    private final JTextField fldNomCliente = new JTextField();
    private final JTextField fldMarcaVehiculo = new JTextField();
    private final JTextField fldModeloVehiculo = new JTextField();
    private final JTextField fldCedula = new JTextField();
    private final JTextField fldPlaca = new JTextField();
    private final JTextField fldColor = new JTextField();
    private final JTextField fldTelefono = new JTextField();

    public VistaRegistroSalida() throws HeadlessException {
        super("Parqueé Aquí");
        this.boxTipoContrato = new JComboBox(tipoConrato);

        Container c = getContentPane();
        c.setLayout(null);
        //Agrega los textos
        c.add(lblTitulo);
        c.add(lblNomCliente);
        c.add(lblMarcaVehiculo);
        c.add(lblModeloVehiculo);
        c.add(lblTipoContrato);
        c.add(lblTxtHoraSalida);
        c.add(lblHoraSalida);
        c.add(lblCedula);
        c.add(lblPlaca);
        c.add(lblColor);
        c.add(lbltxtFechaSalida);
        c.add(lblFechaSalida);
        c.add(lbltxtTelefono);
        
        //Agrega el combobox
        c.add(boxTipoContrato);
        
        //Agrega los botones
        c.add(btnVolver);
        c.add(btnFactura);
        
        //Agrega los campos de texto
        c.add(fldNomCliente);
        c.add(fldMarcaVehiculo);
        c.add(fldModeloVehiculo);
        c.add(fldCedula);
        c.add(fldPlaca);
        c.add(fldColor);
        c.add(fldTelefono);
        
        // posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(300, 50, 450, 30);
        lblNomCliente.setFont(fontTexto);
        lblNomCliente.setBounds(70, 150, 250, 25);
        lblMarcaVehiculo.setFont(fontTexto);
        lblMarcaVehiculo.setBounds(70, 200, 250, 25);
        lblModeloVehiculo.setFont(fontTexto);
        lblModeloVehiculo.setBounds(70, 250, 250, 25);
        lblTipoContrato.setFont(fontTexto);
        lblTipoContrato.setBounds(70, 300, 250, 25);
        lblTxtHoraSalida.setFont(fontTexto);
        lblTxtHoraSalida.setBounds(70, 350, 250, 25);
        lblHoraSalida.setFont(fontTexto);
        lblHoraSalida.setBounds(230, 350, 250, 25);
        lblCedula.setFont(fontTexto);
        lblCedula.setBounds(450, 150, 250, 25);
        lblPlaca.setFont(fontTexto);
        lblPlaca.setBounds(450, 200, 250, 25);
        lblColor.setFont(fontTexto);
        lblColor.setBounds(450, 250, 250, 25);
        lbltxtFechaSalida.setFont(fontTexto);
        lbltxtFechaSalida.setBounds(450, 350, 250, 25);
        lblFechaSalida.setFont(fontTexto);
        lblFechaSalida.setBounds(570, 350, 250, 25);
        lbltxtTelefono.setFont(fontTexto);
        lbltxtTelefono.setBounds(70, 400, 250, 25);
        
        // posición de campos de texto
        fldNomCliente.setEditable(false);
        fldNomCliente.setBounds(230, 150, 150, 25);
        fldMarcaVehiculo.setEditable(false);
        fldMarcaVehiculo.setBounds(230, 200, 150, 25);
        fldModeloVehiculo.setEditable(false);
        fldModeloVehiculo.setBounds(230, 250, 150, 25);
        fldCedula.setEditable(false);
        fldCedula.setBounds(520, 150, 150, 25);
        fldPlaca.setBounds(520, 200, 150, 25);
        fldColor.setEditable(false);
        fldColor.setBounds(520, 250, 150, 25);
        fldTelefono.setEditable(false);
        fldTelefono.setBounds(230, 400, 150, 25);
        
        // posición del comobobox
        boxTipoContrato.setBounds(230, 300, 150, 25);
        
        // posición de los botones
        btnVolver.setBounds(250, 450, 100, 30);
        btnFactura.setBounds(450, 450, 100, 30);
        
        
    }

    public void mostrar() {
        setSize(800, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public JTextField getFldNomCliente() {
        return fldNomCliente;
    }

    public JTextField getFldMarcaVehiculo() {
        return fldMarcaVehiculo;
    }

    public JTextField getFldModeloVehiculo() {
        return fldModeloVehiculo;
    }

    public JTextField getFldCedula() {
        return fldCedula;
    }

    public JTextField getFldColor() {
        return fldColor;
    }
    
    public JComboBox getBoxTipoContrato () {
        return this.boxTipoContrato;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JButton getBtnFactura() {
        return btnFactura;
    }
    
    public void asignaOyentes (ControladorRegistroSalida c) {
        btnFactura.addActionListener(c);
        btnVolver.addActionListener(c);
        boxTipoContrato.addItemListener(c);
    }

}
