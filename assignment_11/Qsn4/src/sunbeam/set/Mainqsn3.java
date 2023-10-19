package sunbeam.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class ComparePrice implements Comparator<Book>{
	@Override
	public int compare(Book b1 , Book b2) {
		int diff = Double.compare(b1.getPrice(),b2.getPrice() ); 
		
		return diff;
	}
	
}

public class Mainqsn3 {
	
	public static void main (String [] ergs) {
		 ComparePrice cmp = new ComparePrice();
		 
		Set <Book> set = new TreeSet<Book>(cmp);
		
    set.add(new Book("123", 10.5 ,"Shivaji Sawant" ,11 ));	
    set.add(new Book("121", 13.22 ,"abdul kalam" ,15 ));
    set.add(new Book("1234", 16.5 ,"wapu kale" ,16 ));
    set.add(new Book("123234", 18.5 ,"Shivaji Sawant" ,31 ));
    set.add(new Book("35656", 12.5 ,"vi sa khandekar" ,23 ));
    set.add(new Book("1234", 17.5 ,"wapu kale" ,16 ));
    
  //  System.out.println(set.toString());
    
   
    
	Iterator <Book> itr = set.iterator();
	while(itr.hasNext()) {
		Book book = itr.next();
		System.out.println(book);
	}
	
	 
		NavigableSet <Book> set1 = new TreeSet<Book>(cmp);
		
   set1.add(new Book("123", 10.5 ,"Shivaji Sawant" ,11 ));	
   set1.add(new Book("121", 13.22 ,"abdul kalam" ,15 ));
   set1.add(new Book("1234", 16.5 ,"wapu kale" ,16 ));
   set1.add(new Book("123234", 18.5 ,"Shivaji Sawant" ,31 ));
   set1.add(new Book("35656", 12.5 ,"vi sa khandekar" ,23 ));
   set1.add(new Book("1234", 17.5 ,"wapu kale" ,16 ));
   
   Iterator <Book>  qwerty= set1.descendingIterator();
   
   //Iterator <Book> itr1 = set.iterator();
	while(qwerty.hasNext()) {
		Book book = qwerty.next();
		System.out.println(book);
	}

	
	//order is sorted..
	//duplicacy will remove automatically 
	//using natural orderring method the duplicacy will be resolved
	//no need of hashcode and equals method..
	


/*. Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it). Display them using iterator()
and descendingIterator().*/


	}
}
	















