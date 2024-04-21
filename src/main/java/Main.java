import A_GestiónDatosDinámicos.GUI_Selección;
import B_AnálisisYOrganizaciónInfo.GUI_Ventas;
import C_MapasYAsociaciónDatos.GUI_Relaciones;
import D_IndexYVisualArchivos.GUI_Archivos;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        GUI_Selección gui_seleccion = new GUI_Selección();
        GUI_Ventas gui_ventas = new GUI_Ventas();
        GUI_Relaciones gui_relaciones = new GUI_Relaciones();
        GUI_Archivos gui_archivos = new GUI_Archivos();

        // Mostrar las ventanas de la interfaz de usuario
        gui_seleccion.setVisible(true);
        gui_ventas.setVisible(true);
        gui_relaciones.setVisible(true);
        gui_archivos.setVisible(true);
    }
}