package A_GestiónDatosDinámicos;

import java.util.Objects;

// Clase que representa una pareja de enteros
public class Pareja_Enteros {
    // Atributos
    private int primerElemento;
    private int segundoElemento;

    // Constructor
    public Pareja_Enteros(int primerElemento, int segundoElemento) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pareja_Enteros parejaEnteros = (Pareja_Enteros) o;
        return primerElemento == parejaEnteros.primerElemento && segundoElemento == parejaEnteros.segundoElemento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(primerElemento, segundoElemento);
    }
    // En la clase Pareja_Enteros
    @Override
    public String toString() {
        return "(" + primerElemento + ", " + segundoElemento + ")";
    }
}
