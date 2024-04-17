package A_GestiónDatosDinámicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestiónDatosDinámicos_GUI extends JFrame {
    private GestiónDatosDinámicos_GUI gestionDatosDinamicos;
    private JTextField primerElementoField;
    private JTextField segundoElementoField;
    private JTextArea parejasArea;

    public GestiónDatosDinámicos_GUI() {
        gestionDatosDinamicos = new GestiónDatosDinámicos_GUI();

        setLayout(new FlowLayout());

        primerElementoField = new JTextField(10);
        segundoElementoField = new JTextField(10);
        JButton agregarButton = new JButton("Agregar Pareja");
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

        add(new JLabel("Primer Elemento:"));
        add(primerElementoField);
        add(new JLabel("Segundo Elemento:"));
        add(segundoElementoField);
        add(agregarButton);
        add(new JScrollPane(parejasArea));

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void actualizarParejasArea() {
        parejasArea.setText("");
        for (Pareja pareja : gestionDatosDinamicos.getParejas()) {
            parejasArea.append(pareja.getPrimerElemento() + ", " + pareja.getSegundoElemento() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GestiónDatosDinámicos_GUI());
    }
}