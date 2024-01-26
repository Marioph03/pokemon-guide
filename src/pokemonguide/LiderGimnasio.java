package pokemonguide;

import java.awt.*;


/**
 * Clase que hereda de la clase Entrenador
 * Guarda la informacion de un tipo de
 * Entrenador en concreto, en este caso
 * se trata de un Lide de Gimnasio
 *
 * @author Mario
 * @version 1.0
 */
public final class LiderGimnasio extends Entrenador{
    private String descripcion;
    private Tipo tipo;
    private int nivel;
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
     */
    public LiderGimnasio(String nombre, Pokemon[] pokemons, Generacion generacion,
                         String descripcion, Tipo tipo, int nivel,
                         Image imagen) {
        super(nombre, pokemons, generacion, 6);
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
    public String toString() {
        return "LiderGimnasio{" +
                "descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                ", nivel=" + nivel +
                ", imagen=" + imagen +
                '}';
    }
}
