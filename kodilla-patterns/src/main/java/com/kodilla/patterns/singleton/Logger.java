package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerInstance = null;
    private String lastlog = "";

    private Logger(){
    }

    public static Logger getInstance(){
        if(loggerInstance == null){
            synchronized (Logger.class){
                if (loggerInstance == null){
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    public void log(String log) {
        lastlog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastlog() {
        return lastlog;
    }
}
