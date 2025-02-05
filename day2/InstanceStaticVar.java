package com.celcom.day2;

//Instance and static 
public class InstanceStaticVar {
	static int a = 10;
	public static void main(String[] args) {
		InstanceStaticVar obj1 = new InstanceStaticVar();
		InstanceStaticVar obj2 = new InstanceStaticVar();
				
		 System.out.println(obj1.a); //10
		 System.out.println(obj2.a); //10
		 
		 obj1.a = 20;
		 
		 System.out.println(obj1.a); //20
		 System.out.println(obj2.a); //10
		 
	}
}
