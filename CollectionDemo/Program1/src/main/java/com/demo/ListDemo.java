package com.demo;

import java.util.ArrayList;

import java.util.List;

public class ListDemo {

	public static void main(String[]args) {
		ArrayList<Object> names=new ArrayList<>();
		names.add(20);
		names.add("PD");
		names.add("Pratik");
		names.add(10);
		names.add(null);
		names.set(0, "Pratik");
		System.out.println(names);
		System.out.println(names.size());
	}
	
}
