package com.javacodegeeks.examples.jersey;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/AuthorService")
public class AuthorService {
	
	AuthorDao au = new AuthorDao();
	
	
	@GET
	@Path("/authors")
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Person> getListPerson(){
		return au.getListPerson();
	}
	
	
	@GET
	@Path("/authors/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Person getPerson(@PathParam("id") int id) {
		
		return au.getPerson(id);
	}

}
