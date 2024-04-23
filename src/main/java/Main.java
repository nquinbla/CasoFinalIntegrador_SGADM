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
        decoPanel.setLayout(new BoxLayout(decoPanel, BoxLayout.Y_AXIS));

        JPanel titlePanel = new JPanel(new GridBagLayout());
        titlePanel.setOpaque(false); // Hacer que titlePanel sea transparente
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;
        JLabel titleLabel = new JLabel("<html><h1 style='font-size: 60px;'><font color='black'>U</font><font color='black'>A</font><font color='#3679FA'>X</font></h1></html>");
        titlePanel.add(titleLabel, gbc);

        gbc.insets = new Insets(0, 0, 0, 0); // Reducir el espacio vertical
        JLabel universityLabel = new JLabel("<html><h2 style='font-size: 16px;'>Universidad Alfonso <font color='#3679FA'>X</font> el Sabio</h2></html>");
        titlePanel.add(universityLabel, gbc);

        JLabel subtitleLabel = new JLabel("<html><h2 style='font-size: 20px;'>Sistema de Gestión y Análisis de Datos</h2></html>");
        titlePanel.add(subtitleLabel, gbc);

        decoPanel.add(titlePanel);

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setOpaque(false);

        gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 0;
        gbc.insets = new Insets(10, 0, 10, 0); // Agregar espacio vertical entre los botones
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

        decoPanel.add(buttonPanel);

        JPanel iconPanel = new JPanel();
        iconPanel.setLayout(new BoxLayout(iconPanel, BoxLayout.Y_AXIS));
        iconPanel.setOpaque(false);

        JButton correoButton = new JButton(new ImageIcon(new ImageIcon("src/main/resources/image-icono-correo.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        correoButton.addActionListener(e -> new JFrame().setVisible(true));
        iconPanel.add(correoButton);

        JButton homeButton = new JButton(new ImageIcon(new ImageIcon("src/main/resources/image-icono-home.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        homeButton.addActionListener(e -> new JFrame().setVisible(true));
        iconPanel.add(homeButton);

        JButton menuButton = new JButton(new ImageIcon(new ImageIcon("src/main/resources/image-icono-menu.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        menuButton.addActionListener(e -> new JFrame().setVisible(true));
        iconPanel.add(menuButton);

        JButton usuarioButton = new JButton(new ImageIcon(new ImageIcon("src/main/resources/image-icono-usuario.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
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