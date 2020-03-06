/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebapuxles.microprofile.mongoDB;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;

/**
 *
 * @author ASUS
 */
public class mongoConnection {
    
    private DB db;
    

    public mongoConnection() {
        conectar();
    }
  
    
    public void conectar(){
    try {
     MongoClient mongoClient= new MongoClient("localhost",27017);
      db=mongoClient.getDB("puxles");
        System.out.println("Conectado a la base de datos");
    }catch(UnknownHostException e){
    e.printStackTrace();
    }
    
    
    }

    /**
     * @return the db
     */
    public DB getDb() {
        return db;
    }
    
    
    
    
}
