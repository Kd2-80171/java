package com.sunbeam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Users {

	int id;
	String fname;
	String lname;
	String email;
	String password;
	java.util.Date dob;
	boolean status;
	String role;
	
	public Users() {
		
	}

	public Users(int id, String fname, String lname, String email, String password, Date dob, boolean status,
			String role) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public java.util.Date getDob() {
		return dob;
	}

	public void setDob(java.util.Date dob) {
		this.dob = dob;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}
	
	public void accept (Scanner sc ) throws ParseException{
		System.out.println("enter user details");
		System.out.println("enter id");
		this.id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter fname");
		this.fname = sc.next();
		System.out.println("enter lname");
		this.lname = sc.next();
		System.out.println("enter email");
		this.email=sc.nextLine();
		System.out.println("enter password");
		this.password=sc.nextLine();
		
		System.out.println("enter birthdate   as dd-mm-yyyy");
		String bdate = sc.nextLine();
		
		SimpleDateFormat strd = new SimpleDateFormat("dd-mm-yyyy");
		this.dob = strd.parse(bdate);
		
		this.status= false;
		
		System.out.println("enter role :");
		this.role= sc.nextLine();
	
}
}
