package A_GestiónDatosDinámicos;

public class Cadenas {
    // Aquí irían los atributos y métodos de la clase ParejaCadenas
    private String primerElemento;
    private String segundoElemento;

    public Cadenas(String primerElemento, String segundoElemento) {
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
        Cadenas pareja = (Cadenas) o;
        return primerElemento.equals(pareja.primerElemento) && segundoElemento.equals(pareja.segundoElemento);
    }

    @Override
    public int hashCode() {
        return primerElemento.hashCode() + segundoElemento.hashCode();
    }

    @Override
    public String toString() {
        return "(" + primerElemento + ", " + segundoElemento + ")";
    }
}