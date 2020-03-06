/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebapuxles.microprofile.rest;


import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.pruebapuxles.microprofile.document.Habilidad;
import com.pruebapuxles.microprofile.mongoDB.mongoConnection;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ASUS
 */
@Path("/habilidad")
public class HabilidadEndPoint {
    
    mongoConnection mongo = new mongoConnection();
    
    DB db =mongo.getDb();
    
    DBCollection habilidadC =db.getCollection("habilidad");
    
         @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DBObject> doGet() {
        
        List<DBObject> list=new ArrayList();
        
        Cursor cursor =habilidadC.find();
        
       for (DBObject cur : habilidadC.find()) {
           
           list.add(cur);
           
        }
        return list;
    }
         @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPost(Habilidad habilidad) {
        BasicDBObject document =new BasicDBObject();
          document.append("nombre",habilidad.getNombre());
          
          habilidadC.insert(document);
          
        return Response.ok("guardado").build();
    }
    
         @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPut() {
        return Response.ok("Hello from Thorntail!").build();
    }
    
}
