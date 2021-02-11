/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorTarifa;
import Modelo.Tarifa;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author fedc
 */
public class VistaRegistroVehiculo extends JFrame {

    private final JLabel lblTitulo = new JLabel("Registro de parqueadero:");
    private final JLabel lblNomParqueadero = new JLabel("Nombre del parqueadero:");
    private final JLabel lblLocalidad = new JLabel("Localidad:");
    private final JLabel lblSubterraneo = new JLabel("Subterráneo:");
    private final JLabel lblNumNiveles = new JLabel("Número de niveles:");

    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);

    private final JButton btnVolver = new JButton("Volver");
    private final JButton btnRegistrar = new JButton("Continuar Registro");

    private final JTextField fldNomParqueadero = new JTextField();
    private final JComboBox boxLocalidad;
    private final JCheckBox checkSi = new JCheckBox("Sí");
    private final JCheckBox checkNo = new JCheckBox("No");
    private final JTextField fldNumNiveles = new JTextField();

    private final String localidad[] = {"Usaquen, 1", "Chapinero, 2", "Santa Fe, 3",
        "San Cristobal, 4", "Usme, 5", "Tunjuelito, 6", "Bosa, 7", "Kennedy, 8",
        "Fontibón, 9", "Engativá, 10", "Suba, 11", "Barrios Unidos, 12",
        "Teusaquillo, 13", "Los Mártires, 14", "Antonio Nariño, 15", "Puente Aranda, 16",
        "La Candelaría, 17", "Rafael Uribe Uribe, 18", "Ciudad Bolivar, 19", "Sumapaz, 20"
    };

    public VistaRegistroVehiculo() throws HeadlessException {
        super("Parqueé Aquí");
        this.boxLocalidad = new JComboBox(localidad);

        Container c = getContentPane();
        c.setLayout(null);

        //Arega los textos
        c.add(lblTitulo);
        c.add(lblNomParqueadero);
        c.add(lblLocalidad);
        c.add(lblSubterraneo);
        c.add(lblNumNiveles);
        c.add(btnVolver);
        c.add(btnRegistrar);
        c.add(fldNomParqueadero);

        //Agrega los botones
        c.add(btnRegistrar);
        c.add(btnVolver);

        //Agrega las cajas de texto
        c.add(fldNomParqueadero);
        c.add(boxLocalidad);
        c.add(checkSi);
        c.add(checkNo);
        c.add(fldNumNiveles);

        //Posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(65, 50, 450, 30);
        lblNomParqueadero.setFont(fontTexto);
        lblNomParqueadero.setBounds(80, 150, 300, 20);
        lblLocalidad.setFont(fontTexto);
        lblLocalidad.setBounds(80, 200, 300, 20);
        lblSubterraneo.setFont(fontTexto);
        lblSubterraneo.setBounds(80, 250, 300, 20);
        lblNumNiveles.setFont(fontTexto);
        lblNumNiveles.setBounds(80, 300, 300, 20);

        //Posición de los botones
        btnVolver.setBounds(150, 370, 85, 25);
        btnRegistrar.setBounds(250, 370, 170, 25);

        //Posición de las cajas de texto
        fldNomParqueadero.setBounds(300, 150, 150, 20);
        boxLocalidad.setBounds(300, 200, 150, 20);
        checkSi.setBounds(300, 250, 40, 20);
        checkNo.setBounds(350, 250, 45, 20);
        fldNumNiveles.setBounds(300, 300, 150, 20);

    }

    public void mostrar() {
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public String getNomParqueadero() {
        return this.fldNomParqueadero.getText();
    }

    public String getLocalidad() {
        return this.boxLocalidad.getSelectedItem().toString();
    }

    public boolean getCheck() {
        if (checkSi.isSelected()) {
            return true;
        } else if (checkNo.isSelected()) {
            return false;
        } else {
            return false;
        }
    }

    public String getNumNiveles() {
        return this.fldNumNiveles.toString();
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void asignaOyentes(ControladorTarifa c) {
        btnRegistrar.addActionListener(c);
        //btnVolver.addActionListener(c);
    }

    public void mensajeAlerta() {
        JOptionPane.showMessageDialog(this, "Llene todos los espacios con valores validos.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }

}