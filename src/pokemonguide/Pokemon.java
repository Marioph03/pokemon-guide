package pokemonguide;

import java.awt.*;
import java.util.Arrays;

public class Pokemon {
private String nombre;
private Tipo[] tipo;
private int numPokedex;
private String descripcion;
private Movimiento[] movimientos;
private Generacion generacion;
private Image imagen;
private int nivel;
private int psBase;
private int ataqueBase;
private int defensaBase;
private int ataqueEspecialBase;
private int defensaEspecialBase;
private int velocidadBase;
private int psMaximo;
private int ataqueMaximo;
private int defensaMaximo;
private int ataqueEspecialMaximo;
private int defensaEspecialMaximo;
private int velocidadMoximo;
private int iv;

    public Pokemon(String nombre, Tipo[] tipo, int numPokedex,
                   String descripcion, Movimiento[] movimientos,
                   Generacion generacion, Image imagen, int nivel,
                   int psBase, int ataqueBase, int defensaBase,
                   int ataqueEspecialBase, int defensaEspecialBase,
                   int velocidadBase, int psMaximo, int ataqueMaximo,
                   int defensaMaximo, int ataqueEspecialMaximo,
                   int defensaEspecialMaximo, int velocidadMoximo,
                   int iv) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numPokedex = numPokedex;
        this.descripcion = descripcion;
        this.movimientos = movimientos;
        this.generacion = generacion;
        this.imagen = imagen;
        this.nivel = nivel;
        this.psBase = psBase;
        this.ataqueBase = ataqueBase;
        this.defensaBase = defensaBase;
        this.ataqueEspecialBase = ataqueEspecialBase;
        this.defensaEspecialBase = defensaEspecialBase;
        this.velocidadBase = velocidadBase;
        this.psMaximo = psMaximo;
        this.ataqueMaximo = ataqueMaximo;
        this.defensaMaximo = defensaMaximo;
        this.ataqueEspecialMaximo = ataqueEspecialMaximo;
        this.defensaEspecialMaximo = defensaEspecialMaximo;
        this.velocidadMoximo = velocidadMoximo;
        this.iv = iv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo[] getTipo() {
        return tipo;
    }

    public void setTipo(Tipo[] tipo) {
        this.tipo = tipo;
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPsBase() {
        return psBase;
    }

    public void setPsBase(int psBase) {
        this.psBase = psBase;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(int ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public int getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(int defensaBase) {
        this.defensaBase = defensaBase;
    }

    public int getAtaqueEspecialBase() {
        return ataqueEspecialBase;
    }

    public void setAtaqueEspecialBase(int ataqueEspecialBase) {
        this.ataqueEspecialBase = ataqueEspecialBase;
    }

    public int getDefensaEspecialBase() {
        return defensaEspecialBase;
    }

    public void setDefensaEspecialBase(int defensaEspecialBase) {
        this.defensaEspecialBase = defensaEspecialBase;
    }

    public int getVelocidadBase() {
        return velocidadBase;
    }

    public void setVelocidadBase(int velocidadBase) {
        this.velocidadBase = velocidadBase;
    }

    public int getPsMaximo() {
        return psMaximo;
    }

    public void setPsMaximo(int psMaximo) {
        this.psMaximo = psMaximo;
    }

    public int getAtaqueMaximo() {
        return ataqueMaximo;
    }

    public void setAtaqueMaximo(int ataqueMaximo) {
        this.ataqueMaximo = ataqueMaximo;
    }

    public int getDefensaMaximo() {
        return defensaMaximo;
    }

    public void setDefensaMaximo(int defensaMaximo) {
        this.defensaMaximo = defensaMaximo;
    }

    public int getAtaqueEspecialMaximo() {
        return ataqueEspecialMaximo;
    }

    public void setAtaqueEspecialMaximo(int ataqueEspecialMaximo) {
        this.ataqueEspecialMaximo = ataqueEspecialMaximo;
    }

    public int getDefensaEspecialMaximo() {
        return defensaEspecialMaximo;
    }

    public void setDefensaEspecialMaximo(int defensaEspecialMaximo) {
        this.defensaEspecialMaximo = defensaEspecialMaximo;
    }

    public int getVelocidadMoximo() {
        return velocidadMoximo;
    }

    public void setVelocidadMoximo(int velocidadMoximo) {
        this.velocidadMoximo = velocidadMoximo;
    }

    public int getIv() {
        return iv;
    }

    public void setIv(int iv) {
        this.iv = iv;
    }

    public Movimiento buscaPokemonPorMovimiento(){

        return null;
    }

    public Tipo buscaPokemonPorTipo(){

        return null;
    }

    public String buscaPokemonPorNombre(){

        return null;
    }

    public  Pokemon muestraPokemon(){

        return null;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + Arrays.toString(tipo) +
                ", numPokedex=" + numPokedex +
                ", descripcion='" + descripcion + '\'' +
                ", movimientos=" + Arrays.toString(movimientos) +
                ", generacion=" + generacion +
                ", imagen=" + imagen +
                ", nivel=" + nivel +
                ", psBase=" + psBase +
                ", ataqueBase=" + ataqueBase +
                ", defensaBase=" + defensaBase +
                ", ataqueEspecialBase=" + ataqueEspecialBase +
                ", defensaEspecialBase=" + defensaEspecialBase +
                ", velocidadBase=" + velocidadBase +
                ", psMaximo=" + psMaximo +
                ", ataqueMaximo=" + ataqueMaximo +
                ", defensaMaximo=" + defensaMaximo +
                ", ataqueEspecialMaximo=" + ataqueEspecialMaximo +
                ", defensaEspecialMaximo=" + defensaEspecialMaximo +
                ", velocidadMoximo=" + velocidadMoximo +
                ", iv=" + iv +
                '}';
    }
}
