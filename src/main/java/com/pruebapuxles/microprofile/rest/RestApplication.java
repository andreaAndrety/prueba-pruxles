package com.pruebapuxles.microprofile.rest;

import com.pruebapuxles.microprofile.mongoDB.mongoConnection;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RestApplication extends Application {

    public RestApplication() {
        mongoConnection mcnn= new mongoConnection();
    }
}
    
    
 
