package AP.com.Arbetsprov;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

 
public class ListItemCounter 
{  
	private static HashMap<String, Integer> elementCountMap = new HashMap<String, Integer>();
	
    static void arrayElementCountFirstname(List<?> inputArray)
    {
    	elementCountMap = new HashMap<String, Integer>();
        Iterator<?> iter = inputArray.iterator();
        
        while ( iter.hasNext()) 
        {	
        	Person i = (Person) iter.next();
            elementCountMap.put(i.getfName(), (elementCountMap.get(i.getfName()) == null) ? 1 : elementCountMap.get(i.getfName()) + 1);
        }
        printNameList();          
    }
    
    
    
    static void arrayElementCountSurname(List<?> inputArray)
    {
    	elementCountMap = new HashMap<String, Integer>();
        Iterator<?> iter = inputArray.iterator();
        while ( iter.hasNext()) 
        { 	
        	Person i = (Person) iter.next();
        	elementCountMap.put(i.geteName(), (elementCountMap.get(i.geteName()) == null) ? 1 : elementCountMap.get(i.geteName()) + 1);
        }
        printNameList();          
    }
    
    public static void printNameList() {
    	for(String name: elementCountMap.keySet()) {
    		String key =name.toString();
            String value = elementCountMap.get(name).toString();  
            System.out.println(key + " " + value);  
    	}
    }
     
    public HashMap makeListToMap(List<Person> results) {
    	HashMap<String, Integer> resultsMap = new HashMap<String, Integer>();
    	for (Person p : results) {
    	    resultsMap.put(p.getfName(), 1);
    	}
    	return resultsMap;
    }
    
  
    
}
