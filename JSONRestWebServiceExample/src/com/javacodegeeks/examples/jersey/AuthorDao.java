package com.javacodegeeks.examples.jersey;

import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class AuthorDao {
	
	List<Person> listPerson;
	
	JSONArray employeeList;
	public AuthorDao()
	{
		listPerson = new ArrayList<>();
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Cheng");
		p1.setAddress("NJ");
		
		Person p2 = new Person();
		p2.setId(2);
		p2.setName("James");
		p2.setAddress("LA");
		listPerson.add(p1);
		listPerson.add(p2);
		
	    @SuppressWarnings("unchecked")
	      
	          //JSON parser object to parse read file
	          JSONParser jsonParser = new JSONParser();
	           
	          try (FileReader reader = new FileReader("employees.json"))
	          {
	              //Read JSON file
	              Object obj = jsonParser.parse(reader);
	   
	             JSONArray employeeList = (JSONArray) obj;
	              System.out.println(employeeList);
	              	             
	   
	          } catch (FileNotFoundException e) {
	              e.printStackTrace();
	          } catch (IOException e) {
	              e.printStackTrace();
	          } catch (ParseException e) {
	              e.printStackTrace();
	          }
	  		
//	    listPerson = employeeList;
		
		
	}
	
	
	public List<Person> getListPerson()
	{
		return listPerson;
	}
	
	public Person getPerson(int id) {
		
		for(Person p : listPerson) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}
}
