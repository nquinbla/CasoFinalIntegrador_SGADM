package B_AnálisisYOrganizaciónInfo;

import java.util.*;

public class RegistroVentas {

    private TreeSet<Venta> ventasPorFecha;
    private TreeSet<Venta> ventasPorCantidad;
    private TreeSet<Venta> ventasPorCliente;

    public RegistroVentas() {
        ventasPorFecha = new TreeSet<>(Comparator.comparing(Venta::getFecha));
        ventasPorCantidad = new TreeSet<>(Comparator.comparing(Venta::getCantidad));
        ventasPorCliente = new TreeSet<>(Comparator.comparing(Venta::getCliente));
    }

    public void agregarVenta(Venta venta) {
        ventasPorFecha.add(venta);
        ventasPorCantidad.add(venta);
        ventasPorCliente.add(venta);
    }

    public void eliminarVenta(Venta venta) {
        ventasPorFecha.remove(venta);
        ventasPorCantidad.remove(venta);
        ventasPorCliente.remove(venta);
    }

    public TreeSet<Venta> getVentasPorFecha() {
        return ventasPorFecha;
    }

    public TreeSet<Venta> getVentasPorCantidad() {
        return ventasPorCantidad;
    }

    public TreeSet<Venta> getVentasPorCliente() {
        return ventasPorCliente;
    }
    public void editarVenta(Venta ventaAntigua, Venta ventaNueva) {
        eliminarVenta(ventaAntigua);
        agregarVenta(ventaNueva);
    }


}