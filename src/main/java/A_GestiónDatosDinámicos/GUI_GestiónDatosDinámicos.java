package A_GestiónDatosDinámicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_GestiónDatosDinámicos extends JFrame {
    private GestiónDatosDinámicos gestionDatosDinamicos;
    private JTextField primerElementoField;
    private JTextField segundoElementoField;
    private JTextArea parejasArea;

    public GUI_GestiónDatosDinámicos() {
        gestionDatosDinamicos = new GestiónDatosDinámicos();

        setLayout(new FlowLayout());

        primerElementoField = new JTextField(10);
        segundoElementoField = new JTextField(10);
        JButton agregarButton = new JButton("Agregar Pareja");
        JButton eliminarButton = new JButton("Eliminar Pareja");
        JButton modificarButton = new JButton("Modificar Pareja");
        parejasArea = new JTextArea(10, 30);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int primerElemento = Integer.parseInt(primerElementoField.getText());
                int segundoElemento = Integer.parseInt(segundoElementoField.getText());
                Pareja pareja = new Pareja(primerElemento, segundoElemento);
                gestionDatosDinamicos.agregarPareja(pareja);
                actualizarParejasArea();
            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int primerElemento = Integer.parseInt(primerElementoField.getText());
                int segundoElemento = Integer.parseInt(segundoElementoField.getText());
                Pareja pareja = new Pareja(primerElemento, segundoElemento);
                gestionDatosDinamicos.eliminarPareja(pareja);
                actualizarParejasArea();
            }
        });

        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice de la pareja a modificar"));
                int primerElemento = Integer.parseInt(primerElementoField.getText());
                int segundoElemento = Integer.parseInt(segundoElementoField.getText());
                Pareja nuevaPareja = new Pareja(primerElemento, segundoElemento);
                gestionDatosDinamicos.modificarPareja(index, nuevaPareja);
                actualizarParejasArea();
            }
        });

        add(new JLabel("Primer Elemento:"));
        add(primerElementoField);
        add(new JLabel("Segundo Elemento:"));
        add(segundoElementoField);
        add(agregarButton);
        add(eliminarButton);
        add(modificarButton);
        add(new JScrollPane(parejasArea));

        setSize(550, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void actualizarParejasArea() {
        parejasArea.setText("");
        for (Pareja pareja : gestionDatosDinamicos.getParejas()) {
            parejasArea.append(pareja.getPrimerElemento() + ", " + pareja.getSegundoElemento() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI_GestiónDatosDinámicos());
    }
}