package A_GestiónDatosDinámicos;

import java.util.ArrayList;
import java.util.List;

public class GestiónDatosDinámicos {
    private List<Pareja> parejas;

    public GestiónDatosDinámicos() {
        this.parejas = new ArrayList<>();
    }

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
}