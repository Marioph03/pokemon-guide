package xml;

import org.w3c.dom.Element;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringWriter;
import java.lang.reflect.Field;

public class XmlConverter {
    /**
     * Metodo que inicializa un objeto de la clase Document
     * @return: devuelve un objeto de la clase Document
     */
    public Document inicializarDocumento() {
        Document documento;
        // Creamos los objetos de creación de Documentos XML
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor;
        try {
            constructor = docFactory.newDocumentBuilder();
            documento = constructor.newDocument();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        return documento;
    }

    /**
     * Metodo que imprime por pantalla el contenido de
     * un documeto xml
     * @param doc: Documento que se va a imprimir por
     *           pantalla
     * @return: Devuelve el contenido del documento y
     * lo imprime por pantalla
     */
    public String stringConverter(Document doc) {
        // Creamos el objeto transformador
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer;
        String output;
        try {
            transformer = tf.newTransformer();
            // Indicamos que queremos que idente el XML con 2 espacios
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            // Creamos el escritor a cadena de texto
            StringWriter writer = new StringWriter();
            // Fuente de datos, en este caso el documento XML
            DOMSource source = new DOMSource(doc);
            // Resultado, el cual se almacenará en el objeto writer
            StreamResult result = new StreamResult(writer);
            // Efectuamos la transformación a lo que indica el objeto resultado, writer apuntará a él
            transformer.transform(source, result);
            // Convertimos el buffer de writer en cadena de texto
            output = writer.getBuffer().toString();
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    /**
     * Metodo que sirve para generar un documento
     * xml y convierte un documento a xml
     * @param doc: Documento que se va a transformar
     *           a xml
     * @param nombreArchivo: nombre que se le va a poner
     *                     al xml
     * @return: Devuelve true si se ha creado con exito
     */
    public boolean escribirArchivo(Document doc, String nombreArchivo){
        // Creamos el objeto transformador
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer;
        try {
            transformer = transformerFactory.newTransformer();
            // Indicamos que queremos que indente el XML con 2 espacios
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            // Archivo donde almacenaremos el XML
            File archivo = new File(nombreArchivo);

            // Fuente de datos, en este caso el documento XML
            DOMSource source = new DOMSource(doc);
            // Resultado, el cual almacena en el archivo indicado
            StreamResult result = new StreamResult(archivo);
            // Transformamos de la fuente DOM al resultado, lo que almacena tdo en el archivo
            transformer.transform(source, result);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    /**
     * Devuelve un documento de la clase del objetoq que
     * se le ha pasado por parametro
     * @param obj: Objeto del cual se va a generar el
     *           documento xml
     * @return: Devuelve el documento creado con los
     * elementos indicados por mi dentro del metodo
     */
    public Document generateXml(Object obj){
        Document documento = this.inicializarDocumento();

        // Creamos el elemento principal
        Element entrada =  documento.createElement("principal");
        // Hacemos que el elemento entrada descienda directo del nodo XML principal
        documento.appendChild(entrada);

        // Obtengo el objeto Class asociado al tipo de la instancia de obj y asignándolo a la variable clase
        Class<?> clase = obj.getClass();
        // Itero sobre los campos de la clase y agregar elementos al documento
        for (Field field : clase.getDeclaredFields()) {
            field.setAccessible(true);
            // Creamos el elemento
            Element elemento =  documento.createElement(field.getName());
            // Establecemos el contenido del elemento
            try {
                elemento.setTextContent(String.valueOf(field.get(obj)));
                // Indicamos que el elemento desciende de entrada
                entrada.appendChild(elemento);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return documento;
    }
}
