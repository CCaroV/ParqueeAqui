/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorArea_VistaRegistrarAreas;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author fedc
 */
public class VistaRegistrarAreas extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 4803224744635049517L;
    private final JLabel lblTitulo = new JLabel("Registro  de Áreas");
    private final JLabel lblNomParqueadero = new JLabel("Nombre del parqueadero:");
    private final JLabel lblParqueadero = new JLabel();
    private final JLabel lblCupos = new JLabel("Cupos por área:");
    private final JLabel lblAutomovil = new JLabel("Automovil:");
    private final JLabel lblCampero = new JLabel("Campero:");
    private final JLabel lblCamioneta = new JLabel("Camioneta:");
    private final JLabel lblVehiculosP = new JLabel("Vehículo pesado:");
    private final JLabel lblMotocicleta = new JLabel("Motocicleta:");
    private final JLabel lblBicicleta = new JLabel("Bicicleta:");

    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);
    private final Font fontSubTitulo = new Font("Calibri", Font.BOLD, 20);

    private final JButton btnVolver = new JButton("Volver");
    private final JButton btnRegistrar = new JButton("Registrar");

    private final JTextField fldAuto = new JTextField();
    private final JTextField fldCampero = new JTextField();
    private final JTextField fldVehiculoPesado = new JTextField();
    private final JTextField fldCamioneta = new JTextField();
    private final JTextField fldMotocicleta = new JTextField();
    private final JTextField fldBicicleta = new JTextField();

    public VistaRegistrarAreas() throws HeadlessException {
        super("Parqueé Aquí");

        Container k = getContentPane();
        k.setLayout(null);

        //Agrega los textos
        k.add(lblTitulo);
        k.add(lblNomParqueadero);
        k.add(lblCupos);
        k.add(lblAutomovil);
        k.add(lblCampero);
        k.add(lblCamioneta);
        k.add(lblVehiculosP);
        k.add(lblMotocicleta);
        k.add(lblBicicleta);
        k.add(lblParqueadero);

        //Agrega los botones
        k.add(btnRegistrar);
        k.add(btnVolver);

        //Agrega las cajas de texto
        k.add(fldAuto);
        k.add(fldCampero);
        k.add(fldCamioneta);
        k.add(fldVehiculoPesado);
        k.add(fldMotocicleta);
        k.add(fldBicicleta);

        // posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(240, 50, 450, 40);
        lblNomParqueadero.setFont(fontTexto);
        lblNomParqueadero.setBounds(200, 100, 300, 30);
        lblParqueadero.setFont(fontTexto);
        lblParqueadero.setBounds(400, 100, 300, 30);
        lblCupos.setFont(fontSubTitulo);
        lblCupos.setBounds(280, 150, 300, 30);
        lblAutomovil.setFont(fontTexto);
        lblAutomovil.setBounds(50, 200, 300, 30);
        lblCampero.setFont(fontTexto);
        lblCampero.setBounds(50, 250, 300, 30);
        lblCamioneta.setFont(fontTexto);
        lblCamioneta.setBounds(50, 300, 300, 30);
        lblVehiculosP.setFont(fontTexto);
        lblVehiculosP.setBounds(370, 200, 300, 30);
        lblMotocicleta.setFont(fontTexto);
        lblMotocicleta.setBounds(370, 250, 300, 30);
        lblBicicleta.setFont(fontTexto);
        lblBicicleta.setBounds(370, 300, 300, 30);

        //Posición de los botones
        btnVolver.setBounds(200, 380, 85, 25);
        btnRegistrar.setBounds(320, 380, 170, 25);

        //Posición de las cajas de texto
        fldAuto.setBounds(140, 200, 150, 30);
        fldCampero.setBounds(140, 250, 150, 30);
        fldCamioneta.setBounds(140, 300, 150, 30);
        fldVehiculoPesado.setBounds(500, 200, 150, 30);
        fldMotocicleta.setBounds(500, 250, 150, 30);
        fldBicicleta.setBounds(500, 300, 150, 30);

    }

    public void mostrar() {
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void limpiarFields() {
        this.fldAuto.setText("");
        this.fldCampero.setText("");
        this.fldCamioneta.setText("");
        this.fldVehiculoPesado.setText("");
        this.fldMotocicleta.setText("");
        this.fldBicicleta.setText("");
    }

    public String getAuto() {
        if (this.fldAuto.getText().trim().equals("")) {
            return "0";
        } else {
            return this.fldAuto.getText().trim();
        }
    }

    public String getCampero() {
        if (this.fldCampero.getText().trim().equals("")) {
            return "0";
        } else {
            return this.fldCampero.getText().trim();
        }
    }

    public String getCamioneta() {
        if (this.fldCamioneta.getText().trim().equals("")) {
            return "0";
        } else {
            return this.fldCamioneta.getText().trim();
        }
    }

    public String getVehiculoPesado() {
        if (this.fldVehiculoPesado.getText().trim().equals("")) {
            return "0";
        } else {
            return this.fldVehiculoPesado.getText().trim();
        }
    }

    public String getMotocicleta() {
        if (this.fldMotocicleta.getText().trim().equals("")) {
            return "0";
        } else {
            return this.fldMotocicleta.getText().trim();
        }
    }

    public String getBicicleta() {
        if (this.fldBicicleta.getText().trim().equals("")) {
            return "0";
        } else {
            return this.fldBicicleta.getText().trim();
        }
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void asignarOyente(ControladorArea_VistaRegistrarAreas c) {
        this.btnRegistrar.addActionListener(c);
        this.btnVolver.addActionListener(c);
    }

    public void mensajeAlerta() {
        JOptionPane.showMessageDialog(this, "Llene todos los espacios con valores validos.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }
    /*public void asignaOyentes(Controlador c) {
        btnVolver.addActionListener(c);
        btnRegistrar.addActionListener(c);
    }*/
}
