package com.css.corejava.main;

public class Main {

	public static void main(String[] args) {
		Traniee[] traniees = new Traniee[3];
		traniees[0] = new Traniee(245,"shanthi", 12345678,"shanthi@gmail.com","male", 2 );
		Batch batch = new Batch();
		System.out.println(batch.getTraniee(21));
		System.out.println(batch.getTraniee("male"));
	}

}
