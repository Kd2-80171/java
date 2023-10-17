import java.util.Comparator;

class Dcomparator implements Comparator <Double>{

	@Override
	public int compare(Double d1, Double d2) {
		int diff =Double.compare(d1, d2);
		return diff;
	}
	
	
}
public class Sorting  {
	
	static <T> void selectionSort(double[] arr, Dcomparator dm) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(dm.compare(arr[i], arr[j]) > 0) {
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
	}
	}
 }


  public static void main(String [] ergs) {
	  
	  double arr[] = {3.4, 2.2, 3.1, 4.4, 2.5};
	  Dcomparator dm = new Dcomparator();
	  
	  for (double d : arr) {
		  System.out.println(d);
		selectionSort(arr,dm);
		
	}
	  
  }
}
