package com.celcom.day6;

public class GarbageCollection {
	static int count;
	
	GarbageCollection() {
		count++;
		System.out.println(count);
	}
	
	protected void finilize() {
		count--;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		GarbageCollection obj1 = new GarbageCollection();
		GarbageCollection obj2 = new GarbageCollection();
		
		obj1 = null;
		System.gc();
		obj2 = null;
		Runtime.getRuntime().gc();
	}
}
