package sunbeam.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;


public class Mainqsn1 {
	
	public static void main (String [] ergs) {
		
		Set <Book> set = new LinkedHashSet<>();
		
    set.add(new Book("123", 10.5 ,"Shivaji Sawant" ,11 ));	
    set.add(new Book("121", 13.22 ,"abdul kalam" ,15 ));
    set.add(new Book("1234", 16.5 ,"wapu kale" ,16 ));
    set.add(new Book("123234", 10.5 ,"Shivaji Sawant" ,31 ));
    set.add(new Book("35656", 10.5 ,"vi sa khandekar" ,23 ));
    set.add(new Book("1234", 16.5 ,"wapu kale" ,16 ));
    
  //  System.out.println(set.toString());
	Iterator <Book> itr = set.iterator();
	while(itr.hasNext()) {
		Book book = itr.next();
		System.out.println(book);
	}
	}
	//order is what we added..
	//duplicacy value will be added if hashcode is not there 
	//using hashcode method the duplicacy will be resolved eaisly
	

}
