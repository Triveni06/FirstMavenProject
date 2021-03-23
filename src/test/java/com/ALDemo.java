package com;

import java.util.ArrayList;

public class ALDemo {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(10);
		al.add("hello");
		al.add(null);
		al.add(10);
		al.add(10.5);
		al.add(100);
		System.out.println(al);
		System.out.println(al.size());
		al.set(3, 110);
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		System.out.println(al.isEmpty());
		//al.clear();
		System.out.println(al.get(2));
		System.out.println(al.size());
		System.out.println(al.isEmpty());

	}

}
