package E_Decoración;

import javax.swing.*;
import java.awt.*;

public class DescriptionWindow extends JFrame {
    public DescriptionWindow() {
        setTitle("Descripción de las funciones");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setText("Gestión de Datos Dinámicos: Esta función permite...\n" +
                "Análisis y Organización de Información: Esta función permite...\n" +
                "Mapas y Asociación de Datos: Esta función permite...\n" +
                "Indexador y Visualización de Archivos: Esta función permite...");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}