package pokemonguide;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;


/**
 * Clase que hereda de la clase Entrenador
 * Guarda la informacion de un tipo de
 * Entrenador en concreto, en este caso
 * se trata de un Lider de Gimnasio
 *
 * @author Mario
 * @version 1.0
 */
public final class LiderGimnasio extends Entrenador {
    private String descripcion;
    private Tipo tipo;
    private int nivel;
    private int numPokemons;
    private static final int NUMERO_POKEMON_EQUIPO = 6;
    private Image imagen;

    /**
     * Constructor de la clase LiderDeGimnasio
     *
     * @param nombre: Nombre del Lider de Gimnasio
     * @param pokemons: Equipo pokemon del Lider de Gimnasio
     * @param generacion: Generacion a la que pertenece el Lider de Gimnasio
     * @param descripcion: Descripcion del Lider de Gimnasio
     * @param tipo: Tipo en el que se especifica el Lider de Gimnasio
     * @param nivel: Nivel del lider de gimnasio
     * @param imagen: Imagen del lider de gimnasio
     * @param listaPokemons: Parametro en el que se guarda una lista de pokemon del Entrenador/Lider de gimnasio
     */

    public LiderGimnasio(String nombre, Pokemon[] pokemons, Generacion generacion, ArrayList<Pokemon> listaPokemons,
                         String descripcion, Tipo tipo, int nivel, Image imagen) {
        super(nombre, pokemons, generacion, listaPokemons);
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.nivel = nivel;
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    /**
     * Metodo que busca un Lider de Gimnasio en la lista
     * usando como criterio el tipo en el que se especifica
     *
     * @param tipo: Parametro en el que especifico el tipo
     *            por el cual quiero buscar al Lider de Gimnasio
     * @return: Devuelve el Lider de Gimnasio encontrado
     */
    public LiderGimnasio buscaLiderPorTipo(Tipo tipo){
        if (tipo!=null && tipo.compareTo(this.tipo) == 0){
            return this;
        }
        return null;
    }

    /**
     * Metodo que busca un Lider de Gimnasio en la lista
     * usando como criterio la generacion a la que pertenece
     *
     * @param generacion: Parametro en el que se especifica la
     *                  generacion a la que pertenece el Lider
     *                  de Gimnasio que quiero buscar.
     * @return: Devuelve el Lider de Gimnasio encontrado atraves del
     * criterio de busqueda especificado en el parametro del metodo
     */
    public LiderGimnasio buscaLiderPorGeneracion(Generacion generacion){
        if (generacion!=null && generacion.compareTo(super.getGeneracion()) == 0){
            return this;
        }
        return null;
    }

    /**
     * Metodo que se utiliza para mostrar la Lista de
     * Lideres de Gimnasio que he añadido a la guia
     *
     * @return: Devuelve una lista de los Lideres de Gimnasio
     * que he añadido a la guia
     */
    public LiderGimnasio[] muestraLider(){

        return null;
    }

    @Override
    public boolean creaPokemon(Pokemon pokemon) {
        //Si el numero de pokemon es menor a 6
        //se añade un pokemon al array
        if(pokemon!=null && numPokemons <= NUMERO_POKEMON_EQUIPO){
            this.getPokemons()[numPokemons] = pokemon;
            numPokemons++;
        }
        return true;
    }

    @Override
    public boolean eliminaPokemon(@NotNull Pokemon pokemon, int i) {
        //Este metodo copia el array que le paso como parametro
        //y lo transforma en otro modificado con distintos elementos
        //apartir de los indices
        if (buscaPokemon(pokemon)==i) {
            System.arraycopy(this.getPokemons(), i + 1, this.getPokemons(), i, this.getPokemons().length - 1 - i);
        }
        return true;
    }

    @Override
    public int buscaPokemon(@NotNull Pokemon pokemon) {
        //Con este for recorro el array de pokemon
        for (int i = 0; i < this.getPokemons().length; i++) {
            //En esta condicion digo que mientras el pokemon
            //a comparar es igual que el comparado devuelva
            //el pokemon que el usuario quiera buscar en el
            //equipo
            if (pokemon!=null && pokemon.compareTo(this.getPokemons()[i])==0){
            return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "LiderGimnasio{" +
                "descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                ", nivel=" + nivel +
                ", numPokemons=" + numPokemons +
                ", imagen=" + imagen +
                super.toString() +
                '}';
    }
}
