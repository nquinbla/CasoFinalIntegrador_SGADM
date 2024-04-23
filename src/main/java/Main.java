import A_GestiónDatosDinámicos.Main_A;
import B_AnálisisYOrganizaciónInfo.Main_B;
import C_MapasYAsociaciónDatos.GUI_Relaciones;
import D_IndexYVisualArchivos.Main_D;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setLayout(new FlowLayout());

        JButton gestionDatosDinamicosButton = new JButton("Gestión de Datos Dinámicos");
        gestionDatosDinamicosButton.addActionListener(e -> new Main_A());

        JButton analisisOrganizacionButton = new JButton("Análisis y Organización de Información");
        analisisOrganizacionButton.addActionListener(e -> new Main_B());

        JButton mapasAsociacionButton = new JButton("Mapas y Asociación de Datos");
        mapasAsociacionButton.addActionListener(e -> new GUI_Relaciones());

        JButton indexadorVisualizacionButton = new JButton("Indexador y Visualización de Archivos");
        indexadorVisualizacionButton.addActionListener(e -> new Main_D());

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