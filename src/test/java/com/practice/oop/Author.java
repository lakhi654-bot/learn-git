package com.practice.oop;

public class Author {
	private int id;
	private String firstName;
	private String lastName;
	
	Author(){
	System.out.println("default constructor");
	}
	
	Author(int id, String firstName, String lastName){
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}

}
