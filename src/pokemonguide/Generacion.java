package pokemonguide;

import org.jetbrains.annotations.NotNull;

/**
 * Clase que guarda informacion de todas las
 * generaciones incluidas en la guia
 *
 * @author Mario
 * @version 1.0
 */
public class Generacion implements Comparable{
    private int numGeneracion;
    private String descripcion;
    private int numPokemonPorGeneracion;
    private Entrenador rival;

    /**
     * Constructor de la clase Generacion
     *
     * @param numGeneracion: Numero de la generacion Ej. 1 generacion
     *                     , 2 generacion...
     * @param descripcion: Descripcion de la generacion
     * @param numPokemonPorGeneracion: Numero de pokemon que tiene la generacion
     */
    public Generacion(int numGeneracion, String descripcion, int numPokemonPorGeneracion) {
        this.numGeneracion = numGeneracion;
        this.descripcion = descripcion;
        this.numPokemonPorGeneracion = numPokemonPorGeneracion;
    }

    public int getNumGeneracion() {
        return numGeneracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumPokemonPorGeneracion() {
        return numPokemonPorGeneracion;
    }

    public void setNumPokemonPorGeneracion(int numPokemonPorGeneracion) {
        this.numPokemonPorGeneracion = numPokemonPorGeneracion;
    }

    public Entrenador getRival() {
        return rival;
    }

    public void setRival(Entrenador rival) {
        this.rival = rival;
    }

    @Override
    public String toString() {
        return "Generacion{" +
                "numGeneracion=" + numGeneracion +
                ", descripcion='" + descripcion + '\'' +
                ", numPokemonPorGeneracion=" + numPokemonPorGeneracion +
                '}';
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if (!(o instanceof Generacion)){
            throw new IllegalArgumentException("El parámetro debe ser del tipo Generacion");
        }if (this.numGeneracion > ((Generacion) o).numGeneracion) {
            return 1;
        } else if (this.numGeneracion < ((Generacion) o).numGeneracion) {
            return -1;
        } else if (this.numGeneracion == ((Generacion) o).numGeneracion) {
            return 0;
        }
        return 0;
    }
}
