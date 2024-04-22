package B_AnálisisYOrganizaciónInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class GUI_Ventas extends JFrame {
    private RegistroVentas registroVentas;
    private JTextField diaField, mesField, añoField, cantidadField, clienteField;
    private JTextArea resultadoArea;
    private JComboBox<String> ventaComboBox;

    public GUI_Ventas() {
        registroVentas = new RegistroVentas();

        setLayout(new FlowLayout());

        diaField = new JTextField(2);
        mesField = new JTextField(2);
        añoField = new JTextField(4);
        cantidadField = new JTextField(10);
        clienteField = new JTextField(10);
        resultadoArea = new JTextArea(20, 30);
        ventaComboBox = new JComboBox<>();


        String[] opcionesOrdenacion = { "Por Fecha", "Por Cantidad", "Por Cliente" };
        JComboBox<String> comboBoxOrdenacion = new JComboBox<>(opcionesOrdenacion);

        comboBoxOrdenacion.addActionListener(e -> {
            String seleccion = (String) comboBoxOrdenacion.getSelectedItem();

            TreeSet<Venta> ventasOrdenadas;
            switch (seleccion) {
                case "Por Fecha":
                    ventasOrdenadas = registroVentas.getVentasPorFecha();
                    break;
                case "Por Cantidad":
                    ventasOrdenadas = registroVentas.getVentasPorCantidad();
                    break;
                case "Por Cliente":
                default:
                    ventasOrdenadas = registroVentas.getVentasPorCliente();
                    break;
            }

            resultadoArea.setText("");
            for (Venta venta : ventasOrdenadas) {
                resultadoArea.append(venta.getCliente() + "\n");
            }
        });

// Agregar el JComboBox a tu GUI
        add(new JLabel("Ordenar:"));
        add(comboBoxOrdenacion);


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
                actualizarComboBox();

                resultadoArea.append("Venta agregada: " + venta.getCliente() + "\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: Fecha, cantidad o cliente inválido. Debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton eliminarButton = new JButton("Eliminar Venta");
        eliminarButton.addActionListener(e -> {
            String clienteSeleccionado = (String) ventaComboBox.getSelectedItem();

            Venta ventaAEliminar = null;
            for (Venta venta : registroVentas.getVentasPorCliente()) { // Corrección aquí
                if (venta.getCliente().equals(clienteSeleccionado)) {
                    ventaAEliminar = venta;
                    break;
                }
            }

            if (ventaAEliminar == null) {
                JOptionPane.showMessageDialog(null, "Error: No se encontró la venta.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            registroVentas.eliminarVenta(ventaAEliminar); // Corrección aquí
            actualizarComboBox();

            resultadoArea.append("Venta eliminada: " + clienteSeleccionado + "\n");
        });

        JButton editarButton = new JButton("Editar Venta");
        editarButton.addActionListener(e -> {
            try {
                String clienteSeleccionado = (String) ventaComboBox.getSelectedItem(); // Obtener el nombre del cliente seleccionado del JComboBox

                Venta ventaAEditar = null;
                for (Venta venta : registroVentas.getVentasPorCliente()) {
                    if (venta.getCliente().equals(clienteSeleccionado)) {
                        ventaAEditar = venta;
                        break;
                    }
                }

                if (ventaAEditar == null) {
                    JOptionPane.showMessageDialog(null, "Error: No se encontró la venta.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

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

                Venta ventaNueva = new Venta(fecha, cantidad, nuevoCliente);
                registroVentas.editarVenta(ventaAEditar, ventaNueva);
                actualizarComboBox();

                resultadoArea.append("Venta editada: " + nuevoCliente + "\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: Fecha o cantidad inválidos. Deben ser números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton ayudaButton = new JButton();
        ImageIcon ayudaIcon = new ImageIcon("src/main/resources/image-icono-ayuda.png");
        ayudaButton.setIcon(ayudaIcon);

        ayudaButton.addActionListener(e -> {

            JFrame ayudaFrame = new JFrame("Ayuda");
            ayudaFrame.setLayout(new FlowLayout());

            JTextArea ayudaArea = new JTextArea(13, 50);
            ayudaArea.setText("Ayuda ℹ\uFE0F\u200B :\n\n" +
                    "1. Ingrese el día, mes y año de la venta.\n" +
                    "2. Ingrese la cantidad de productos vendidos.\n" +
                    "3. Ingrese el nombre del cliente, este no debe repetirse.\n" +
                    "4. Haga clic en 'Agregar Venta' para agregar la venta.\n" +
                    "5. Seleccione un cliente de la lista desplegable.\n" +
                    "6. Haga clic en 'Eliminar Venta' para eliminar la venta seleccionada.\n" +
                    "7. Haga clic en 'Editar Venta' para editar la venta seleccionada.\n" +
                    "8. Seleccione una opción de ordenación de la lista desplegable 'Ordenar:' para ordenar las ventas.\n" +
                    "9. Haga clic en 'Ayuda' para mostrar esta ventana de ayuda.\n\n" +
                    "Nota: Las ventas se ordenan por cliente en la lista desplegable.");
            ayudaArea.setEditable(false);

            ayudaFrame.add(new JScrollPane(ayudaArea));

            ayudaFrame.setSize(575, 280);
            ayudaFrame.setLocationRelativeTo(null);
            ayudaFrame.setVisible(true);
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
        add(ayudaButton);
        add(new JScrollPane(resultadoArea));

        add(new JLabel("Venta:"));
        add(ventaComboBox); // Agregar el JComboBox a la GUI

        setSize(700, 470);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void actualizarComboBox() {
        ventaComboBox.removeAllItems();
        for (Venta venta : registroVentas.getVentasPorCliente()) { // Corrección aquí
            ventaComboBox.addItem(venta.getCliente());
        }
    }

    public static void main(String[] args) {
        new GUI_Ventas();
    }
}