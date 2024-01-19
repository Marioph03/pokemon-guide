package pokemonguide;

public class Generacion {
    private int numGeneracion;
    private String descripcion;
    private int numPokemonPorGeneracion;
    private Entrenador rival;
    public Generacion(int numGeneracion, String descripcion, int numPokemonPorGeneracion, Entrenador rival) {
        this.numGeneracion = numGeneracion;
        this.descripcion = descripcion;
        this.numPokemonPorGeneracion = numPokemonPorGeneracion;
        this.rival = rival;
    }

    public int getNumGeneracion() {
        return numGeneracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumPokemonPorGeneracion() {
        return numPokemonPorGeneracion;
    }

    public void setNumPokemonPorGeneracion(int numPokemonPorGeneracion) {
        this.numPokemonPorGeneracion = numPokemonPorGeneracion;
    }

    public Entrenador getRival() {
        return rival;
    }

    public void setRival(Entrenador rival) {
        this.rival = rival;
    }

    @Override
    public String toString() {
        return "Generacion{" +
                "numGeneracion=" + numGeneracion +
                ", descripcion='" + descripcion + '\'' +
                ", numPokemonPorGeneracion=" + numPokemonPorGeneracion +
                '}';
    }
}
