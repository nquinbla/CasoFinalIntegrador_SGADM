package D_IndexYVisualArchivos;

import java.io.File;
import java.util.*;

public class IndexadorRecursivo {
    private final Map<String, String> index = new HashMap<>();

    public void indexar(File directorio) {
        File[] archivos = directorio.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    indexar(archivo);
                } else {
                    index.put(archivo.getName(), archivo.getAbsolutePath());
                }
            }
        }
    }

    public String buscar(String nombreArchivo) {
        return index.get(nombreArchivo);
    }
}