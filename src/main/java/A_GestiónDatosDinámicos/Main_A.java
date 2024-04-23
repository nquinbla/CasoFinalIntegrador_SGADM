package A_GestiónDatosDinámicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_A extends JFrame {
    public Main_A() {
        setLayout(new FlowLayout());

        JLabel instructionLabel = new JLabel("Por favor, seleccione el campo con el que quiere trabajar");
        JButton parejasButton = new JButton("Trabajar con Parejas");
        JButton matricesButton = new JButton("Trabajar con Matrices");
        JButton cadenasButton = new JButton("Trabajar con Cadenas");

        parejasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI_GestiónDatosDinámicos("parejas");
                dispose();
            }
        });

        matricesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI_GestiónDatosDinámicos("matrices");
                dispose();
            }
        });

        cadenasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI_GestiónDatosDinámicos("cadenas");
                dispose();
            }
        });

        add(instructionLabel);
        add(parejasButton);
        add(matricesButton);
        add(cadenasButton);

        setSize(370, 140);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main_A());
    }
}