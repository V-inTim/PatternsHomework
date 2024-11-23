package org.example.proxy;

public class DatabaseProxy {
    Database database;
    String host;
    String port;

    public  DatabaseProxy(String host, String port){
        this.host = host;
        this.port = port;
        this.database = new Database();
    }

    public void connect(String dbname){
        String fullPath = String.format("%s:%s/%s", this.host, this.port, dbname);
        database.connect(fullPath);
    }
}
