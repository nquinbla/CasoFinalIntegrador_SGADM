package B_AnálisisYOrganizaciónInfo;

import java.util.Date;

public class Venta {
    private Date fecha;
    private int cantidad;
    private String cliente;

    public Venta(Date fecha, int cantidad, String cliente) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public Date getFecha() {return fecha;}

    public int getCantidad() {return cantidad;}

    public String getCliente() {return cliente;}

    public void setFecha(Date fecha) {this.fecha = fecha;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public void setCliente(String cliente) {this.cliente = cliente;}
}
