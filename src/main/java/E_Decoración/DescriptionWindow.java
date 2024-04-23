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
        textArea.setText("Gestión de Datos Dinámicos: permite trabajar con diferentes opciones de datos, como la creación de tablas, gráficos y la importación y exportación de datos.\n" +
                "Análisis y Organización de Información: permite analizar y organizar la información de diferentes maneras, como la creación de informes y la clasificación de datos.\n" +
                "Mapas y Asociación de Datos: permite trabajar con mapas y asociar datos a diferentes elementos, como la creación de mapas y la asociación de datos a elementos de un mapa.\n" +
                "Decoración: permite personalizar la interfaz de usuario con diferentes elementos decorativos, como imágenes y colores personalizados.");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}