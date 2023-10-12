package com.app.vehicles;

public class VehicleTester {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle(123,3000,"RED");
		
//		Vehicle v2=new Vehicle(123,5000,"BLACK");
		
		Vehicle v2=v1;
		
		if(v1.equals(v2)) {
			System.out.println("VEHICLES ARE SAME");
		}
		else {
			System.out.println("VEHICLES ARE DIFFERERENT");
		}
	}

}
