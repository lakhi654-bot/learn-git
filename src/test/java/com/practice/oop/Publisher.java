package com.practice.oop;

public class Publisher {
	private int id;
	private String publisherName;
	
	public Publisher() {
	}

	public Publisher(int id, String publisherName) {
		super();
		this.id = id;
		this.publisherName = publisherName;
	}
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}
}
