package A_GestiónDatosDinámicos;

import java.util.Arrays;

// Clase Pareja_Matriz
public class Pareja_Matriz {
    private int[][] elementos;

    public Pareja_Matriz(int[][] elementos) {
        this.elementos = elementos;
    }

    // Constructor de la clase Pareja_Matriz
    public Pareja_Matriz(int filas, int columnas) {this.elementos = new int[filas][columnas];}
    public void setElemento(int fila, int columna, int valor) {this.elementos[fila][columna] = valor;}
    public int getElemento(int fila, int columna) {return this.elementos[fila][columna];}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] fila : elementos) {
            sb.append(Arrays.toString(fila)).append("\n");
        }
        return sb.toString();
    }
}