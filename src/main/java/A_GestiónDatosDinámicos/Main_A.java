package A_GestiónDatosDinámicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_A extends JFrame {
    public Main_A() {
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.LIGHT_GRAY);

        Font buttonFont = new Font("Arial", Font.BOLD, 14);
        Color buttonTextColor = Color.WHITE;
        Color buttonBackgroundColor = Color.DARK_GRAY;

        JLabel instructionLabel = new JLabel("Por favor, seleccione el campo con el que quiere trabajar");

        JButton parejasButton = new JButton("Trabajar con Parejas");
        parejasButton.setFont(buttonFont);
        parejasButton.setForeground(buttonTextColor);
        parejasButton.setBackground(buttonBackgroundColor);

        JButton matricesButton = new JButton("Trabajar con Matrices");
        matricesButton.setFont(buttonFont);
        matricesButton.setForeground(buttonTextColor);
        matricesButton.setBackground(buttonBackgroundColor);

        JButton cadenasButton = new JButton("Trabajar con Cadenas");
        cadenasButton.setFont(buttonFont);
        cadenasButton.setForeground(buttonTextColor);
        cadenasButton.setBackground(buttonBackgroundColor);

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