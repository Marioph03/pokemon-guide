package validacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionCampoClave {
    /**
     * Este metodo se va a usar para validar cualquier campo
     * clave
     * @param o: Este parametro es el parametro que se va a validar
     * @param expresionRegular: esta es la expresion regular que se va a usar
     *                        para validar el campo clave
     * @return: Si la expresion coincide devolvera un true
     */
    public static boolean validaCampoClave(Object o, String expresionRegular){
        //Convierto el objeto en una cadena
        String cadena = o.toString();
        //Le paso un patron para la expresion regular
        Pattern patron = Pattern.compile(expresionRegular);
        //Le hago un matcher para que realice la operacion
        //de la expresion regular
        Matcher matcher = patron.matcher(cadena);
        //Si la expresion coincide devolvera un true
        return matcher.matches();
    }
}
