package A_GestiónDatosDinámicos;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pareja pareja = (Pareja) o;
        return primerElemento == pareja.primerElemento && segundoElemento == pareja.segundoElemento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(primerElemento, segundoElemento);
    }
    // En la clase Pareja
    @Override
    public String toString() {
        return "(" + primerElemento + ", " + segundoElemento + ")";
    }
}
