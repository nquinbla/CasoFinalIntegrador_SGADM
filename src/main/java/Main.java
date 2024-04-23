import A_GestiónDatosDinámicos.Main_A;
import B_AnálisisYOrganizaciónInfo.Main_B;
import C_MapasYAsociaciónDatos.Main_C;
import D_IndexYVisualArchivos.Main_D;
import E_Decoración.DecoPanel;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setLayout(new BorderLayout());

        DecoPanel decoPanel = new DecoPanel();
        add(decoPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setOpaque(false);

        JButton gestionDatosDinamicosButton = new JButton("Gestión de Datos Dinámicos \uD83D\uDCC8\u200B\uD83D\uDCC9\u200B");
        gestionDatosDinamicosButton.addActionListener(e -> new Main_A());

        JButton analisisOrganizacionButton = new JButton("Análisis y Organización de Información \uD83D\uDDC4\uFE0F\u200Bℹ\uFE0F\u200B");
        analisisOrganizacionButton.addActionListener(e -> new Main_B());

        JButton mapasAsociacionButton = new JButton("Mapas y Asociación de Datos \uD83D\uDDFA\uFE0F\u200B\uD83D\uDCCA\u200B");
        mapasAsociacionButton.addActionListener(e -> new Main_C());

        JButton indexadorVisualizacionButton = new JButton("Indexador y Visualización de Archivos \uD83D\uDC41\uFE0F\u200B\uD83D\uDDC3\uFE0F\u200B");
        indexadorVisualizacionButton.addActionListener(e -> new Main_D());

        buttonPanel.add(gestionDatosDinamicosButton);
        buttonPanel.add(analisisOrganizacionButton);
        buttonPanel.add(mapasAsociacionButton);
        buttonPanel.add(indexadorVisualizacionButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}