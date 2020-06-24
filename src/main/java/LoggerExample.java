import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

class MyFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        String stringRecord = record.getThreadID()+" :: "+record.getSourceClassName()+" :: "
                +record.getSourceMethodName()+" :: "
//                +record.get()+" :: "
                +new Date(record.getMillis())+" :: "+
                "["+record.getLevel().getName()+"] "+
                record.getMessage()+"\n";
        return stringRecord;
    }

}

public class LoggerExample {

    private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
    public static void main(String[] args) throws IOException {


        LOGGER.setLevel(Level.ALL);
        // Creating FileHandler
        Formatter simpleFormatter = new MyFormatter();


        Handler fileHandler = new FileHandler("./Log.log");
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(simpleFormatter);

        // Assigning handler to logger
        LOGGER.addHandler(fileHandler);

        LOGGER.info("Logger action has started!");
        try{
            // exception!
            int i = 0/0;
        }catch(Exception exception){
//            LOGGER.log(Level.SEVERE,""+ exception);
//            System.out.println(Arrays.toString(exception.getStackTrace()));
            log(Level.SEVERE,exception);
        }

        LOGGER.info("Logger action has stoped!");
    }

    private static void log(Level level, Exception e){
        LOGGER.log(level,e +"\n"+Arrays.toString(e.getStackTrace()));
    }

}