package com.javacodegeeks.examples.jersey;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ReadJSONExample
{
	List<Person> listPerson;
	JSONArray employeeList;
    @SuppressWarnings("unchecked")
//    public ReadJSONExample() {
      public static void main(String[] args)
      {
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
  		
    }
    public JSONArray getJSON(){
    	return employeeList;
    }
        
 

}