package D_IndexYVisualArchivos;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.Map;

public class GUI_Archivos extends JFrame {
    private final IndexadorRecursivo indexadorRecursivo = new IndexadorRecursivo();
    private final OrdenadorYListador ordenadorYListador = new OrdenadorYListador();

    public GUI_Archivos() {
        setLayout(new FlowLayout());

        ImageIcon imageIcon = new ImageIcon("src/main/resources/image-icono-subida-archivos.png");
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH); // redimensiona la imagen
        imageIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(imageLabel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton indexarButton = new JButton("Indexar Archivos");
        indexarButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int seleccion = fileChooser.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File directorio = fileChooser.getSelectedFile();
                indexadorRecursivo.indexar(directorio);
                for (Map.Entry<String, String> entrada : indexadorRecursivo.getIndex().entrySet()) {
                    ordenadorYListador.agregar(entrada.getKey(), entrada.getValue());
                }
                JOptionPane.showMessageDialog(this, "Indexación completada");
            }
        });

        JButton listarButton = new JButton("Listar Archivos");
        listarButton.addActionListener(e -> {
            List<String> lista = ordenadorYListador.listar();
            JTextArea textArea = new JTextArea(20, 50);
            for (String s : lista) {
                textArea.append(s + "\n");
            }
            JOptionPane.showMessageDialog(this, new JScrollPane(textArea));
        });

        buttonPanel.add(indexarButton);
        buttonPanel.add(listarButton);

        add(buttonPanel);

        setSize(500, 240);
        setTitle("Listado de Archivos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI_Archivos();
    }
}