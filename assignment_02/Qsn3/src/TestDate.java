
public class TestDate {

	
	public static void main (String  [] ergs) {
		Date date = new Date(10 ,11 ,2022);
		
		date.displayDate();
		
		System.out.println("updated date");
		
		date.setMonth(10);
		date.setDay(12);
	    date.setYear(2022);
	    
	    date.displayDate();

	
	}
}
