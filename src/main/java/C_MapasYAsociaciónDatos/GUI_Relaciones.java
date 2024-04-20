package C_MapasYAsociaciónDatos;

import javax.swing.*;
import java.awt.*;

public class GUI_Relaciones extends JFrame {
    private GestorRelaciones<String, String> gestorRelaciones;
    private RecuperadorEficiente<String, String> recuperadorEficiente;

    public GUI_Relaciones() {
        gestorRelaciones = new GestorRelaciones<>();
        recuperadorEficiente = new RecuperadorEficiente<>();

        setLayout(new FlowLayout());

        JButton gestionarRelacionesButton = new JButton("Gestionar Relaciones");
        gestionarRelacionesButton.addActionListener(e -> {
            String clave = JOptionPane.showInputDialog("Ingrese la clave:");
            String valor = JOptionPane.showInputDialog("Ingrese el valor:");
            gestorRelaciones.agregarRelacion(clave, valor);
            JOptionPane.showMessageDialog(null, "Relación agregada: " + clave + " -> " + valor);
        });

        JButton recuperarDatosButton = new JButton("Recuperar Datos");
        recuperarDatosButton.addActionListener(e -> {
            String clave = JOptionPane.showInputDialog("Ingrese la clave:");
            String valor = recuperadorEficiente.recuperarDato(clave);
            if (valor != null) {
                JOptionPane.showMessageDialog(null, "Valor recuperado: " + valor);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un valor para la clave: " + clave);
            }
        });

        add(gestionarRelacionesButton);
        add(recuperarDatosButton);

        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_Relaciones();
    }
}
