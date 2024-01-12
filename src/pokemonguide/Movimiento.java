package pokemonguide;

public class Movimiento {
    private String nombre;
    private String descripcion;
    private Generacion generacion;
    private Tipo tipo;
    private int potencia;
    private int precision;
    private String categoria;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Generacion getGeneracion() {
        return generacion;
    }

    public void setGeneracion(Generacion generacion) {
        this.generacion = generacion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", generacion=" + generacion +
                ", tipo=" + tipo +
                ", potencia=" + potencia +
                ", precision=" + precision +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
