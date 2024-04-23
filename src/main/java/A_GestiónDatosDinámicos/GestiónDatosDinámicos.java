package A_GestiónDatosDinámicos;

import java.util.ArrayList;
import java.util.List;

public class GestiónDatosDinámicos {
    private List<Pareja> parejas;
    private List<Matriz> matrices;
    private List<Cadenas> cadenas;

    public GestiónDatosDinámicos() {
        this.parejas = new ArrayList<>();
        this.matrices = new ArrayList<>();
    }

    // Métodos de gestión de parejas
    public void agregarPareja(Pareja pareja) {
        if (!parejas.contains(pareja)) {
            parejas.add(pareja);
        }
    }
    public void eliminarPareja(Pareja pareja) {
        parejas.removeIf(p -> p.getPrimerElemento() == pareja.getPrimerElemento() && p.getSegundoElemento() == pareja.getSegundoElemento());
    }
    public void modificarPareja(int index, Pareja nuevaPareja) {
        if (index >= 0 && index < parejas.size()) {
            parejas.set(index, nuevaPareja);
        }
    }
    public List<Pareja> getParejas() {
        return parejas;
    }

    // Métodos de gestión de matrices
    public void agregarMatriz(Matriz matriz) {
        matrices.add(matriz);
    }
    // En la clase GestiónDatosDinámicos
    public void eliminarMatriz(int index) {
        if (index >= 0 && index < matrices.size()) {
            matrices.remove(index);
        }
    }
    public void modificarMatriz(int index, Matriz nuevaMatriz) {
        if (index >= 0 && index < matrices.size()) {
            matrices.set(index, nuevaMatriz);
        }
    }
    public List<Matriz> getMatrices() {
        return matrices;
    }

    // Métodos de gestión de cadenas
    public void agregarCadena(Cadenas cadena) {
        if (!cadenas.contains(cadena)) {
            cadenas.add(cadena);
        }
    }
    public void eliminarCadena(Cadenas cadena) {
        cadenas.removeIf(c -> c.getPrimerElemento() == cadena.getPrimerElemento() && c.getSegundoElemento() == cadena.getSegundoElemento());
    }
    public void modificarCadena(int index, Cadenas nuevaCadena) {
        if (index >= 0 && index < cadenas.size()) {
            cadenas.set(index, nuevaCadena);
        }
    }
}