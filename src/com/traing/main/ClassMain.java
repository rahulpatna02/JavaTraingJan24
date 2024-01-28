package com.traing.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ClassMain {
	
	public static void main(String args[]) {
//		ClassMain m = new ClassMain();
//		B b = new B();
//System.out.println(b.b);
//B b1 = new B("passedvallue");
//
//String s = "string";//immutable =
//String s2 = "string";//String Literal declaration //String constant pool
//String s1 = new String("storing");
//String s3 = new String("stkring");
//String [] sarr = {"aaa","bbb","ccc"};
//System.out.println(s.hashCode());
//System.out.println(s2.hashCode());
//System.out.println(s1.hashCode());
//System.out.println(s3.hashCode());
int temp = 100;
Integer i = new Integer(temp);
Integer j = 1000;//AutoBoxing typconversion basic to userdifined
		int k = j;//AutoUnboxing
		List<Integer> arraylist = new ArrayList<>();
		arraylist.add(k);
		arraylist.add(j);
		arraylist.add(i);
		arraylist.add(676);
		arraylist.add(65);
		arraylist.add(3);
		arraylist.add(543);
		//List maintain insertion order
		System.out.println(arraylist);
		Set<Integer> s = new HashSet<>();
		s.add(k);
		s.add(j);
		s.add(i);
		s.add(676);
		s.add(65);
		s.add(3);
		s.add(543);
		System.out.println(s);
		//No order
		Map<String, Integer> map = new HashMap<>();
		map.put("Dibya", 33);
		map.put("minu", 34);
		map.put("rahul", 35);
		System.out.println(map);
	}
protected int a =100;
}
