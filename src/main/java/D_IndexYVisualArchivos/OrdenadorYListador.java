package D_IndexYVisualArchivos;

import java.util.*;

public class OrdenadorYListador {
    private final Map<String, String> archivos = new TreeMap<>();

    public void agregar(String nombreArchivo, String rutaArchivo) {
        archivos.put(nombreArchivo, rutaArchivo);
    }

    public List<String> listar() {
        List<String> lista = new ArrayList<>();
        for (Map.Entry<String, String> entrada : archivos.entrySet()) {
            lista.add(entrada.getKey() + " - " + entrada.getValue());
        }
        return lista;
    }
}
