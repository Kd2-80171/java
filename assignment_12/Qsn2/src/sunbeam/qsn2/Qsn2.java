package sunbeam.qsn2;

import java.util.function.Predicate;

public class Qsn2 {
	
	public static  int countif (String [] arr , Predicate<String> cond) {
		int count = 0;
		for (String string : arr) {
			if (cond.test(string))
			count++;
		}
		return count;
	}
	public static void main(String [] ergs) {
		String [] arr = {"Nilesh" , "Shubham" ,"Pratik" , "Omkar" , "Prashant"};
		
		int cnt =countif(arr , s -> s.length() > 6);
		System.out.println("Result: " + cnt);
	}

}
