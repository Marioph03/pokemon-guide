package pokemonguide;

import java.awt.*;
import java.util.Arrays;

/**
 * Clase en la que voy a hacer pruebas del programa
 *
 * @author Mario
 * @version 1.0
 */
public class PaginaPrincipal {
    public static void main(String[] args) {
        Image imagen = null;
        Tipo[] tipos = new Tipo[2];
        Pokemon[] pokemons = new Pokemon[6];
        Movimiento[] movimientos = new Movimiento[4];

        Generacion generacion = new Generacion(1, "Esta generación tenía 151 Pokémon, el último Pokémon (el 151)" +
                " fue Mew. Estos 151 Pokémon se localizan en la región Kanto.", 151);
        Tipo tipo = new Tipo("Fuego", "se caracterizan por ser uno de los" +
                " más reconocidos en cada región. Sus ataques son controlados precisamente" +
                " por el elemento fuego con la finalidad de quemar a su adversario.");
        Entrenador entrenador = new LiderGimnasio("Brock", pokemons, generacion, "Es un lider de gimnasio tipo Roca" +
                " de la primera generacion", tipo, 14, imagen);
        Pokemon pokemon = new Pokemon("Charmander", tipos, 4, "Prefiere las cosas calientes. Dicen que cuando " +
                "llueve le sale vapor de la punta de la cola.", movimientos, generacion, imagen, 5, 39, 52,
                43, 60, 50, 65, 282, 223, 203,
                240, 218, 251, 31, false);
        Movimiento movimiento = new Movimiento("Ascuas", "Lanza unas pequeñas chispas de fuego que causa daño al adversario",
                generacion, tipo, 40, 100, "Especial");
        System.out.println(entrenador.creaPokemon(pokemon));
        System.out.println(entrenador);
        System.out.println(entrenador.eliminaPokemon(pokemon, 0));
        System.out.println(entrenador);
    }
}

