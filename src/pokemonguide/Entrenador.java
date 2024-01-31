package pokemonguide;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Clase que guarda la informacion de todos
 * los entrenadores
 *
 * @author Mario
 * @version 1.0
 */
public abstract class Entrenador{
    private String nombre;
    private Pokemon[] pokemons;
    private Generacion generacion;


    /**
     * Constructor de la clase Entrenador
     *
     * @param nombre     : Nombre del entrenador
     * @param pokemons   : Equipo Pokemon del entrenador
     * @param generacion : Generacion a la que pertenece el entrenador
     */
    public Entrenador(String nombre, Pokemon[] pokemons, Generacion generacion) {
        this.nombre = nombre;
        this.pokemons = pokemons;
        this.generacion = generacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemons = new Pokemon[]{pokemon};
    }

    public Generacion getGeneracion() {
        return generacion;
    }

    public void setGeneracion(Generacion generacion) {
        this.generacion = generacion;
    }

    /**
     * Metodo para añadir Pokemon al equipoñ
     * del entrenador
     *
     * @param pokemon  : Parametro que se utiliza para completar
     *                 el equipo de Pokemons del entrenador
     * @return: Devuelve true si el Pokemon se ha añadido con exito,
     * y false si ha fallado
     */
    public abstract boolean creaPokemon(Pokemon pokemon);

    /**
     * Metodo para eliminar un pokemon del equipo del entrenador
     * @param pokemon: Parametro que se utiliza para especificar
     *               el pokemon que se quiere eliminar del equipo
     *               del Entrenador
     * @param i: Parametro en el que se indica el indice del elemento
     *         que quiero borrar en el array
     * @return: Devuelve true si el Pokemon se ha eliminado con exito,
     *       y false si ha fallado
     */
    public abstract boolean eliminaPokemon(Pokemon pokemon, int i);

    /**
     * Metodo para buscar un pokemon en el
     * equipo del entrenador
     * @param pokemon: Parametro que se utiliza para especificar
     *               el pokemon que quiero buscar
     * @return: Devuelve el pokemon que se ha encontrado dentro de la lista
     */
    public abstract Pokemon buscaPokemon(Pokemon pokemon);

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", pokemons=" + Arrays.toString(pokemons) +
                ", generacion=" + generacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrenador that = (Entrenador) o;
        return Objects.equals(nombre, that.nombre) && Arrays.equals(pokemons, that.pokemons) && Objects.equals(generacion, that.generacion);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre, generacion);
        result = 31 * result + Arrays.hashCode(pokemons);
        return result;
    }

}
