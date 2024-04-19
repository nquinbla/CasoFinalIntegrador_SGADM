package B_AnálisisYOrganizaciónInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class GUI_Ventas extends JFrame {
    private RegistroVentas registroVentas;
    private JTextField fechaField, cantidadField, clienteField;
    private JTextArea resultadoArea;

    public GUI_Ventas() {
        registroVentas = new RegistroVentas(new ArrayList<>());

        setLayout(new FlowLayout());

        fechaField = new JTextField(10);
        cantidadField = new JTextField(10);
        clienteField = new JTextField(10);
        resultadoArea = new JTextArea(20, 30);

        JButton agregarButton = new JButton("Agregar Venta");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaField.getText());
                    int cantidad = Integer.parseInt(cantidadField.getText());
                    String cliente = clienteField.getText();

                    Venta venta = new Venta(fecha, cantidad, cliente);
                    registroVentas.agregarVenta(venta);

                    resultadoArea.append("Venta agregada: " + venta.getCliente() + "\n");
                } catch (ParseException ex) {
                    resultadoArea.append("Error: Fecha inválida. Use el formato dd/MM/yyyy.\n");
                } catch (NumberFormatException ex) {
                    resultadoArea.append("Error: Cantidad inválida. Debe ser un número entero.\n");
                }
            }
        });

        JButton ordenarPorFechaButton = new JButton("Ordenar por Fecha");
        ordenarPorFechaButton.addActionListener(e -> {
            registroVentas.ordenarPorFecha();
            resultadoArea.append("Ventas ordenadas por fecha.\n");
        });

        JButton ordenarPorCantidadButton = new JButton("Ordenar por Cantidad");
        ordenarPorCantidadButton.addActionListener(e -> {
            registroVentas.ordenarPorCantidad();
            resultadoArea.append("Ventas ordenadas por cantidad.\n");
        });

        JButton ordenarPorClienteButton = new JButton("Ordenar por Cliente");
        ordenarPorClienteButton.addActionListener(e -> {
            registroVentas.ordenarPorCliente();
            resultadoArea.append("Ventas ordenadas por cliente.\n");
        });

        add(new JLabel("Fecha (dd/MM/yyyy):"));
        add(fechaField);
        add(new JLabel("Cantidad:"));
        add(cantidadField);
        add(new JLabel("Cliente:"));
        add(clienteField);
        add(agregarButton);
        add(ordenarPorFechaButton);
        add(ordenarPorCantidadButton);
        add(ordenarPorClienteButton);
        add(new JScrollPane(resultadoArea));

        setSize(400, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_Ventas();
    }
}