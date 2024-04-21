package C_MapasYAsociaciónDatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class RecuperadorEficiente<K, V> {
    private Map<K, V> datos;

    public RecuperadorEficiente() {
        this.datos = new HashMap<>();
    }

    public void agregarDato(K clave, V valor) {
        datos.put(clave, valor);
    }

    public V recuperarDato(K clave) {
        return datos.get(clave);
    }

    public boolean existeDato(K clave) {
        return datos.containsKey(clave);
    }

    public Optional<V> recuperarDatoPorCriterio(Predicate<V> criterio) {
        return datos.values().stream()
                .filter(criterio)
                .findFirst();
    }
}