
public class FindDuplicates {
 public static void main(String[] args) {
	
	 String [] arr1 = { "abhi" , "sai" , "sush", "chandan" , "prasad" ,"kal" , "vaibhav" };
	 String [] arr2 = { "kal","prasad","vaibhav","paduman","ashhish","yash","bhingari"};
	 
	 for (int i=0; i<arr1.length; i++) {
		 for (int j=0; j<arr2.length; j++) {
			 if( arr1[i].equals(arr2[j])) {
				 System.out.println("duplicate-" + arr1[i]);
				 
			 }
		 }
	 }
	 
}
}
