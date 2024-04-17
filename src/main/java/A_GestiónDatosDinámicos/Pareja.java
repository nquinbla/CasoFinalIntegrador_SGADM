package A_GestiónDatosDinámicos;

// Clase que representa una pareja de enteros
public class Pareja {
    // Atributos
    private int primerElemento;
    private int segundoElemento;

    // Constructor
    public Pareja(int primerElemento, int segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    // getters y setters
    public int getPrimerElemento() {
        return primerElemento;
    }

    public void setPrimerElemento(int primerElemento) {
        this.primerElemento = primerElemento;
    }

    public int getSegundoElemento() {
        return segundoElemento;
    }

    public void setSegundoElemento(int segundoElemento) {
        this.segundoElemento = segundoElemento;
    }
}
