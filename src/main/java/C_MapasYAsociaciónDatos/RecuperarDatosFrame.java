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
        recuperarButton.addActionListener(e -> {
            String tipoDatos = (String) tipoDatosComboBox.getSelectedItem();
            String input = inputField.getText();
            switch (tipoDatos) {
                case "Texto":
                    // Aquí puedes usar el valor de input para recuperar los datos correspondientes
                    // usando el objeto recuperadorEficiente
                    break;
                case "Número":
                    // Aquí puedes usar el valor de input para recuperar los datos correspondientes
                    // usando el objeto recuperadorEficiente
                    break;
                case "Letras":
                    // Aquí puedes usar el valor de input para recuperar los datos correspondientes
                    // usando el objeto recuperadorEficiente
                    break;
                case "Palabras":
                    // Aquí puedes usar el valor de input para recuperar los datos correspondientes
                    // usando el objeto recuperadorEficiente
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