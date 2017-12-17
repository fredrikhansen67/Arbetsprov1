package AP.com.Arbetsprov;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
/**
 * Arbetsprov Fast2!
 *
 */
public class App 
{
	public static List<Person> personLista = new ArrayList<Person>();
     
    public static void main( String[] args )
    {
    	
        System.out.println( "Arbetsprov!" );
        String jsonData = "C:\\Users\\fredrik\\arbetsprov\\Arbetsprov\\names.json";
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(jsonData));
            
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);            
            JSONArray arr =  (JSONArray) jsonObject.get("names");
            
            // loop igenom arrayen addera objekten till listan
            Iterator<JSONObject> iterator = arr.iterator();
            while (iterator.hasNext()) {
            	JSONObject p = (JSONObject )iterator.next();
            	personLista.add(new Person(p.get("firstname").toString(), p.get("surname").toString(), p.get("gender").toString()));
                System.out.println(iterator.next());
            }
            printSurNameListSorted();
//            printListContent();

        } catch (FileNotFoundException e){
        	e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
    }
    

    protected static void printFirstNameListSorted(){
    	Collections.sort(personLista, Person.FirtNameComparator);
    	printListContent();	
    }
    protected static void printSurNameListSorted(){
    	Collections.sort(personLista, Person.SurNameComparator);
    	printListContent();	
    }
    protected static void printListContent() {
    	System.out.println("Print all objects :"+personLista.size());
    	for(Person p:personLista) {		
    		System.out.println(p.toString());
    	}
    }
}

