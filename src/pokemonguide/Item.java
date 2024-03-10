package pokemonguide;

import java.awt.*;

/**
 * Clase que guarda la informacion de los item
 * de toda la guia
 *
 * @author Mario
 * @version 1.0
 */
public class Item {
    private String nombre;
    private String descripcion;
    private Generacion generacion;
    private Image imagen;

    /**
     * Constructor de la clase Item
     *
     * @param nombre: Nombre del item
     * @param descripcion: descripcion del item
     * @param generacion: Generacion a la que pertenece el item
     * @param imagen: imagen del item
     */
    public Item(String nombre, String descripcion, Generacion generacion,
                Image imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.generacion = generacion;
        this.imagen = imagen;
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

    public Generacion getGeneracion() {
        return generacion;
    }

    public void setGeneracion(Generacion generacion) {
        this.generacion = generacion;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    /**
     * Metodo que busca un item utilizando como criterio
     * la generacion a la que pertenece
     *
     * @param generacion: Se especifica la generacion a la
     *                  que pertenece el item que quiero buscar
     * @return: Devuelve el item que se ha encontrado segun
     * el criterio que le he especificado como parametro
     */
    public Item buscaItemPorGeneracion(Generacion generacion){
        if (generacion!=null && generacion.compareTo(this.generacion) == 0){
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", generacion=" + generacion +
                ", imagen=" + imagen +
                '}';
    }
}
