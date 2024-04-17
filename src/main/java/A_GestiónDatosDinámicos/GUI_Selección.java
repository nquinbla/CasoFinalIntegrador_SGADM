package A_GestiónDatosDinámicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Selección extends JFrame {
    public GUI_Selección() {
        setLayout(new FlowLayout());

        JButton parejasButton = new JButton("Trabajar con Parejas");
        JButton matricesButton = new JButton("Trabajar con Matrices");

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

        add(parejasButton);
        add(matricesButton);

        setSize(300, 120);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI_Selección());
    }
}
