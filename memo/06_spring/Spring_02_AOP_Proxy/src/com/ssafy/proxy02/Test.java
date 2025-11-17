package com.ssafy.proxy02;

public class Test {
	public static void main(String[] args) {
		Programmer pr = new Programmer();
		SSAFY ssafy = new SSAFY();
		
		PersonProxy px = new PersonProxy();
		
		px.setPerson(ssafy);
		
		px.coding();
	}
}
