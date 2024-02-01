package pokemonguide;

public class Naturaleza implements StadisticInterface{
    private String nombre;
    private String efecto;

    public Naturaleza(String nombre, String efecto) {
        this.nombre = nombre;
        this.efecto = efecto;
    }

    @Override
    public int subir(int estadistica) {
        return 0;
    }

    @Override
    public int bajar(int estadistica) {
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    @Override
    public String toString() {
        return "Naturaleza{" +
                "nombre='" + nombre + '\'' +
                ", efecto='" + efecto + '\'' +
                '}';
    }
}
