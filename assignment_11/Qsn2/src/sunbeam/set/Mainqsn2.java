package sunbeam.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class Mainqsn2 {
	
	public static void main (String [] ergs) {
		
		Set <Book> set = new HashSet<>();
		
    set.add(new Book("sambhaji-123", 10.5 ,"Shivaji Sawant" ,11 ));	
    set.add(new Book("wingsonfire-121", 13.22 ,"abdul kalam" ,15 ));
    set.add(new Book("wapurza-1234", 16.5 ,"wapu kale" ,16 ));
    set.add(new Book("mrutunjay-123234", 10.5 ,"Shivaji Sawant" ,31 ));
    set.add(new Book("yayati-35656", 10.5 ,"vi sa khandekar" ,23 ));
    set.add(new Book("wapurza-1234", 16.5 ,"wapu kale" ,16 ));
    
  //  System.out.println(set.toString());
	Iterator <Book> itr = set.iterator();
	while(itr.hasNext()) {
		Book book = itr.next();
		System.out.println(book);
	}
	}
	//order is random..
	//duplicacy value will be added 
	//using hashcode method the duplicacy will be resolved
	

}
