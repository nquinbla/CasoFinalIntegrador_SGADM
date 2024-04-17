package B_AnálisisYOrganizaciónInfo;
// Clase AnalizadorRegistros
import java.util.*;

public class AnalizadorRegistros {
    private List<Registro> registros;

    public AnalizadorRegistros() {
        this.registros = new ArrayList<>();
    }

    public void agregarRegistro(Registro registro) {this.registros.add(registro);}

    public List<Registro> ordenarPorNombre() {
        registros.sort(Comparator.comparing(Registro::getNombre));
        return registros;
    }

    public List<Registro> ordenarPorVenta() {
        registros.sort(Comparator.comparingDouble(Registro::getVenta));
        return registros;
    }

    public List<Registro> filtrarPorVenta(double minVenta) {
        List<Registro> filtrados = new ArrayList<>();
        for (Registro registro : registros) {
            if (registro.getVenta() >= minVenta) {
                filtrados.add(registro);
            }
        }
        return filtrados;
    }
}
