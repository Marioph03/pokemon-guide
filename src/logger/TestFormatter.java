package logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.*;

public class TestFormatter extends Formatter {
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("pokemonguide.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public TestFormatter(){
        Logger logger  = MyLogger.myLogger("Pokemon");
        ConsoleHandler ch = new ConsoleHandler(); //instancia de un nuevo manejador de consola
        ch.setFormatter(this); //añado como formateador esta clase
        logger.addHandler(ch); // añado un nuevo manejador de consola
        logger.log(Level.INFO, "Formateador de mensaje de registro de la clase Pokemon");
    }

    @Override
    public String format(LogRecord record) {
        return record.getThreadID()+": :"+ record.getSourceMethodName() +
                ": :" + record.getMessage()+"\n";
    }
}
