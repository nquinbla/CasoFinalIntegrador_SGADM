package A_GestiónDatosDinámicos;

import java.util.ArrayList;
import java.util.List;

public class GestiónDatosDinámicos {
    private List<Pareja> parejas;
    private List<Matriz> matrices;

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
    public void eliminarMatriz(Matriz matriz) {
        matrices.remove(matriz);
    }
    public void modificarMatriz(int index, Matriz nuevaMatriz) {
        if (index >= 0 && index < matrices.size()) {
            matrices.set(index, nuevaMatriz);
        }
    }
    public List<Matriz> getMatrices() {
        return matrices;
    }
}