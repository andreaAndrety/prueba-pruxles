/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebapuxles.microprofile.rest;


import com.fasterxml.jackson.databind.JsonSerializable;
import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.pruebapuxles.microprofile.document.Persona;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.mongodb.DBCollection;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.pruebapuxles.microprofile.mongoDB.mongoConnection;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
/**
 *
 * @author ASUS
 */
@Path("/persona")
public class PersonaEndPoint {
    mongoConnection mongo = new mongoConnection();
    
    DB db =mongo.getDb();
    
    DBCollection personaC =db.getCollection("persona");
    
        @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DBObject> doGet() {
        
          List<DBObject> list=new ArrayList();
        
        Cursor cursor =personaC.find();
        
       for (DBObject cur : personaC.find()) {
           
           list.add(cur);
           
        }
        return list;
    }
    
      @POST
    @Consumes({MediaType.APPLICATION_JSON})
    //@RequestBody({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response doPost(Persona persona) {
          BasicDBObject document =new BasicDBObject();
          document.append("nombre",persona.getNombre());
          document.append("apellidos",persona.getApellidos());
          document.append("direccion",persona.getDireccion());
          document.append("telefono",persona.getTelefono());
          document.append("correo",persona.getCorreo());
          
          personaC.insert(document);
          
        return Response.ok("guardado").build();
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPut() {
        return Response.ok("Hello from Thorntail!").build();
    }
    
}
