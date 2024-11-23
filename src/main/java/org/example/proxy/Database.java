package org.example.proxy;

public class Database {
    public void connect(String dbname){
        String message = String.format("connected to database %s", dbname);
        System.out.println(message);
    }
}
