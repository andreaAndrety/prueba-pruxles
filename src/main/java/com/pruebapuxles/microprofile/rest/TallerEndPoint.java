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
import com.pruebapuxles.microprofile.document.Taller;
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
@Path("/taller")
public class TallerEndPoint {
    
    mongoConnection mongo = new mongoConnection();
    
    DB db =mongo.getDb();
    
    DBCollection tallerC =db.getCollection("taller");
    
         @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DBObject> doGet() {
        List<DBObject> list=new ArrayList();
        
        Cursor cursor =tallerC.find();
        
       for (DBObject cur : tallerC.find()) {
           
           list.add(cur);
           
        }
        return list;
    }
    
    
         @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPost(Taller taller) {
         BasicDBObject document =new BasicDBObject();
          document.append("idPersona",taller.getIdPersona());
          document.append("fecha",taller.getFecha());
          document.append("calificacion",taller.getCalificacion());
          document.append("lugar",taller.getLugar());
          
          tallerC.insert(document);
          
        return Response.ok("guardado").build();
    }
    
         @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response doPut() {
        return Response.ok("Hello from Thorntail!").build();
    }
    
    
    
}
