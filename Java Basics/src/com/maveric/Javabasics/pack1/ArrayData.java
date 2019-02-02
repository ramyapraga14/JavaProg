package com.maveric.Javabasics.pack1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5]; // Array size should defined, without that cannot define array
		a[0]= 10;
		a[1]= 15;
		a[2]= 22;
		a[3]= -8;
		a[4]= 111;
		boolean[] b= {true, false, true, false};
		char[] c = {'a','s','#','@'};
		String[] d = new String[3];
		d[0]="One";
		d[1]= "two";
		d[2]= "three";
		int[][] e = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(e[1][1]);
		System.out.println(e.length);
		System.out.println(e[0].length);
		int[][] A = e.clone();
		System.out.println(A[1][2]);
		
		//single dimension ArrayList
		ArrayList<Integer> f = new ArrayList<Integer>();
		f.add(1);
		f.add(2);
		f.add(25);
		System.out.println(f.get(2));
		f.remove(2);
		f.remove((Object) 2);
		ArrayList<String> g = new ArrayList<String>();
		g.add("One");
		g.add("Two");
		g.add("Three");
		g.remove(1);
		System.out.println(g.get(1));
		g.size();
		g.add(1, "Five");
		System.out.println(g.get(1));
		//Double dimension Array
		ArrayList<ArrayList<String>> h = new ArrayList<ArrayList<String>>();
		ArrayList<String> r1 = new ArrayList<String>();
		ArrayList<String> r2 = new ArrayList<String>();
		r1.add("One");
		r1.add("Two");
		r1.add("Three");
		h.add(r1);
		r2.add("Four");
		r2.add("Five");
		h.add(r2); //Appending r2 to the arraylist of arraylist(2d array)
		r2.set(1, "Six");
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		System.out.println(i.get(2));
		
		// Iterator displays only Unique values
		Iterator<Integer> j = i.iterator();
		System.out.println(j.next());
		System.out.println(j.next());
		System.out.println(j.next());
		
		//Set  Will not display repeated values and will take values as Object. So to display it we need to do Typecasting using line 79
		Set<Integer> x = new HashSet<Integer>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(1);
		x.add(2);
		Object[] y = x.toArray();
		System.out.println(y[0]+" "+y[1]+" "+y[2]);
		//System.out.println(y[3]); This line displays Index Out of bound error
		
		//HashMap Key and Value pair which will use Key to display the corresponding Key value
		
		HashMap<String, String> z = new HashMap<String, String>();
		z.put("Stage", "QA");
		z.put("URL", "https://www.maveric-systems.com");
		z.put("DBUser", "User1");
		z.put("Browser", "Chrome");
		System.out.println(z.get("Browser"));
		
		
	}

}
