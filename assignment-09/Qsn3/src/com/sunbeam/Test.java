package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Student[] arr = new Student[5] ;
		
		arr[0] = new Student(3, "Nilesh","nagar", 50);
		arr[1] = new Student(1, "Sarang","pune" ,68);
		arr[2] = new Student(4, "Prashant","pune" ,68);
		arr[3] = new Student(5, "Prashant","udgir", 75);
		arr[4] = new Student(2, "Nitin", "kolhapur",58);
		
		System.out.println("before sort");
		for (Student s : arr) 
		{
			   System.out.println(s);
		}	
			NameComparator c1=new NameComparator();
			
			Arrays.sort(arr,c1);
			
			System.out.println("after sort");
			 for (Student s1 : arr) {
				 System.out.println(s1);
				
			}
			
		}
		
	
}

class NameComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		int diff = -s1.getCity().compareTo(s2.getCity());
		if(diff == 0)
			diff=Double.compare(s1.getMarks(), s2.getMarks());
		if (diff == 0)
			
			diff= s1.getName().compareTo(s2.getName());
		
		
   return diff;
		
		
		
	}
			
}
           







