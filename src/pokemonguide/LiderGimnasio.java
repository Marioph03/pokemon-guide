package pokemonguide;

import java.awt.*;
import java.util.Arrays;

public class LiderGimnasio extends Entrenador{
    private String descripcion;
    private Tipo tipo;
    private int nivel;
    private Image imagen;

    public LiderGimnasio(String nombre, Pokemon[] pokemons, Generacion generacion,
                         String descripcion, Tipo tipo, int nivel,
                         Image imagen) {
        super(nombre, pokemons, generacion);
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

    public Tipo buscaLiderPorTipo(){

        return null;
    }

    public Generacion buscaLiderPorGeneracion(){

        return null;
    }

    public boolean creaLider(){

        return false;
    }

    public LiderGimnasio muestraLider(){

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
