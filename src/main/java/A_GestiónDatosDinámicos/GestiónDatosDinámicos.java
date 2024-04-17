package A_GestiónDatosDinámicos;

import java.util.ArrayList;
import java.util.List;

// Clase que gestiona los datos dinámicos de la aplicación
public class GestiónDatosDinámicos {
    // Atributos
    private List<Pareja> parejas;

    // Constructor
    public GestiónDatosDinámicos() {
        this.parejas = new ArrayList<>();
    }

    // Métodos
    public void agregarPareja(Pareja pareja) {
        parejas.add(pareja);
    }

    public void eliminarPareja(Pareja pareja) {
        parejas.remove(pareja);
    }

    public void modificarPareja(int index, Pareja nuevaPareja) {
        if (index >= 0 && index < parejas.size()) {
            parejas.set(index, nuevaPareja);
        }
    }

    public List<Pareja> getParejas() {
        return parejas;
    }
}