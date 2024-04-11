package ficheros;

import java.io.*;

public class OrganizaFichero {
    /**
     * Metodo en el que guardo informacion de una clase en concreto en un
     * fichero de texto y creo una estructura de directorios organizada
     * segun la clase que sea, (Ej. Clase: Pokemon, Pokemon seria un directorio
     * y contendria en su interior ficheros de texto en el que guardo informacion
     * de los mismos, un ejemplo nombre de fichero de texto en este caso seria
     * Pikachu o Geodude)
     * @param nombreFichero: Establece el nombre del fichero en el que se va a guardar
     *                     la informacion
     * @param nombreDirectorio:Establece el nombre del directorio en el que se van a guardar
     *      *                  los distintos ficheros de texto
     * @param contenido: Se especifica el contenido del archivo
     */
    public static void guardaInformacion(String nombreFichero, String nombreDirectorio, String contenido){
        File directorioBase = new File("directorioDeInformacion");

        try{
            //Verifico que exista ya el directorio
        if (directorioBase.exists()){
            System.out.println("El fichero y el directorioBase ya existen");
            //Si no existe lo creo
        } else if (directorioBase.mkdir()){
            System.out.println("archivo y directorioBase creados");
            //Si no se puede crear muestro caracteristicas del mismo
        } else {
            System.out.println("El directorioBase no existe:");
            System.out.println("El nombre del directorioBase es: " + directorioBase.getName());
            System.out.println("La longitud del directorioBase es: " + directorioBase.length());
            System.out.println("La ruta absoluta del directorioBase es: " + directorioBase.getAbsolutePath());
        }

        //Establezco el nombre del directorio de la clase en cuestion, que va a contener ficheros
            String directorioClase = directorioBase.getName() + File.separator + nombreDirectorio;
            File directorio = new File(directorioClase);
            //Verifico si existe el directorio
            if (!directorio.exists()) {
                //Si el directorio no se ha podido crear salta un error
                if (!directorio.mkdir()) {
                    System.out.println("Error: No se pudo crear el directorio para la clase " + nombreFichero);
                }
            }

            String nombreArchivo = directorioClase + File.separator + nombreFichero;

            //Escribo el contenido en el archivo
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
            bw.write(contenido);
            //Cierro el buffer de escritura
            bw.close();
            System.out.println("Archivo creado correctamente: " + nombreArchivo);

            System.out.println("Contenido de mi archivo: ");
            //Leo el contenido ya escrito en el archivo
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            //En el while verifico que el archivo se pueda leer
            while (br.ready()){
                //Si se puede leer imprimo por pantalla el
                // contenido de cada archivo
                System.out.println(br.readLine());
            }
            //Cierro el flujo de lectura
            br.close();
            } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
            }
    }
}
