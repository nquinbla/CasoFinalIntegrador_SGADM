package B_AnálisisYOrganizaciónInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.List; // Importa java.util.List

public class GUI_Ventas extends JFrame {
    private RegistroVentas registroVentas;
    private JTextField diaField, mesField, añoField, cantidadField, clienteField;
    private JTextArea resultadoArea;

    public GUI_Ventas() {
        registroVentas = new RegistroVentas(new ArrayList<>());

        setLayout(new FlowLayout());

        diaField = new JTextField(2);
        mesField = new JTextField(2);
        añoField = new JTextField(4);
        cantidadField = new JTextField(10);
        clienteField = new JTextField(10);
        resultadoArea = new JTextArea(20, 30);

        JButton agregarButton = new JButton("Agregar Venta");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int dia = Integer.parseInt(diaField.getText());
                    int mes = Integer.parseInt(mesField.getText());
                    int año = Integer.parseInt(añoField.getText());

                    if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || año < 0 || año > 2025) {
                        throw new NumberFormatException();
                    }

                    Calendar calendar = Calendar.getInstance();
                    calendar.set(año, mes - 1, dia);
                    int maxDayInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                    if (dia > maxDayInMonth) {
                        throw new NumberFormatException();
                    }

                    Date fecha = calendar.getTime();

                    int cantidad = Integer.parseInt(cantidadField.getText());
                    String cliente = clienteField.getText();

                    Venta venta = new Venta(fecha, cantidad, cliente);
                    registroVentas.agregarVenta(venta);

                    resultadoArea.append("Venta agregada: " + venta.getCliente() + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Error: Fecha, cantidad o cliente inválido. Debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton ordenarPorFechaButton = new JButton("Ordenar por Fecha");
        ordenarPorFechaButton.addActionListener(e -> {
            List<Venta> ventasOrdenadas = registroVentas.ordenarPorFecha(); // Usa java.util.List
            resultadoArea.setText("");
            for (Venta venta : ventasOrdenadas) {
                resultadoArea.append("Fecha: " + venta.getFecha() + ", Cantidad: " + venta.getCantidad() + ", Cliente: " + venta.getCliente() + "\n");
            }
        });

        JButton ordenarPorCantidadButton = new JButton("Ordenar por Cantidad");
        ordenarPorCantidadButton.addActionListener(e -> {
            List<Venta> ventasOrdenadas = registroVentas.ordenarPorCantidad(); // Usa java.util.List
            resultadoArea.setText("");
            for (Venta venta : ventasOrdenadas) {
                resultadoArea.append("Fecha: " + venta.getFecha() + ", Cantidad: " + venta.getCantidad() + ", Cliente: " + venta.getCliente() + "\n");
            }
        });

        JButton ordenarPorClienteButton = new JButton("Ordenar por Cliente");
        ordenarPorClienteButton.addActionListener(e -> {
            List<Venta> ventasOrdenadas = registroVentas.ordenarPorCliente(); // Usa java.util.List
            resultadoArea.setText("");
            for (Venta venta : ventasOrdenadas) {
                resultadoArea.append("Fecha: " + venta.getFecha() + ", Cantidad: " + venta.getCantidad() + ", Cliente: " + venta.getCliente() + "\n");
            }
        });

        add(new JLabel("Día:"));
        add(diaField);
        add(new JLabel("Mes:"));
        add(mesField);
        add(new JLabel("Año:"));
        add(añoField);
        add(new JLabel("Cantidad:"));
        add(cantidadField);
        add(new JLabel("Cliente:"));
        add(clienteField);
        add(agregarButton);
        add(ordenarPorFechaButton);
        add(ordenarPorCantidadButton);
        add(ordenarPorClienteButton);
        add(new JScrollPane(resultadoArea));

        setSize(640, 460);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_Ventas();
    }
}