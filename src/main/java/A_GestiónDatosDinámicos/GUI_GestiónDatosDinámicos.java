package A_GestiónDatosDinámicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_GestiónDatosDinámicos extends JFrame {
    private GestiónDatosDinámicos gestionDatosDinamicos;
    private JTextField primerElementoField;
    private JTextField segundoElementoField;
    private JTextField tercerElementoField;
    private JTextArea datosArea;
    private int matrizSeleccionada = -1;

    public GUI_GestiónDatosDinámicos(String tipo) {
        gestionDatosDinamicos = new GestiónDatosDinámicos();

        Color lightBlueGray = Color.decode("#B0C4DE");
        getContentPane().setBackground(lightBlueGray); // color personalizado

        setLayout(new FlowLayout());

        primerElementoField = new JTextField(10);
        segundoElementoField = new JTextField(10);
        tercerElementoField = new JTextField(10); // Nuevo campo para la matriz
        JButton agregarButton = new JButton("Agregar " + tipo);
        JButton eliminarButton = new JButton("Eliminar " + tipo);
        JButton modificarButton = new JButton("Modificar " + tipo);
        datosArea = new JTextArea(10, 30);

        if (tipo.equals("parejas")) {
            agregarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int primerElemento = Integer.parseInt(primerElementoField.getText());
                        int segundoElemento = Integer.parseInt(segundoElementoField.getText());
                        Pareja_Enteros parejaEnteros = new Pareja_Enteros(primerElemento, segundoElemento);
                        gestionDatosDinamicos.agregarPareja(parejaEnteros);
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
                        Pareja_Enteros parejaEnteros = new Pareja_Enteros(primerElemento, segundoElemento);
                        gestionDatosDinamicos.eliminarPareja(parejaEnteros);
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
                        Pareja_Enteros parejaEnteros = new Pareja_Enteros(primerElemento, segundoElemento);
                        int index = gestionDatosDinamicos.getParejas().indexOf(parejaEnteros);
                        if (index != -1) {
                            int nuevoPrimerElemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo primer elemento de la parejaEnteros"));
                            int nuevoSegundoElemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo segundo elemento de la parejaEnteros"));
                            Pareja_Enteros nuevaParejaEnteros = new Pareja_Enteros(nuevoPrimerElemento, nuevoSegundoElemento);
                            gestionDatosDinamicos.modificarPareja(index, nuevaParejaEnteros);
                            actualizarParejasArea();
                        } else {
                            JOptionPane.showMessageDialog(null, "La parejaEnteros no se encuentra en la lista.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números enteros.");
                    }
                }
            });
        } else if (tipo.equals("matrices")) {
            // En el ActionListener del botón de agregar
            agregarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int filas = Integer.parseInt(primerElementoField.getText());
                        int columnas = Integer.parseInt(segundoElementoField.getText());
                        int[][] elementos = new int[filas][columnas];
                        for (int i = 0; i < filas; i++) {
                            for (int j = 0; j < columnas; j++) {
                                elementos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del elemento en la fila " + (i+1) + " y la columna " + (j+1)));
                            }
                        }
                        Pareja_Matriz parejaMatriz = new Pareja_Matriz(elementos);
                        gestionDatosDinamicos.agregarMatriz(parejaMatriz);
                        matrizSeleccionada = gestionDatosDinamicos.getMatrices().size() - 1;
                        actualizarMatricesArea();
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números enteros.");
                    }
                }
            });
            eliminarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (matrizSeleccionada != -1) {
                        gestionDatosDinamicos.eliminarMatriz(matrizSeleccionada);
                        matrizSeleccionada = -1;
                        actualizarMatricesArea();
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, seleccione una matriz.");
                    }
                }
            });
            modificarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (matrizSeleccionada != -1) {
                        try {
                            int nuevasFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las nuevas filas de la matriz"));
                            int nuevasColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las nuevas columnas de la matriz"));
                            Pareja_Matriz nuevaParejaMatriz = new Pareja_Matriz(nuevasFilas, nuevasColumnas);
                            gestionDatosDinamicos.modificarMatriz(matrizSeleccionada, nuevaParejaMatriz);
                            actualizarMatricesArea();
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números enteros.");}
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, seleccione una matriz.");
                    }
                }
            });
        } else if (tipo.equals("cadenas")) {
            // En el ActionListener del botón de agregar
            agregarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String primerElemento = primerElementoField.getText();
                    String segundoElemento = segundoElementoField.getText();
                    Pareja_Cadenas cadena = new Pareja_Cadenas(primerElemento, segundoElemento);
                    gestionDatosDinamicos.agregarCadena(cadena);
                    actualizarCadenasArea();
                }
            });
            eliminarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String primerElemento = primerElementoField.getText();
                    String segundoElemento = segundoElementoField.getText();
                    Pareja_Cadenas cadena = new Pareja_Cadenas(primerElemento, segundoElemento);
                    gestionDatosDinamicos.eliminarCadena(cadena);
                    actualizarCadenasArea();
                }
            });
            modificarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String primerElemento = primerElementoField.getText();
                    String segundoElemento = segundoElementoField.getText();
                    Pareja_Cadenas cadena = new Pareja_Cadenas(primerElemento, segundoElemento);
                    int index = gestionDatosDinamicos.getCadenas().indexOf(cadena);
                    if (index != -1) {
                        String nuevoPrimerElemento = JOptionPane.showInputDialog("Ingrese el nuevo primer elemento de la cadena");
                        String nuevoSegundoElemento = JOptionPane.showInputDialog("Ingrese el nuevo segundo elemento de la cadena");
                        Pareja_Cadenas nuevaCadena = new Pareja_Cadenas(nuevoPrimerElemento, nuevoSegundoElemento);
                        gestionDatosDinamicos.modificarCadena(index, nuevaCadena);
                        actualizarCadenasArea();
                    } else {
                        JOptionPane.showMessageDialog(null, "La cadena no se encuentra en la lista.");
                    }
                }
            });
        }

        add(new JLabel("Primer Elemento:"));
        add(primerElementoField);
        add(new JLabel("Segundo Elemento:"));
        add(segundoElementoField);
        if (tipo.equals("matrices")) {
            add(new JLabel("Tercer Elemento:")); // Nuevo campo para la matriz
            add(tercerElementoField);
        }
        add(agregarButton);
        add(eliminarButton);
        add(modificarButton);
        add(new JScrollPane(datosArea));

        setSize(550, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void actualizarParejasArea() {
        StringBuilder sb = new StringBuilder();
        for (Pareja_Enteros parejaEnteros : gestionDatosDinamicos.getParejas()) {
            sb.append(parejaEnteros.toString()).append("\n");
        }
        datosArea.setText(sb.toString());
    }

    private void actualizarMatricesArea() {
        StringBuilder sb = new StringBuilder();
        for (Pareja_Matriz parejaMatriz : gestionDatosDinamicos.getMatrices()) {
            sb.append(parejaMatriz.toString()).append("\n");
        }
        datosArea.setText(sb.toString());
    }
    private void actualizarCadenasArea() {
        StringBuilder sb = new StringBuilder();
        for (Pareja_Cadenas cadena : gestionDatosDinamicos.getCadenas()) {
            sb.append(cadena.toString()).append("\n");
        }
        datosArea.setText(sb.toString());
    }

}