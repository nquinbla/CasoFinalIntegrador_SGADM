package B_AnálisisYOrganizaciónInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GUI_Ventas extends JFrame {
    private RegistroVentas registroVentas;
    private JTextField diaField, mesField, añoField, cantidadField, clienteField;
    private JTextArea resultadoArea;
    private JComboBox<Integer> ventaComboBox; // Nuevo JComboBox para seleccionar la venta

    public GUI_Ventas() {
        registroVentas = new RegistroVentas(new ArrayList<>());

        setLayout(new FlowLayout());

        diaField = new JTextField(2);
        mesField = new JTextField(2);
        añoField = new JTextField(4);
        cantidadField = new JTextField(10);
        clienteField = new JTextField(10);
        resultadoArea = new JTextArea(20, 30);

        ventaComboBox = new JComboBox<>(); // Inicializar el JComboBox

        JButton agregarButton = new JButton("Agregar Venta");
        agregarButton.addActionListener(e -> {
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
                actualizarComboBox(); // Actualizar el JComboBox después de agregar una venta

                resultadoArea.append("Venta agregada: " + venta.getCliente() + "\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: Fecha, cantidad o cliente inválido. Debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton eliminarButton = new JButton("Eliminar Venta");
        eliminarButton.addActionListener(e -> {
            try {
                int index = (int) ventaComboBox.getSelectedItem(); // Usar ventaComboBox en lugar de indexField
                registroVentas.eliminarVenta(index);
                actualizarComboBox(); // Actualizar el JComboBox después de eliminar una venta

                resultadoArea.append("Venta eliminada: " + index + "\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: Índice inválido. Debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton editarButton = new JButton("Editar Venta");
        editarButton.addActionListener(e -> {
            try {
                int index = (int) ventaComboBox.getSelectedItem(); // Obtener el índice seleccionado del JComboBox

                String nuevoDia = JOptionPane.showInputDialog("Ingrese el nuevo día:");
                String nuevoMes = JOptionPane.showInputDialog("Ingrese el nuevo mes:");
                String nuevoAño = JOptionPane.showInputDialog("Ingrese el nuevo año:");
                String nuevaCantidad = JOptionPane.showInputDialog("Ingrese la nueva cantidad:");
                String nuevoCliente = JOptionPane.showInputDialog("Ingrese el nuevo cliente:");

                int dia = Integer.parseInt(nuevoDia);
                int mes = Integer.parseInt(nuevoMes);
                int año = Integer.parseInt(nuevoAño);

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

                int cantidad = Integer.parseInt(nuevaCantidad);

                registroVentas.editarVenta(index, fecha, cantidad, nuevoCliente);
                actualizarComboBox(); // Actualizar el JComboBox después de editar una venta

                resultadoArea.append("Venta editada: " + index + "\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: Índice, fecha o cantidad inválidos. Deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
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
        add(eliminarButton);
        add(editarButton);
        add(new JScrollPane(resultadoArea));

        add(new JLabel("Venta:"));
        add(ventaComboBox); // Agregar el JComboBox a la GUI

        setSize(640, 460);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    // Método para actualizar el JComboBox cada vez que se agrega, edita o elimina una venta
    private void actualizarComboBox() {
        ventaComboBox.removeAllItems();
        for (int i = 0; i < registroVentas.getVentas().size(); i++) {
            ventaComboBox.addItem(i);
        }
    }

    public static void main(String[] args) {
        new comparación();
    }
}