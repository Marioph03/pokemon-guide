package pokemonguide;

import java.util.logging.Formatter;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class MyLogger {
    public static Logger myLogger(String clase){
        return LogManager.getLogManager().getLogger(clase);
    }
}
