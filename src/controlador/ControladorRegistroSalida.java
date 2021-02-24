/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDateTime;
import modelo.Cliente;
import modelo.Contrato;
import modelo.Home;
import modelo.Vehiculo;
import vista.VistaHome;
import vista.VistaRegistroSalida;

/**
 *
 * @author User
 */
public class ControladorRegistroSalida implements ActionListener, ItemListener {

    private final VistaRegistroSalida vista;
    private final Vehiculo vehiculo;
    private final Cliente cliente;
    private final Contrato contrato;

    public ControladorRegistroSalida(VistaRegistroSalida vista, Vehiculo vehiculo, Cliente cliente, Contrato contrato) {
        this.vista = vista;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.contrato = contrato;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.getBtnFactura())) {
            if (vista.getBoxTipoContrato().getSelectedItem().equals("Minutos")) {
                vehiculo.setK_vehiculo(vista.getPlaca());
            } else {
                vehiculo.setK_vehiculo(vista.getPlaca());
                vehiculo.setN_color(vista.getColor());
                vehiculo.setN_marca(vista.getMarcaVehiculo());
                vehiculo.setN_modelo(vista.getModeloVehiculo());
                cliente.setN_nombre(vista.getNomCliente());
                cliente.setN_apellido(vista.getApeCliente());
                cliente.setK_cliente(Integer.parseInt(vista.getCedula()));
                cliente.setN_direccion(vista.getDireccion());
            }
        } else if (e.getSource().equals(vista.getBtnVolver())) {
            this.vista.dispose();
            mostrarHome();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (vista.getBoxTipoContrato().getSelectedItem().equals("Minutos")) {
            vista.getFldNomCliente().setEditable(false);
            vista.getFldMarcaVehiculo().setEditable(false);
            vista.getFldModeloVehiculo().setEditable(false);
            vista.getFldCedula().setEditable(false);
            vista.getFldColor().setEditable(false);
            vista.getFldTelefono().setEditable(false);
            vista.getFldDireccion().setEditable(false);
        } else {
            vista.getFldNomCliente().setEditable(true);
            vista.getFldMarcaVehiculo().setEditable(true);
            vista.getFldModeloVehiculo().setEditable(true);
            vista.getFldCedula().setEditable(true);
            vista.getFldColor().setEditable(true);
            vista.getFldTelefono().setEditable(true);
            vista.getFldDireccion().setEditable(true);
        }
    }

    private String getHora() {
        String minuto;
        String hora;
        if (LocalDateTime.now().getMinute() < 10) {
            minuto = "0" + String.valueOf(LocalDateTime.now().getMinute());
        } else {
            minuto = String.valueOf(LocalDateTime.now().getMinute());
        }
        if (LocalDateTime.now().getHour() < 10) {
            hora = "0" + String.valueOf(LocalDateTime.now().getMinute());
        } else {
            hora = String.valueOf(LocalDateTime.now().getHour());
        }
        return hora + ":" + minuto;
    }

    private String getFecha() {
        String dia;
        String mes;
        String anio = String.valueOf(LocalDateTime.now().getYear());
        if (LocalDateTime.now().getMonthValue() < 10) {
            mes = "0" + String.valueOf(LocalDateTime.now().getMonthValue());
        } else {
            mes = String.valueOf(LocalDateTime.now().getMonthValue());
        }
        if (LocalDateTime.now().getDayOfMonth() < 10) {
            dia = "0" + String.valueOf(LocalDateTime.now().getDayOfMonth());
        } else {
            dia = String.valueOf(LocalDateTime.now().getDayOfMonth());
        }
        return dia + "/" + mes + "/" + anio;
    }

    private void mostrarHome() {
        Home home = new Home();
        VistaHome vistaHome = new VistaHome();
        ControladorHome ch = new ControladorHome(vistaHome, home);
        vistaHome.asignaOyentes(ch);
        vistaHome.mostrar();
    }
}
