package pokemonguide;

import java.util.Arrays;

public class Entrenador {
    private String nombre;
    private Pokemon[] pokemons;
    private Generacion generacion;

    public Entrenador(String nombre, Pokemon[] pokemons, Generacion generacion) {
        this.nombre = nombre;
        this.pokemons = pokemons;
        this.generacion = generacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pokemon[] getPokemon() {
        return pokemons;
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

    public boolean creaPokemon(Pokemon pokemon){

        return false;
    }

    public boolean eliminaPokemon(Pokemon pokemon){

        return false;
    }

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
