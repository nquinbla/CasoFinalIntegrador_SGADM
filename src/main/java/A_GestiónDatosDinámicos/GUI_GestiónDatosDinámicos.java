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

        getContentPane().setBackground(Color.LIGHT_GRAY);

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
                try {
                    int primerElemento = Integer.parseInt(primerElementoField.getText());
                    int segundoElemento = Integer.parseInt(segundoElementoField.getText());
                    Pareja pareja = new Pareja(primerElemento, segundoElemento);
                    gestionDatosDinamicos.agregarPareja(pareja);
                    actualizarParejasArea();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números enteros.");
                }
            }
        });

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int primerElemento = Integer.parseInt(primerElementoField.getText());
                    int segundoElemento = Integer.parseInt(segundoElementoField.getText());
                    Pareja pareja = new Pareja(primerElemento, segundoElemento);
                    gestionDatosDinamicos.eliminarPareja(pareja);
                    actualizarParejasArea();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números enteros.");
                }
            }
        });

        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int primerElemento = Integer.parseInt(primerElementoField.getText());
                    int segundoElemento = Integer.parseInt(segundoElementoField.getText());
                    Pareja pareja = new Pareja(primerElemento, segundoElemento);
                    int index = gestionDatosDinamicos.getParejas().indexOf(pareja);
                    if (index != -1) {
                        int nuevoPrimerElemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo primer elemento de la pareja"));
                        int nuevoSegundoElemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo segundo elemento de la pareja"));
                        Pareja nuevaPareja = new Pareja(nuevoPrimerElemento, nuevoSegundoElemento);
                        gestionDatosDinamicos.modificarPareja(index, nuevaPareja);
                        actualizarParejasArea();
                    } else {
                        JOptionPane.showMessageDialog(null, "La pareja no se encuentra en la lista.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números enteros.");
                }
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