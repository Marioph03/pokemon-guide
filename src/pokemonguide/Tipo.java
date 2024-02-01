package pokemonguide;

import org.jetbrains.annotations.NotNull;

/**
 * Clase en la que se guarda informacion de los
 * tipos de los pokemon
 *
 * @author Mario
 * @version 1.0
 */
public class Tipo implements Comparable {
    private String nombre;
    private String descripcion;

    /**
     * Constructor de la clase Tipo
     *
     * @param nombre:      Nombre del tipo
     * @param descripcion: Descripcion del tipo
     */
    public Tipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    @Override
    public String toString() {
        return "Tipo{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public int compareTo(@NotNull Object o) {
        if (!(o instanceof Tipo tipo)) {
            throw new IllegalArgumentException("El parámetro debe ser del tipo Tipo");
        }
        return this.nombre.compareTo(tipo.nombre);
    }
}
