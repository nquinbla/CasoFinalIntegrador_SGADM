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
        setTitle("Sistema de Gestión Y Análisis de Datos Multidimensionales");

        DecoPanel decoPanel = new DecoPanel();
        decoPanel.setLayout(new BoxLayout(decoPanel, BoxLayout.X_AXIS));

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 0;
        gbc.insets = new Insets(0, 0, 0, 0);
        gbc.ipady = 0;

        JButton gestionDatosDinamicosButton = new JButton("Gestión de Datos Dinámicos \uD83D\uDCC8\u200B\uD83D\uDCC9\u200B");
        gestionDatosDinamicosButton.addActionListener(e -> new Main_A());
        buttonPanel.add(gestionDatosDinamicosButton, gbc);

        JButton analisisOrganizacionButton = new JButton("Análisis y Organización de Información \uD83D\uDDC4\uFE0F\u200Bℹ\uFE0F\u200B");
        analisisOrganizacionButton.addActionListener(e -> new Main_B());
        buttonPanel.add(analisisOrganizacionButton, gbc);

        JButton mapasAsociacionButton = new JButton("Mapas y Asociación de Datos \uD83D\uDDFA\uFE0F\u200B\uD83D\uDCCA\u200B");
        mapasAsociacionButton.addActionListener(e -> new Main_C());
        buttonPanel.add(mapasAsociacionButton, gbc);

        JButton indexadorVisualizacionButton = new JButton("Indexador y Visualización de Archivos \uD83D\uDC41\uFE0F\u200B\uD83D\uDDC3\uFE0F\u200B");
        indexadorVisualizacionButton.addActionListener(e -> new Main_D());
        buttonPanel.add(indexadorVisualizacionButton, gbc);

        decoPanel.add(Box.createHorizontalStrut(400)); // Añade un componente de relleno invisible con un tamaño específico
        decoPanel.add(buttonPanel);

        add(decoPanel, BorderLayout.CENTER);

        setSize(1200, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}