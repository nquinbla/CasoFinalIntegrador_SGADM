import A_GestiónDatosDinámicos.Main_B;
import B_AnálisisYOrganizaciónInfo.GUI_Ventas;
import C_MapasYAsociaciónDatos.GUI_Relaciones;
import D_IndexYVisualArchivos.GUI_Archivos;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setLayout(new FlowLayout());

        JButton gestionDatosDinamicosButton = new JButton("Gestión de Datos Dinámicos");
        gestionDatosDinamicosButton.addActionListener(e -> new Main_B());

        JButton analisisOrganizacionButton = new JButton("Análisis y Organización de Información");
        analisisOrganizacionButton.addActionListener(e -> new GUI_Ventas());

        JButton mapasAsociacionButton = new JButton("Mapas y Asociación de Datos");
        mapasAsociacionButton.addActionListener(e -> new GUI_Relaciones());

        JButton indexadorVisualizacionButton = new JButton("Indexador y Visualización de Archivos");
        indexadorVisualizacionButton.addActionListener(e -> new GUI_Archivos());

        add(gestionDatosDinamicosButton);
        add(analisisOrganizacionButton);
        add(mapasAsociacionButton);
        add(indexadorVisualizacionButton);

        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}