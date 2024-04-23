package C_MapasYAsociaciónDatos;

import javax.swing.*;
import java.awt.*;

public class RecuperarDatosFrame extends JFrame {
    private RecuperadorEficiente<Integer, String> recuperadorEficiente;
    private JTextField tipoDatosField;

    public RecuperarDatosFrame(RecuperadorEficiente<Integer, String> recuperadorEficiente) {
        this.recuperadorEficiente = recuperadorEficiente;

        setLayout(new FlowLayout());

        tipoDatosField = new JTextField(20);
        JButton recuperarButton = new JButton("Recuperar Datos");
        recuperarButton.addActionListener(e -> {
            String tipoDatos = tipoDatosField.getText();
            // Aquí puedes usar el valor de tipoDatos para recuperar los datos correspondientes
            // usando el objeto recuperadorEficiente
        });

        add(new JLabel("Tipo de Datos:"));
        add(tipoDatosField);
        add(recuperarButton);

        setSize(300, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}