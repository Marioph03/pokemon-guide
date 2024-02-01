package pokemonguide;

import org.jetbrains.annotations.NotNull;

/**
 * Clase que almacena la informacion de todos
 * los movimientos incluidos en la guia
 *
 * @author Mario
 * @version 1.0
 */
public class Movimiento implements Comparable{
    private String nombre;
    private String descripcion;
    private Generacion generacion;
    private Tipo tipo;
    private int potencia;
    private int precision;
    private String categoria;

    /**
     * Constructor de la clase Movimiento
     *
     * @param nombre: Nombre del movimiento
     * @param descripcion: Descripcion del movimiento
     * @param generacion: generacion a la que pertenece el movimiento
     * @param tipo: Tipo del movimiento
     * @param potencia: Potencia del movimiento
     * @param precision: Precision del movimiento
     * @param categoria: categoria a la que pertenece el movimiento
     *                 (Hay categoria: Fisica, Especial y de Estado)
     */
    public Movimiento(String nombre, String descripcion, Generacion generacion, Tipo tipo, int potencia, int precision, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.generacion = generacion;
        this.tipo = tipo;
        this.potencia = potencia;
        this.precision = precision;
        this.categoria = categoria;
    }

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

    @Override
    public int compareTo(@NotNull Object o) {
        if (!(o instanceof Movimiento mov)) {
            throw new IllegalArgumentException("El parámetro debe ser del tipo Movimiento");
        }
        return this.nombre.compareTo(mov.nombre);
    }
}
