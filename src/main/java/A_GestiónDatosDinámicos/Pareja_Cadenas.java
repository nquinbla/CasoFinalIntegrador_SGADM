package A_GestiónDatosDinámicos;

import java.util.Objects;

public class Pareja_Cadenas {
    // Aquí irían los atributos y métodos de la clase ParejaCadenas
    private String primerElemento;
    private String segundoElemento;

    public Pareja_Cadenas(String primerElemento, String segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    public String getPrimerElemento() {
        return primerElemento;
    }

    public void setPrimerElemento(String primerElemento) {
        this.primerElemento = primerElemento;
    }

    public String getSegundoElemento() {
        return segundoElemento;
    }

    public void setSegundoElemento(String segundoElemento) {
        this.segundoElemento = segundoElemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pareja_Cadenas that = (Pareja_Cadenas) o;
        return primerElemento.equals(that.primerElemento) && segundoElemento.equals(that.segundoElemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primerElemento, segundoElemento);
    }

    @Override
    public String toString() {
        return "(" + primerElemento + ", " + segundoElemento + ")";
    }
}