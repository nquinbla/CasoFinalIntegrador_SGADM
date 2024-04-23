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
        decoPanel.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel(new GridBagLayout());
        titlePanel.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;
        JLabel titleLabel = new JLabel("<html><h1 style='font-size: 60px;'><font color='black'>U</font><font color='black'>A</font><font color='#3679FA'>X</font></h1></html>");
        titleLabel.setOpaque(false);
        titlePanel.add(titleLabel, gbc);

        gbc.insets = new Insets(0, 0, 0, 0);
        JLabel universityLabel = new JLabel("<html><h2 style='font-size: 16px;'>Universidad Alfonso <font color='#3679FA'>X</font> el Sabio</h2></html>");
        universityLabel.setOpaque(false);
        titlePanel.add(universityLabel, gbc);

        JLabel subtitleLabel = new JLabel("<html><h2 style='font-size: 20px;'>Sistema de Gestión y Análisis de Datos</h2></html>");
        subtitleLabel.setOpaque(false);
        titlePanel.add(subtitleLabel, gbc);

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setOpaque(false);

        gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 0;
        gbc.insets = new Insets(10, 0, 10, 0);
        gbc.ipady = 0;

        JButton gestionDatosDinamicosButton = new JButton("Gestión de Datos Dinámicos \uD83D\uDCC8\u200B\uD83D\uDCC9\u200B");
        gestionDatosDinamicosButton.setOpaque(false);
        gestionDatosDinamicosButton.addActionListener(e -> new Main_A());
        buttonPanel.add(gestionDatosDinamicosButton, gbc);

        JButton analisisOrganizacionButton = new JButton("Análisis y Organización de Información \uD83D\uDDC4\uFE0F\u200Bℹ\uFE0F\u200B");
        analisisOrganizacionButton.setOpaque(false);
        analisisOrganizacionButton.addActionListener(e -> new Main_B());
        buttonPanel.add(analisisOrganizacionButton, gbc);

        JButton mapasAsociacionButton = new JButton("Mapas y Asociación de Datos \uD83D\uDDFA\uFE0F\u200B\uD83D\uDCCA\u200B");
        mapasAsociacionButton.setOpaque(false);
        mapasAsociacionButton.addActionListener(e -> new Main_C());
        buttonPanel.add(mapasAsociacionButton, gbc);

        JButton indexadorVisualizacionButton = new JButton("Indexador y Visualización de Archivos \uD83D\uDC41\uFE0F\u200B\uD83D\uDDC3\uFE0F\u200B");
        indexadorVisualizacionButton.setOpaque(false);
        indexadorVisualizacionButton.addActionListener(e -> new Main_D());
        buttonPanel.add(indexadorVisualizacionButton, gbc);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setOpaque(false);
        centerPanel.add(titlePanel);
        centerPanel.add(buttonPanel);
        decoPanel.add(centerPanel, BorderLayout.CENTER);

        JPanel iconPanel = new JPanel();
        iconPanel.setLayout(new BoxLayout(iconPanel, BoxLayout.Y_AXIS));
        iconPanel.setOpaque(false);

        JButton correoButton = new JButton(new ImageIcon(new ImageIcon("src/main/resources/image-icono-correo.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        correoButton.setBorderPainted(false);
        correoButton.setContentAreaFilled(false);
        correoButton.setFocusPainted(false);
        correoButton.setOpaque(false);
        correoButton.addActionListener(e -> new JFrame().setVisible(true));
        iconPanel.add(correoButton);

        JButton homeButton = new JButton(new ImageIcon(new ImageIcon("src/main/resources/image-icono-home.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setFocusPainted(false);
        homeButton.setOpaque(false);
        homeButton.addActionListener(e -> new JFrame().setVisible(true));
        iconPanel.add(homeButton);

        JButton menuButton = new JButton(new ImageIcon(new ImageIcon("src/main/resources/image-icono-menu.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        menuButton.setBorderPainted(false);
        menuButton.setContentAreaFilled(false);
        menuButton.setFocusPainted(false);
        menuButton.setOpaque(false);
        menuButton.addActionListener(e -> new JFrame().setVisible(true));
        iconPanel.add(menuButton);

        JButton usuarioButton = new JButton(new ImageIcon(new ImageIcon("src/main/resources/image-icono-usuario.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        usuarioButton.setBorderPainted(false);
        usuarioButton.setContentAreaFilled(false);
        usuarioButton.setFocusPainted(false);
        usuarioButton.setOpaque(false);
        usuarioButton.addActionListener(e -> new JFrame().setVisible(true));
        iconPanel.add(usuarioButton);

        decoPanel.add(iconPanel, BorderLayout.EAST);

        add(decoPanel, BorderLayout.CENTER);

        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}