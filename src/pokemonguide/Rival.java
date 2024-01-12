package pokemonguide;

import java.awt.*;

public class Rival extends Entrenador{
    private Image imagen;

    public Rival(String nombre, Pokemon[] pokemons, Generacion generacion,
                 Image imagen) {
        super(nombre, pokemons, generacion);
        this.imagen = imagen;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Rival{" +
                "imagen=" + imagen +
                '}';
    }
}
