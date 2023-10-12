package com.app.vehicles;

public class Vehicle {
	
	private int chasisNo;
	private double price;
	private String color;
	
	
	public Vehicle(int chasisNo, double price, String color) {
		this.chasisNo = chasisNo;
		this.price = price;
		this.color = color;
	}


	@Override
	public boolean equals(Object v1)
	{
		if(v1==null)
			return false;
		if(this==v1)
			return true;
		else if(this.getClass()!=v1.getClass())
			return false;
		
		
		Vehicle v2=(Vehicle)v1;
		return this.chasisNo==v2.chasisNo;
	}
		
		
}
