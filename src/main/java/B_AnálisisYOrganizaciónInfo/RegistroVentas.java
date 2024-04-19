package B_AnálisisYOrganizaciónInfo;

import java.util.List;
import java.util.ArrayList;

public class RegistroVentas {
    private List<Venta> ventas;

    public RegistroVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    // Métodos para ordenar y filtrar ventas
    public List<Venta> ordenarPorFecha() {
        ventas.sort((v1, v2) -> v1.getFecha().compareTo(v2.getFecha()));
        return ventas;
    }

    public List<Venta> ordenarPorCantidad() {
        ventas.sort((v1, v2) -> v1.getCantidad() - v2.getCantidad());
        return ventas;
    }

    public List<Venta> ordenarPorCliente() {
        ventas.sort((v1, v2) -> v1.getCliente().compareTo(v2.getCliente()));
        return ventas;
    }

    public List<Venta> filtrarPorCliente(String cliente) {
        return ventas.stream().filter(v -> v.getCliente().equals(cliente)).toList();
    }

    public List<Venta> filtrarPorCantidad(int cantidad) {
        return ventas.stream().filter(v -> v.getCantidad() == cantidad).toList();
    }

    public List<Venta> filtrarPorFecha(String fecha) {
        return ventas.stream().filter(v -> v.getFecha().toString().equals(fecha)).toList();
    }

}
