package org.example.lab13.task1;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("log:  " + message);
    }

    public void logInfo(String message) {
        System.out.println("info: " + message);
    }

    public void logWarning(String message) {
        System.out.println("warning: " + message);
    }

    public void logError(String message) {
        System.out.println("error: " + message);
    }
}
class Main {
    public static void main(String[] args){
        Logger logger = Logger.getInstance();
        logger.logInfo("app started");
        logger.logWarning("log warninggg");
        logger.logError("app didnt work");
    }
}