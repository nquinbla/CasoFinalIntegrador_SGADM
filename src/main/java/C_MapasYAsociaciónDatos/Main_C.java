package C_MapasYAsociaciónDatos;

import javax.swing.*;
import java.awt.*;

public class Main_C extends JFrame {
    private GestorRelaciones<Integer, String> numerosYLetras;
    private GestorRelaciones<Integer, String> numerosYTextos;
    private RecuperadorEficiente<Integer, String> recuperadorEficiente;

    public Main_C() {
        numerosYLetras = new GestorRelaciones<>();
        for (int i = 1; i <= 28; i++) {
            char letra = (char) ('A' + i - 1); // Convertir el número a una letra del abecedario
            numerosYLetras.agregarRelacion(i, String.valueOf(letra));
        }

        numerosYTextos = new GestorRelaciones<>();
        String[] unidades = {
                "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
                "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve",
                "treinta", "treinta y uno", "treinta y dos", "treinta y tres", "treinta y cuatro", "treinta y cinco", "treinta y seis", "treinta y siete", "treinta y ocho", "treinta y nueve",
                "cuarenta", "cuarenta y uno", "cuarenta y dos", "cuarenta y tres", "cuarenta y cuatro", "cuarenta y cinco", "cuarenta y seis", "cuarenta y siete", "cuarenta y ocho", "cuarenta y nueve",
                "cincuenta", "cincuenta y uno", "cincuenta y dos", "cincuenta y tres", "cincuenta y cuatro", "cincuenta y cinco", "cincuenta y seis", "cincuenta y siete", "cincuenta y ocho", "cincuenta y nueve",
                "sesenta", "sesenta y uno", "sesenta y dos", "sesenta y tres", "sesenta y cuatro", "sesenta y cinco", "sesenta y seis", "sesenta y siete", "sesenta y ocho", "sesenta y nueve",
                "setenta", "setenta y uno", "setenta y dos", "setenta y tres", "setenta y cuatro", "setenta y cinco", "setenta y seis", "setenta y siete", "setenta y ocho", "setenta y nueve",
                "ochenta", "ochenta y uno", "ochenta y dos", "ochenta y tres", "ochenta y cuatro", "ochenta y cinco", "ochenta y seis", "ochenta y siete", "ochenta y ocho", "ochenta y nueve",
                "noventa", "noventa y uno", "noventa y dos", "noventa y tres", "noventa y cuatro", "noventa y cinco", "noventa y seis", "noventa y siete", "noventa y ocho", "noventa y nueve",
                "cien"
        }; for (int i = 1; i <= 100; i++) {
            numerosYTextos.agregarRelacion(i, unidades[i - 1]);
        }
        recuperadorEficiente = new RecuperadorEficiente<>();
        for (int i = 1; i <= 100; i++) {
            recuperadorEficiente.agregarDato(i, unidades[i - 1]);
        }

        setLayout(new FlowLayout());



        JButton gestionarRelacionesButton = new JButton("Gestionar Relaciones");
        gestionarRelacionesButton.addActionListener(e -> {
            Integer clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            String valorLetra = numerosYLetras.obtenerValor(clave);
            String valorTexto = numerosYTextos.obtenerValor(clave);
            JOptionPane.showMessageDialog(null, "Para el número " + clave + ", la letra es: " + valorLetra + " y el texto es: " + valorTexto);
        });

        JButton recuperarDatosEficientesButton = new JButton("Recuperar Datos Eficientes");
        recuperarDatosEficientesButton.addActionListener(e -> {
            new RecuperarDatosFrame(recuperadorEficiente);
        });

        add(gestionarRelacionesButton);
        add(recuperarDatosEficientesButton);

        setSize(300, 110);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_C();
    }
}