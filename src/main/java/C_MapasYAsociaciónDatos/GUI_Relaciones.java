package C_MapasYAsociaciónDatos;

import javax.swing.*;
import java.awt.*;

public class GUI_Relaciones extends JFrame {
    private GestorRelaciones<Integer, String> numerosYLetras;
    private GestorRelaciones<Integer, String> numerosYTextos;

    public GUI_Relaciones() {
        numerosYLetras = new GestorRelaciones<>();
        numerosYLetras.agregarRelacion(1, "A");
        numerosYLetras.agregarRelacion(2, "B");
        numerosYLetras.agregarRelacion(3, "C");

        // ...

        numerosYTextos = new GestorRelaciones<>();
        numerosYTextos.agregarRelacion(1, "uno");
        numerosYTextos.agregarRelacion(2, "dos");
        // ...

        setLayout(new FlowLayout());

        JButton gestionarRelacionesButton = new JButton("Gestionar Relaciones");
        gestionarRelacionesButton.addActionListener(e -> {
            Integer clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            String valorLetra = numerosYLetras.obtenerValor(clave);
            String valorTexto = numerosYTextos.obtenerValor(clave);
            JOptionPane.showMessageDialog(null, "Para el número " + clave + ", la letra es: " + valorLetra + " y el texto es: " + valorTexto);
        });

        JButton recuperarDatosButton = new JButton("Recuperar Datos");
        recuperarDatosButton.addActionListener(e -> {
            String clave = JOptionPane.showInputDialog("Ingrese una letra o texto:");
            Integer valorNumero = numerosYLetras.existeRelacion(clave) ? numerosYLetras.obtenerValor(clave) : numerosYTextos.obtenerValor(clave);
            if (valorNumero != null) {
                JOptionPane.showMessageDialog(null, "El número para " + clave + " es: " + valorNumero);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un número para: " + clave);
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