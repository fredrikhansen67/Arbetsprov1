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

            if(elementCountMap.containsKey(i.getfName()))
	            {
	                elementCountMap.put(i.getfName(), elementCountMap.get(i.getfName())+1);	
	            }
	            else
	            {
	                elementCountMap.put(i.getfName(), 1);
	            }
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
        	//Found an existin match, adding to the counter
            if(elementCountMap.containsKey(i.geteName()))
            {
                elementCountMap.put(i.geteName(), elementCountMap.get(i.geteName())+1);
            }
            //No match, add the new name to the list
            else
            {
                elementCountMap.put(i.geteName(), 1);
            }
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
