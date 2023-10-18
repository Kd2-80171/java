package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckString {

	
	public static void main (String [] ergs) {
		
		List <String> list = new ArrayList<>();
		  list.add("zzzzz");
		  list.add("sanket");
		  list.add("SUSHMIT");
		  list.add("chandan");
		  list.add("abhi");
		  list.add("Saish");
		  
		//  String max = Collections.max(list);
		  
		  System.out.println(Collections.max(list));
	}
}
