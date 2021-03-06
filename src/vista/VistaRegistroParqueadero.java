/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorParqueadero_VistaRegistroParqueadero;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author fedc
 */
public class VistaRegistroParqueadero extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1711192311848917263L;
    private final JLabel lblTitulo = new JLabel("Registro de parqueadero:");
    private final JLabel lblNomParqueadero = new JLabel("Nombre del parqueadero:");
    private final JLabel lblLocalidad = new JLabel("Localidad:");
    private final JLabel lblDireccion = new JLabel("Dirección:");
    private final JLabel lblSubterraneo = new JLabel("Subterráneo:");
    private final JLabel lblNumNiveles = new JLabel("Número de niveles:");
    private final JLabel lblNumAreas = new JLabel("Número de áreas:");

    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);

    private final JButton btnVolver = new JButton("Volver");
    private final JButton btnRegistrar = new JButton("Continuar Registro");

    private final JTextField fldNomParqueadero = new JTextField();
    private final JComboBox boxLocalidad;
    private final JTextField fldDireccion = new JTextField();
    private final JTextField fldNumNiveles = new JTextField();
    private final JTextField fldNumAreas = new JTextField();
    private final JCheckBox checkSi = new JCheckBox("Sí");
    private final JCheckBox checkNo = new JCheckBox("No");

    private final String localidad[] = {"Usaquen, 1", "Chapinero, 2", "Santa Fe, 3",
        "San Cristobal, 4", "Usme, 5", "Tunjuelito, 6", "Bosa, 7", "Kennedy, 8",
        "Fontibón, 9", "Engativá, 10", "Suba, 11", "Barrios Unidos, 12",
        "Teusaquillo, 13", "Los Mártires, 14", "Antonio Nariño, 15", "Puente Aranda, 16",
        "La Candelaría, 17", "Rafael Uribe Uribe, 18", "Ciudad Bolivar, 19", "Sumapaz, 20"
    };

    public VistaRegistroParqueadero() throws HeadlessException {
        super("Parqueé Aquí");
        this.boxLocalidad = new JComboBox(localidad);

        Container c = getContentPane();
        c.setLayout(null);

        //Arega los textos
        c.add(lblTitulo);
        c.add(lblNomParqueadero);
        c.add(lblLocalidad);
        c.add(lblDireccion);
        c.add(lblSubterraneo);
        c.add(lblNumNiveles);
        c.add(lblNumAreas);
        c.add(btnVolver);
        c.add(btnRegistrar);
        c.add(fldNomParqueadero);

        //Agrega los botones
        c.add(btnRegistrar);
        c.add(btnVolver);

        //Agrega las cajas de texto
        c.add(fldNomParqueadero);
        c.add(boxLocalidad);
        c.add(fldDireccion);
        c.add(checkSi);
        c.add(checkNo);
        c.add(fldNumNiveles);
        c.add(fldNumAreas);

        //Posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(130, 50, 450, 30);
        lblNomParqueadero.setFont(fontTexto);
        lblNomParqueadero.setBounds(80, 160, 300, 20);
        lblLocalidad.setFont(fontTexto);
        lblLocalidad.setBounds(80, 210, 300, 20);
        lblDireccion.setFont(fontTexto);
        lblDireccion.setBounds(80, 260, 300, 20);
        lblSubterraneo.setFont(fontTexto);
        lblSubterraneo.setBounds(80, 310, 300, 20);
        lblNumNiveles.setFont(fontTexto);
        lblNumNiveles.setBounds(80, 360, 300, 20);
        lblNumAreas.setBounds(80, 410, 300, 20);

        //Posición de los botones
        btnVolver.setBounds(150, 460, 85, 25);
        btnRegistrar.setBounds(250, 460, 170, 25);

        //Posición de las cajas de texto
        fldNomParqueadero.setBounds(300, 150, 150, 30);
        boxLocalidad.setBounds(300, 200, 150, 30);
        fldDireccion.setBounds(300, 250, 150, 30);
        checkSi.setBounds(300, 300, 40, 30);
        checkNo.setBounds(350, 300, 45, 30);
        fldNumNiveles.setBounds(300, 350, 150, 30);
        fldNumAreas.setBounds(300, 400, 150, 30);

    }

    public void mostrar() {
        setSize(580, 570);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public String getNomParqueadero() {
        return this.fldNomParqueadero.getText();
    }

    public String getLocalidad() {
        return this.boxLocalidad.getSelectedItem().toString();
    }
    
    public String getDireccion() {
        return this.fldDireccion.getText();
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

    public JCheckBox getSi() {
        return checkSi;
    }

    public void setSi(boolean bool) {
        checkSi.setSelected(bool);
    }

    public JCheckBox getNo() {
        return checkNo;
    }

    public void setNo(boolean bool) {
        checkNo.setSelected(bool);
    }

    public String getNumNiveles() {
        if (this.fldNumNiveles.getText().trim().equals("")) {
            return "1";
        } else {
            return this.fldNumNiveles.getText().trim();
        }
    }

    public String getNumAreas() {
        if (this.fldNumAreas.getText().trim().equals("")) {
            return "1";
        } else {
            return this.fldNumAreas.getText().trim();
        }
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void asignaOyentes(ControladorParqueadero_VistaRegistroParqueadero c) {
        btnRegistrar.addActionListener(c);
        btnVolver.addActionListener(c);
        checkSi.addItemListener(c);
        checkNo.addItemListener(c);
    }

    public void mensajeAlerta() {
        JOptionPane.showMessageDialog(this, "Llene todos los espacios con valores validos.", "Alerta", JOptionPane.INFORMATION_MESSAGE);
    }

}
