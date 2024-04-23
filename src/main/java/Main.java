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

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setOpaque(false); // Hacer que titlePanel sea transparente
        JLabel titleLabel = new JLabel("<html><h1>UAX</h1></html>", SwingConstants.LEFT);
        JLabel subtitleLabel = new JLabel("<html><h2>Sistema de Gestión y Análisis de Datos</h2></html>", SwingConstants.LEFT);
        titlePanel.add(titleLabel);
        titlePanel.add(subtitleLabel);

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

        decoPanel.add(titlePanel); // Añade titlePanel a decoPanel
        decoPanel.add(buttonPanel); // Añade buttonPanel a decoPanel

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