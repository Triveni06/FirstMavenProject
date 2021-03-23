package com;

import java.util.ArrayList;

public class ALDemo {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		list.add(10);
		list.add("hello");
		list.add(null);
		list.add(10);
		list.add(10.5);
		list.add(100);
		System.out.println(list);
		System.out.println(list.size());
		list.set(3, 110);
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
		System.out.println(list.isEmpty());
		//al.clear();
		System.out.println(list.get(2));
		//System.out.printlnlist.size());
		System.out.println(list.isEmpty());
		System.out.println(list);

	}

}
