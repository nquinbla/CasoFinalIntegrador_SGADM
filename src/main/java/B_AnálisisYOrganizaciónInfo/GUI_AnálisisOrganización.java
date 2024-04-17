package B_AnálisisYOrganizaciónInfo;
// Clase GUI_AnalisisOrganizacion
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI_AnálisisOrganización extends JFrame {
    private AnalizadorRegistros analizador;

    public GUI_AnálisisOrganización() {
        this.analizador = new AnalizadorRegistros();
        setLayout(new FlowLayout());

        JButton agregarButton = new JButton("Agregar Registro");
        JButton ordenarNombreButton = new JButton("Ordenar por Nombre");
        JButton ordenarVentaButton = new JButton("Ordenar por Venta");
        JButton filtrarVentaButton = new JButton("Filtrar por Venta");

        // Agregar funcionalidad a los botones...
        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Nombre:");
                double venta = Double.parseDouble(JOptionPane.showInputDialog("Venta:"));
                analizador.agregarRegistro(new Registro(nombre, venta));
            }
        });

        ordenarNombreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String registros = "";
                for (Registro registro : analizador.ordenarPorNombre()) {
                    registros += registro.getNombre() + " - " + registro.getVenta() + "\n";
                }
                JOptionPane.showMessageDialog(null, registros);
            }
        });

        ordenarVentaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String registros = "";
                for (Registro registro : analizador.ordenarPorVenta()) {
                    registros += registro.getNombre() + " - " + registro.getVenta() + "\n";
                }
                JOptionPane.showMessageDialog(null, registros);
            }
        });

        filtrarVentaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double minVenta = Double.parseDouble(JOptionPane.showInputDialog("Venta mínima:"));
                String registros = "";
                for (Registro registro : analizador.filtrarPorVenta(minVenta)) {
                    registros += registro.getNombre() + " - " + registro.getVenta() + "\n";
                }
                JOptionPane.showMessageDialog(null, registros);
            }
        });

        add(agregarButton);
        add(ordenarNombreButton);
        add(ordenarVentaButton);
        add(filtrarVentaButton);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_AnálisisOrganización();
    }
}