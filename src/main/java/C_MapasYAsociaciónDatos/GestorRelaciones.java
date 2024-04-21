package C_MapasYAsociaciónDatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GestorRelaciones<K, V> {
    private Map<K, V> relaciones;

    public GestorRelaciones() {
        this.relaciones = new HashMap<>();
    }

    public void agregarRelacion(K clave, V valor) {
        relaciones.put(clave, valor);
    }

    public V obtenerValor(K clave) {
        return relaciones.get(clave);
    }

    public boolean existeRelacion(K clave) {
        return relaciones.containsKey(clave);
    }

    public Optional<K> obtenerClave(V valor) {
        return relaciones.entrySet().stream()
                .filter(entry -> valor.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public boolean existeRelacionConValor(V valor) {
        return relaciones.containsValue(valor);
    }
}