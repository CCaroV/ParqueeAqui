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
 * @author fedc
 */
public class VistaVerificarCupo extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -2339007416279667978L;
    private final JLabel lblTitulo = new JLabel("Verificar cupo");
    private final JLabel lblTipoVehiculo = new JLabel("Tipo de vehículo");
    private final JLabel lblTxtCuposDisp = new JLabel("Número de cupos disponibles:");
    private final JLabel lblTxtTarifa = new JLabel("Tarifa:");
    private JLabel lblTarifa = new JLabel();
    private JLabel lblCuposDisp = new JLabel();

    private final Font fontTitulo = new Font("Calibri", Font.BOLD, 30);
    private final Font fontTexto = new Font("Calibri", Font.PLAIN, 15);

    private final JComboBox boxTipoAutomovil;

    private final JButton btnVolver = new JButton("Volver");
    private final JButton btnReservar = new JButton("Reservar");

    private final String tipoVehiculo[] = { "Automovil", "Campero", "Camioneta", "Vehículo Pesado", "Motocicleta",
            "Bicicleta" };

    public VistaVerificarCupo() throws HeadlessException {
        super("Parqueé Aquí");
        this.boxTipoAutomovil = new JComboBox(tipoVehiculo);

        Container c = getContentPane();
        c.setLayout(null);

        // Agrega los textos
        c.add(lblTitulo);
        c.add(lblTipoVehiculo);
        c.add(lblTxtTarifa);
        c.add(lblTxtCuposDisp);
        c.add(lblTarifa);
        c.add(lblCuposDisp);

        // Agrega los combobox
        c.add(boxTipoAutomovil);

        // Agrega los botones
        c.add(btnVolver);
        c.add(btnReservar);

        // posición y fuente de los textos
        lblTitulo.setFont(fontTitulo);
        lblTitulo.setBounds(200, 50, 450, 30);
        lblTipoVehiculo.setFont(fontTexto);
        lblTipoVehiculo.setBounds(70, 150, 250, 20);
        lblTxtTarifa.setFont(fontTexto);
        lblTxtTarifa.setBounds(70, 200, 250, 20);
        lblTxtCuposDisp.setFont(fontTexto);
        lblTxtCuposDisp.setBounds(70, 250, 250, 20);
        lblTarifa.setFont(fontTexto);
        lblTarifa.setBounds(310, 200, 250, 20);
        lblCuposDisp.setFont(fontTexto);
        lblCuposDisp.setBounds(310, 250, 250, 20);

        // Posición de los combobox
        boxTipoAutomovil.setBounds(310, 150, 200, 20);

        // Posición de los botones
        btnVolver.setBounds(150, 300, 90, 25);
        btnReservar.setBounds(300, 300, 110, 25);
    }

    public void mostrar() {
        setSize(570, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public String getTipoAutomovil() {
        return boxTipoAutomovil.getSelectedItem().toString();
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public JButton getBtnReservar() {
        return btnReservar;
    }

}
