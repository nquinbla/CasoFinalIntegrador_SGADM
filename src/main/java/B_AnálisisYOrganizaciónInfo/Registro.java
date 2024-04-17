package B_AnálisisYOrganizaciónInfo;

// Clase Registro
public class Registro {
    private String nombre;
    private double venta;

    public Registro(String nombre, double venta) {
        this.nombre = nombre;
        this.venta = venta;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public double getVenta() { return venta; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setVenta(double venta) { this.venta = venta; }
}