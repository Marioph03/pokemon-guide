package pokemonguide;

import logger.MyLogger;

import java.awt.*;
import java.util.ArrayList;

/**
 * Clase en la que voy a hacer pruebas del programa
 *
 * @author Mario
 * @version 1.0
 */
public class PaginaPrincipal {
    public static void main(String[] args) {
        MyLogger.myLogger("Pokemon");
        Image imagen = null;
        Tipo[] tipos = new Tipo[2];
        Pokemon[] pokemons = new Pokemon[6];
        Movimiento[] movimientos = new Movimiento[4];
        ArrayList<Pokemon> pokemonsList = new ArrayList<>();
        ArrayList<Tipo> tiposList = new ArrayList<>();
        ArrayList<Movimiento> movimientosList = new ArrayList<>();

        Naturaleza naturaleza = new Naturaleza("Huraña", "sube ataque y baja defensa");
        Naturaleza naturaleza2 = new Naturaleza("Activa", "sube velocidad y baja defensa");
        Generacion generacion = new Generacion(1, "Esta generación tenía 151 Pokémon, el último Pokémon (el 151)" +
                " fue Mew. Estos 151 Pokémon se localizan en la región Kanto.", 151);

        Tipo tipo = new Tipo("Fuego", "se caracterizan por ser uno de los" +
                " más reconocidos en cada región. Sus ataques son controlados precisamente" +
                " por el elemento fuego con la finalidad de quemar a su adversario.");

        Habilidad habilidad = new Habilidad("Mar llamas", "Es una habilidad que suelen tener los pokemon de tipo fuego, " +
                "mientras menos ps tenga el pokemon mas le aumenta el ataque", tipo);

        LiderGimnasio brock = new LiderGimnasio("Brock", pokemons, generacion, pokemonsList,"Es un lider de gimnasio tipo Roca" +
                " de la primera generacion", tipo, 14, imagen);

        Pokemon charmander = new Pokemon("Charmander", tipos, 4, "Prefiere las cosas calientes. Dicen que cuando " +
                "llueve le sale vapor de la punta de la cola.", movimientos, generacion, imagen, 5, 39, 52,
                43, 60, 50, 65, 282, 223, 203,
                240, 218, 251, 31, false, habilidad, naturaleza, tiposList,
                movimientosList);

        Pokemon geodude = new Pokemon("Geodude", tipos, 74, "Cuanto más larga es la vida de Geodude, mayor es" +
                " el desgaste y la erosión que sufre, y más redondeada la forma que va adquiriendo. Sin embargo, el corazón" +
                " permanece siempre duro, rocoso y tosco.", movimientos, generacion, imagen, 5, 40, 80, 100,
                30, 30, 20, 221, 196, 236, 96
        , 96, 76, 31, false, habilidad, naturaleza, tiposList, movimientosList);

        Pokemon geodude2 = new Pokemon("Geodude", tipos, 74, "Cuanto más larga es la vida de Geodude, mayor es" +
                " el desgaste y la erosión que sufre, y más redondeada la forma que va adquiriendo. Sin embargo, el corazón" +
                " permanece siempre duro, rocoso y tosco.", movimientos, generacion, imagen, 5, 40, 80, 100,
                30, 30, 20, 221, 196, 236, 96
                , 96, 76, 31, true, habilidad, naturaleza2, tiposList, movimientosList);

        Movimiento movimiento = new Movimiento("Ascuas", "Lanza unas pequeñas chispas de fuego que causa daño al adversario",
                generacion, tipo, 40, 100, "Especial");

        //System.out.println(brock.creaPokemon(charmander));
        //System.out.println(brock.creaPokemon(geodude));
        //System.out.println(brock.creaPokemon(geodude2));
        //System.out.println(brock);
        System.out.println(brock.buscaLiderPorGeneracion(generacion));
        //System.out.println(brock.eliminaPokemon(geodude, 0));
        //System.out.println(brock);
    }
}