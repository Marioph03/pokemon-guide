package pokemonguide;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase que muestra informacion de
 * los pokemon de la guia
 *
 * @author Mario
 * @version 1.0
 */
public class Pokemon implements Comparable, StadisticInterface {
    private String nombre;
    private Tipo[] tipos;
    private ArrayList<Tipo> listaTipos;
    private int numPokedex;
    private int numTipos;
    private int numMovimientos;
    private String descripcion;
    private Movimiento[] movimientos;
    private ArrayList<Movimiento> listaMovimientos;
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
    private int velocidadMaximo;
    private int iv;
    private boolean shiny;
    private Habilidad habilidad;
    private Naturaleza naturaleza;

    /**
     * Constructor de la clase Pokemon
     *
     * @param nombre:                Nombre del pokemon
     * @param tipo:                  Tipo del pokemon Ej. fuego, planta, agua...
     * @param numPokedex:            Numero en el que esta registrado en la pokedex
     * @param descripcion:           Descripcion del pokemon
     * @param movimientos:           Movimientos del pokemon
     * @param generacion:            Generacion a la que pertenece el pokemon
     * @param imagen:                Imagen del pokemon
     * @param nivel:                 Nivel que va a tener el pokemon
     * @param psBase:                Estadistica de PS base
     * @param ataqueBase:            Estadistica de ataque base
     * @param defensaBase:           Estadistica de defensa base
     * @param ataqueEspecialBase:    Estadistica de Ataque Especial base
     * @param defensaEspecialBase:   Estadistica de Defensa Especial base
     * @param velocidadBase:         Estadistica de Velocidad base
     * @param psMaximo:              Estadistica de PS maxima
     * @param ataqueMaximo:          Estadistica de ataque maxima
     * @param defensaMaximo:         Estadistica de defensa maxima
     * @param ataqueEspecialMaximo:  Estadistica de Ataque Especial maxima
     * @param defensaEspecialMaximo: Estadistica de Defensa Especial maxima
     * @param velocidadMoximo:       Estadistica de Velocidad maxima
     * @param iv:                    Parametro que indica los iv del pokemon (Cada pokemon tiene una cantidad de iv's en concreto
     *                               en cada estadistica, cada pokemon nace con esa cantidad de iv y no se modifica nunca)
     * @param shiny:                 Parametro que indica si el pokemon es variocolor o no
     * @param habilidad:             Parametro que muestra la habilidad del pokemon
     * @param naturaleza:            Parametro que muestra la naturaleza del pokemon
     * @param listaTipos:            Parametro en el que guardo una lista de tipos en sustitucion del array
     * @param listaMovimientos:      Parametro en el que guardo una lista de tipos en sustitucion del array
     */
    public Pokemon(String nombre, Tipo[] tipo, int numPokedex,
                   String descripcion, Movimiento[] movimientos,
                   Generacion generacion, Image imagen, int nivel,
                   int psBase, int ataqueBase, int defensaBase,
                   int ataqueEspecialBase, int defensaEspecialBase,
                   int velocidadBase, int psMaximo, int ataqueMaximo,
                   int defensaMaximo, int ataqueEspecialMaximo,
                   int defensaEspecialMaximo, int velocidadMoximo,
                   int iv, boolean shiny, Habilidad habilidad
            , Naturaleza naturaleza, ArrayList<Tipo> listaTipos,
                   ArrayList<Movimiento> listaMovimientos) {
        this.nombre = nombre;
        this.tipos = tipo;
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
        this.velocidadMaximo = velocidadMoximo;
        this.iv = iv;
        this.shiny = shiny;
        this.habilidad = habilidad;
        this.naturaleza = naturaleza;
        this.listaTipos = listaTipos;
        this.listaMovimientos = listaMovimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo[] getTipos() {
        return tipos;
    }

    public void setTipos(Tipo[] tipos) {
        this.tipos = tipos;
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

    public int getVelocidadMaximo() {
        return velocidadMaximo;
    }

    public void setVelocidadMaximo(int velocidadMaximo) {
        this.velocidadMaximo = velocidadMaximo;
    }

    public int getIv() {
        return iv;
    }

    public void setIv(int iv) {
        this.iv = iv;
    }

    public boolean isShiny() {
        return shiny;
    }

    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public Naturaleza getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(Naturaleza naturaleza) {
        this.naturaleza = naturaleza;
    }

    public ArrayList<Tipo> getListaTipos() {
        return listaTipos;
    }

    public void setListaTipos(ArrayList<Tipo> listaTipos) {
        this.listaTipos = listaTipos;
    }

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }

    /**
     * Metodo que encuentra un pokemon en concreto en la lista
     * a partir de un movimiento que se pasa como parametro
     *
     * @param movimiento: Parametro en el cual especifico
     *                    el movimiento por el cual quiero
     *                    realizar la busqueda un pokemon en la lista
     * @return: Devuelve el pokemon que buscaba dentro de la lista
     * a patir del movimiento que le he especificado como parametro
     */
    public Pokemon buscaPokemonPorMovimiento(Movimiento movimiento) {
        //Con este for recorro el array de movimientos
        for (int i = 0; i < this.movimientos.length; i++) {
            //En esta condicion digo que mientras el movimiento
            //a comparar es igual que el comparado devuelva
            //el movimiento que el usuario quiera buscar en el
            //equipo
            if (movimiento != null && movimiento.compareTo(this.movimientos[i]) == 0) {
                return this;
            }
        }
        return null;
    }

    /**
     * Metodo que encuentra un pokemon en concreto en la
     * lista a partir de un tipo que se pasa como parametro
     *
     * @param tipo: Parametro en el cual especifico
     *              el movimiento por el cual quiero
     *              realizar la busqueda un pokemon en la lista
     * @return: Devuelve el pokemon que buscaba dentro de la lista
     * a patir del movimiento que le he especificado como parametro
     */
    public Pokemon buscaPokemonPorTipo(Tipo tipo) {
        //Con este for recorro el array de movimientos
        for (int i = 0; i < this.tipos.length; i++) {
            //En esta condicion digo que mientras el movimiento
            //a comparar es igual que el comparado devuelva
            //el movimiento que el usuario quiera buscar en el
            //equipo
            if (tipo != null && tipo.compareTo(this.tipos[i]) == 0) {
                return this;
            }
        }
        return null;
    }

    /**
     * Metodo por el cual se realiza una busqueda en la lista
     * atraves del nombre del Pokemon
     *
     * @param nombre: Nombre del Pokemon que quiero buscar
     * @return: Devuelve el pokemon que coincide con el nombre
     * pasado como parametro
     */
    public Pokemon buscaPokemonPorNombre(String nombre) {
        if (nombre != null && nombre.compareTo(this.nombre) == 0) {
            return this;
        }
        return null;
    }

    /**
     * Metodo que se utiliza para añadir un tipo a un
     * pokemon
     *
     * @param tipo: Se especifica el tipo que quiero crear
     * @return: Devuelve true si se ha creado con exito y false
     * si ha fallado
     */
    public boolean creaTipo(Tipo tipo) {
        //Numero de pokemon que se pueden tener como maximo en el equipo
        final int NUMERO_TIPOS = 2;
        //Si el numero de pokemon es menor a 2
        //se añade un pokemon al array
        if (tipo != null && numTipos < NUMERO_TIPOS) {
            this.tipos[numTipos] = tipo;
            numTipos++;
        }
        return true;
    }

    /**
     * Metodo que se utiliza para eliminar un tipo del pokemon
     *
     * @param i     : Parametro en el que se indica el indice del elemento
     *              que quiero borrar en el array
     * @param tipo: Parametro por el cual especifico el tipo que
     *              quiero eliminar
     * @return: Devuelve el tipo que se ha eliminado si la operacion
     * se ha realizado con exito
     */
    public boolean eliminaTipo(Tipo tipo, int i) {
        for (i = 0; i < this.tipos.length; i++) {
            if (tipo.compareTo(this.tipos[i]) == 0) {
                System.arraycopy(this.tipos, i + 1, tipos, i, tipos.length - 1 - i);
            }
        }
        return true;
    }

    /**
     * Metodo que se usa para añadir un movimiento al pokemon
     *
     * @param movimiento: Parametro que se utiliza para especificar
     *                    el movimiento que quiero añadir al pokemon
     * @return: Devuelve true si se ha creado con exito y false si ha
     * fallado la operacion
     */
    public boolean creaMovimiento(Movimiento movimiento) {
        //Numero de pokemon que se pueden tener como maximo en el equipo
        final int NUMERO_MOVIMIENTOS_POKEMON = 4;
        //Si el numero de pokemon es menor a 4
        //se añade un pokemon al array
        if (movimiento != null && numMovimientos < NUMERO_MOVIMIENTOS_POKEMON) {
            this.movimientos[numMovimientos - 1] = movimiento;
            numMovimientos++;
        }
        return true;
    }

    /**
     * Metodo que se utiliza para eliminar un movimiento
     * de un pokemon
     *
     * @param i           : Parametro en el que se indica el indice del elemento
     *                    que quiero borrar en el array
     * @param movimiento: Parametro que se utiliza para
     *                    especificar el movimiento que quiero
     *                    eliminar
     * @return: Devuelve el movimiento que se ha eliminado
     */
    public boolean eliminaMovimiento(Movimiento movimiento, int i) {
        for (i = 0; i < this.movimientos.length; i++) {
            if (movimiento.compareTo(this.movimientos[i]) == 0) {
                System.arraycopy(this.movimientos, i + 1, movimientos, i, movimientos.length - 1 - i);
            }
        }
        return true;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if (!(o instanceof Pokemon)) {
            throw new IllegalArgumentException("El parámetro debe ser del tipo Pokemon");
        }
        if (this.numPokedex > ((Pokemon) o).numPokedex) {
            return 1;
        } else if (this.numPokedex < ((Pokemon) o).numPokedex) {
            return -1;
        } else if (this.numPokedex == ((Pokemon) o).numPokedex) {
            return 0;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipos=" + Arrays.toString(tipos) +
                ", numPokedex=" + numPokedex +
                ", numTipos=" + numTipos +
                ", numMovimientos=" + numMovimientos +
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
                ", velocidadMaximo=" + velocidadMaximo +
                ", iv=" + iv +
                ", shiny=" + shiny +
                ", habilidad=" + habilidad +
                ", naturaleza=" + naturaleza +
                '}';
    }

    @Override
    public int subir(int estadistica) {
        double modificador = 1.1;
        return (int) (estadistica * modificador);
    }
        @Override
        public int bajar (int estadistica){
            double modificador = 0.9;
            return (int) (estadistica * modificador);
    }

    public Pokemon manejaEstadisticaSegunNaturaleza(Naturaleza naturaleza){
        int subir, bajar;
        switch (naturaleza.getNombre()){
            case StadisticInterface.ACTIVA :
                if (StadisticInterface.ACTIVA.equals(naturaleza.getNombre())){
                    subir = subir(this.velocidadMaximo);
                    bajar = bajar(this.defensaMaximo);
                }
                break;
            case StadisticInterface.AFABLE:
                if (StadisticInterface.AFABLE.equals(naturaleza.getNombre())){
                    subir = subir(this.ataqueEspecialMaximo);
                    bajar = bajar(this.defensaMaximo);
                }
                break;
            case StadisticInterface.AGITADA:
                if (StadisticInterface.AGITADA.equals(naturaleza.getNombre())){
                    subir = subir(this.defensaMaximo);
                    bajar = bajar(this.ataqueEspecialMaximo);
                }
                break;
            case StadisticInterface.ALEGRE:
                if (StadisticInterface.ALEGRE.equals(naturaleza.getNombre())){
                    subir(this.velocidadMaximo);
                    bajar(this.ataqueEspecialMaximo);
                }
                break;
            case StadisticInterface.ALOCADA:
                if (StadisticInterface.ALOCADA.equals(naturaleza.getNombre())){
                    subir(this.ataqueEspecialMaximo);
                    bajar(this.defensaEspecialMaximo);
                }
                break;
            case StadisticInterface.AMABLE:
                if (StadisticInterface.AMABLE.equals(naturaleza.getNombre())){
                    subir(this.defensaEspecialMaximo);
                    bajar(this.defensaMaximo);
                }
                break;
            case StadisticInterface.AUDAZ:
                if (StadisticInterface.AUDAZ.equals(naturaleza.getNombre())){
                    subir(this.ataqueMaximo);
                    bajar(this.velocidadMaximo);
                }
                break;
            case StadisticInterface.CAUTA:
                if (StadisticInterface.CAUTA.equals(naturaleza.getNombre())){
                    subir(this.defensaEspecialMaximo);
                    bajar(this.ataqueEspecialMaximo);
                }
                break;
            case StadisticInterface.FIRME:
                if (StadisticInterface.FIRME.equals(naturaleza.getNombre())){
                    subir(this.ataqueMaximo);
                    bajar(this.ataqueEspecialMaximo);
                }
                break;
            case StadisticInterface.FLOJA:
                if (StadisticInterface.FLOJA.equals(naturaleza.getNombre())){
                    subir(this.defensaMaximo);
                    bajar(this.defensaEspecialMaximo);
                }
                break;
            case StadisticInterface.GROSERA:
                if (StadisticInterface.GROSERA.equals(naturaleza.getNombre())){
                    subir(this.defensaEspecialMaximo);
                    bajar(this.velocidadMaximo);
                }
                break;
            case StadisticInterface.HURAÑA:
                if (StadisticInterface.HURAÑA.equals(naturaleza.getNombre())){
                    subir(this.ataqueMaximo);
                    bajar(this.defensaMaximo);
                }
                break;
            case StadisticInterface.INGENUA:
                if (StadisticInterface.INGENUA.equals(naturaleza.getNombre())){
                    subir(this.velocidadMaximo);
                    bajar(this.defensaEspecialMaximo);
                }
                break;
            case StadisticInterface.MANSA:
                if (StadisticInterface.MANSA.equals(naturaleza.getNombre())){
                    subir(this.ataqueEspecialMaximo);
                    bajar(this.velocidadMaximo);
                }
                break;
            case StadisticInterface.MIEDOSA:
                if (StadisticInterface.MIEDOSA.equals(naturaleza.getNombre())){
                    subir(this.velocidadMaximo);
                    bajar(this.ataqueMaximo);
                }
                break;
            case StadisticInterface.MODESTA:
                if (StadisticInterface.MODESTA.equals(naturaleza.getNombre())){
                    subir(this.ataqueEspecialMaximo);
                    bajar(this.ataqueMaximo);
                }
                break;
            case StadisticInterface.OSADA:
                if (StadisticInterface.OSADA.equals(naturaleza.getNombre())){
                    subir(this.defensaMaximo);
                    bajar(this.ataqueMaximo);
                }
                break;
            case StadisticInterface.PICARA:
                if (StadisticInterface.PICARA.equals(naturaleza.getNombre())){
                    subir(this.ataqueMaximo);
                    bajar(this.defensaEspecialMaximo);
                }
                break;
            case StadisticInterface.PLACIDA:
                if (StadisticInterface.PLACIDA.equals(naturaleza.getNombre())){
                    subir(this.defensaMaximo);
                    bajar(this.velocidadMaximo);
                }
                break;
            case StadisticInterface.SERENA:
                if (StadisticInterface.SERENA.equals(naturaleza.getNombre())){
                    subir(this.defensaEspecialMaximo);
                    bajar(this.ataqueMaximo);
                }
                break;
        }
        return new Pokemon(this.nombre, this.tipos, this.numPokedex, this.descripcion, this.movimientos, this.generacion, this.imagen
        , this.nivel, this. psBase, this.ataqueBase, this.defensaBase, this.ataqueEspecialBase, this.defensaEspecialBase, this.velocidadBase,
        this.psMaximo, this.ataqueMaximo, this.defensaMaximo, this.ataqueEspecialMaximo, this.defensaEspecialMaximo, this.velocidadMaximo,
                this.iv, this.shiny, this.habilidad, this.naturaleza, this.listaTipos, this.listaMovimientos);
    }
}


