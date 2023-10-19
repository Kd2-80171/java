package sunbeam.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


public class Mainqsn2 {
	
	public static void main (String [] ergs) {
		
		Map <String , Book> hashmap = new HashMap<>();
		
    hashmap.put("2key",new Book("sambhaji-123", 10.5 ,"Shivaji Sawant" ,11 ));	
    hashmap.put("3key",new Book("wingsonfire-121", 13.22 ,"abdul kalam" ,15 ));
    hashmap.put("1key",new Book("wapurza-1234", 16.5 ,"wapu kale" ,16 ));
    hashmap.put("4key",new Book("mrutunjay-123234", 10.5 ,"Shivaji Sawant" ,31 ));
    hashmap.put("5key",new Book("yayati-35656", 10.5 ,"vi sa khandekar" ,23 ));
    
    
   //System.out.println(hashmap.toString());
  for (String s : ergs) {
	  System.out.println(s);
	
}
	}
	}
	//order is random..
	//duplicacy value will be added 
	//using hashcode method the duplicacy will be resolved
	


