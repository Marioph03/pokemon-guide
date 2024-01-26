package pokemonguide;

import java.awt.*;

/**
 * Clase en la que voy a hacer pruebas del programa
 *
 * @author Mario
 * @version 1.0
 */
public class PaginaPrincipal {
    public static void main(String[] args) {
        Image imagen = null;
        Tipo tipo = new Tipo("Fuego", "se caracterizan por ser uno de los" +
                " más reconocidos en cada región. Sus ataques son controlados precisamente" +
                " por el elemento fuego con la finalidad de quemar a su adversario.");
        Movimiento movimiento = new Movimiento("Ascuas", "Lanza unas pequeñas chispas de fuego que causa daño al adversario",
                );
        Tipo[] tipos = new Tipo[2];
        Pokemon[] pokemons = new Pokemon[6];
        Movimiento[] movimientos = new Movimiento[4];
        Generacion generacion = new Generacion(1, "Esta generación tenía 151 Pokémon, el último Pokémon (el 151)" +
                " fue Mew. Estos 151 Pokémon se localizan en la región Kanto.", 151);
        Entrenador entrenador = new Entrenador("Blue", pokemons, generacion, 6);
        Pokemon pokemon = new Pokemon("Charmander", tipos, 4, "Prefiere las cosas calientes. Dicen que cuando " +
                "llueve le sale vapor de la punta de la cola.", movimientos, generacion, imagen, 5, 39, 52,
                43, 60, 50, 65, 282, 223, 203,
                240, 218, 251, 31, false);
        pokemon.creaTipo(tipo);
        generacion.setRival(entrenador);
    }
}

