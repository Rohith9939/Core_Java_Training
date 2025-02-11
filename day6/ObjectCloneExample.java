package com.celcom.day6;

class ObjectCloneExample implements Cloneable{
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloneExample obj1 = new ObjectCloneExample();
		
		System.out.println(obj1.hashCode());
		
		ObjectCloneExample obj2 = (ObjectCloneExample) obj1.clone();
		
		System.out.println(obj2.hashCode());
	}
}
