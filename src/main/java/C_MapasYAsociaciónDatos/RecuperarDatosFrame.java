package C_MapasYAsociaciónDatos;

import javax.swing.*;
import java.awt.*;

public class RecuperarDatosFrame extends JFrame {
    private RecuperadorEficiente<Integer, String> recuperadorEficiente;
    private JComboBox<String> tipoDatosComboBox;
    private JTextField inputField;

    public RecuperarDatosFrame(RecuperadorEficiente<Integer, String> recuperadorEficiente) {
        this.recuperadorEficiente = recuperadorEficiente;

        setLayout(new FlowLayout());

        tipoDatosComboBox = new JComboBox<>(new String[] {"Texto", "Número", "Letras", "Palabras"});
        inputField = new JTextField(20);

        JButton recuperarButton = new JButton("Recuperar Datos");

        getContentPane().setBackground(Color.LIGHT_GRAY);
        recuperarButton.setForeground(Color.WHITE);
        recuperarButton.setBackground(Color.BLUE);
        recuperarButton.setFont(new Font("Arial", Font.BOLD, 14));

        recuperarButton.addActionListener(e -> {
            String tipoDatos = (String) tipoDatosComboBox.getSelectedItem();
            String input = inputField.getText();
            switch (tipoDatos) {
                case "Texto":
                    // Si el usuario selecciona "Texto", asumimos que el input es un número y lo convertimos a texto
                    try {
                        int numero = Integer.parseInt(input);
                        String texto = recuperadorEficiente.recuperarDato(numero);
                        JOptionPane.showMessageDialog(null, "El texto para " + numero + " es: " + texto);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                    }
                    break;
                case "Número":
                    // Si el usuario selecciona "Número", asumimos que el input es un texto y lo convertimos a número
                    Integer numero = Integer.valueOf(recuperadorEficiente.recuperarDatoPorCriterio(s -> s.equals(input)).orElse(null));
                    if (numero != null) {
                        JOptionPane.showMessageDialog(null, "El número para " + input + " es: " + numero);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró un número para: " + input);
                    }
                    break;
                case "Letras":
                    // Si el usuario selecciona "Letras", asumimos que el input es un número y devolvemos la cantidad de letras en su representación textual
                    try {
                        int numeroLetras = Integer.parseInt(input);
                        String texto = recuperadorEficiente.recuperarDato(numeroLetras);
                        JOptionPane.showMessageDialog(null, "La cantidad de letras para " + numeroLetras + " es: " + (texto != null ? texto.length() : "N/A"));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                    }
                    break;
                case "Palabras":
                    // Si el usuario selecciona "Palabras", asumimos que el input es un número y devolvemos la cantidad de palabras en su representación textual
                    try {
                        int numeroPalabras = Integer.parseInt(input);
                        String texto = recuperadorEficiente.recuperarDato(numeroPalabras);
                        long cantidadPalabras = texto != null ? texto.split("\\s+").length : 0;
                        JOptionPane.showMessageDialog(null, "La cantidad de palabras para " + numeroPalabras + " es: " + cantidadPalabras);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                    }
                    break;
            }
        });

        add(new JLabel("Tipo de Datos:"));
        add(tipoDatosComboBox);
        add(new JLabel("Input:"));
        add(inputField);
        add(recuperarButton);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}