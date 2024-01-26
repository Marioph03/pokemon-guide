package pokemonguide;

import java.util.Arrays;

/**
 * Clase que guarda la informacion de todos
 * los entrenadores
 *
 * @author Mario
 * @version 1.0
 */
public class Entrenador {
    private String nombre;
    private Pokemon[] pokemons;
    private Generacion generacion;
    private int numPokemons;

    /**
     * Constructor de la clase Entrenador
     *
     * @param nombre     : Nombre del entrenador
     * @param pokemons   : Equipo Pokemon del entrenador
     * @param generacion : Generacion a la que pertenece el entrenador
     * @param numPokemons : Numero de pokemon que va a tener el entrenador
     */
    public Entrenador(String nombre, Pokemon[] pokemons, Generacion generacion, int numPokemons) {
        this.nombre = nombre;
        this.pokemons = pokemons;
        this.generacion = generacion;
        this.numPokemons = numPokemons;
    }

    public String getNombre() {
        return nombre;
    }

    public Pokemon[] getPokemon() {
        return pokemons;
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

    public int getNumPokemons() {
        return numPokemons;
    }

    public void setNumPokemons(int numPokemons) {
        this.numPokemons = numPokemons;
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
    public boolean creaPokemon(Pokemon pokemon){
        //Numero de pokemon que se pueden tener como maximo en el equipo
        final int NUMERO_POKEMON_EQUIPO = 6;
        //Si el numero de pokemon es menor o igual a 6
        //se añade un pokemon al array
        if(numPokemons < NUMERO_POKEMON_EQUIPO){
            this.pokemons[numPokemons-1] = pokemon;
            numPokemons++;
        }
        return true;
    }

    /**
     * Metodo para eliminar un pokemon del equipo del entrenador
     * @param pokemon: Parametro que se utiliza para especificar
     *               el pokemon que se quiere eliminar del equipo
     *               del Entrenador
     * @return: Devuelve true si el Pokemon se ha eliminado con exito,
     *       y false si ha fallado
     */
    public boolean eliminaPokemon(Pokemon pokemon, int i){
        System.arraycopy(this.pokemons, i + 1, pokemon , i, pokemons.length -1 -i);
        return false;
    }

    /**
     * Metodo para buscar un pokemon en el
     * equipo del entrenador
     * @param pokemon: Parametro que se utiliza para especificar
     *               el pokemon que quiero buscar
     * @return: Devuelve el pokemon que se ha encontrado dentro de la lista
     */
    public Pokemon buscaPokemon(Pokemon pokemon){

        return null;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", pokemons=" + Arrays.toString(pokemons) +
                ", generacion=" + generacion +
                '}';
    }
}
