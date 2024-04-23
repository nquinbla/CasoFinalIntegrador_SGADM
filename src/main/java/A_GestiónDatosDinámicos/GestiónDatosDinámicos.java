package A_GestiónDatosDinámicos;

import java.util.ArrayList;
import java.util.List;

public class GestiónDatosDinámicos {
    private List<Pareja_Enteros> parejaEnteros;
    private List<Pareja_Matriz> matrices;
    private List<Pareja_Cadenas> cadenas;

    public GestiónDatosDinámicos() {
        this.parejaEnteros = new ArrayList<>();
        this.matrices = new ArrayList<>();
        this.cadenas = new ArrayList<>();
    }

    // Métodos de gestión de parejaEnteros
    public void agregarPareja(Pareja_Enteros parejaEnteros) {
        if (!this.parejaEnteros.contains(parejaEnteros)) {
            this.parejaEnteros.add(parejaEnteros);
        }
    }
    public void eliminarPareja(Pareja_Enteros parejaEnteros) {
        this.parejaEnteros.removeIf(p -> p.getPrimerElemento() == parejaEnteros.getPrimerElemento() && p.getSegundoElemento() == parejaEnteros.getSegundoElemento());
    }
    public void modificarPareja(int index, Pareja_Enteros nuevaParejaEnteros) {
        if (index >= 0 && index < parejaEnteros.size()) {
            parejaEnteros.set(index, nuevaParejaEnteros);
        }
    }
    public List<Pareja_Enteros> getParejas() {
        return parejaEnteros;
    }

    // Métodos de gestión de matrices
    public void agregarMatriz(Pareja_Matriz parejaMatriz) {
        matrices.add(parejaMatriz);
    }
    // En la clase GestiónDatosDinámicos
    public void eliminarMatriz(int index) {
        if (index >= 0 && index < matrices.size()) {
            matrices.remove(index);
        }
    }
    public void modificarMatriz(int index, Pareja_Matriz nuevaParejaMatriz) {
        if (index >= 0 && index < matrices.size()) {
            matrices.set(index, nuevaParejaMatriz);
        }
    }
    public List<Pareja_Matriz> getMatrices() {
        return matrices;
    }

    // Métodos de gestión de cadenas
    public void agregarCadena(Pareja_Cadenas cadena) {
        if (!cadenas.contains(cadena)) {
            cadenas.add(cadena);
        }
    }
    public void eliminarCadena(Pareja_Cadenas cadena) {
        cadenas.removeIf(c -> c.getPrimerElemento() == cadena.getPrimerElemento() && c.getSegundoElemento() == cadena.getSegundoElemento());
    }
    public void modificarCadena(int index, Pareja_Cadenas nuevaCadena) {
        if (index >= 0 && index < cadenas.size()) {
            cadenas.set(index, nuevaCadena);
        }
    }
    public List<Pareja_Cadenas> getCadenas() {return cadenas;}

}