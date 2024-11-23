package org.example.singleton;

import java.time.LocalDate;

public class Logger {
    private static  Logger instance;

    private  Logger(){}
    public static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public  void classLogg(Object object, String info){
        System.out.println("Log info: " + LocalDate.now() + " - "  + object.getClass()  + " - " + info);
    }
}
