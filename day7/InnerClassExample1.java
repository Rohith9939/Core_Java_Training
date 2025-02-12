package com.celcom.day7;

public class InnerClassExample1 {
	
	//Non static inner class
	class InnerClass1 {
		void myMethod1() {
			System.out.println("Non-static Inner Class");
		}
	}
	
	//static inner class
	static class InnerClass2 {
		void myMethod2() {
			System.out.println("Static Inner class");
		}
	}
	
	void myMethod() {
	 	//3. Local Inner Class
		class InnerClass3 {
			void myMethod3() {
				System.out.println("Local Inner Class");
			}
		}
		InnerClass3 inner3 = new InnerClass3();
		inner3.myMethod3();
		
	}
	
	public static void main(String[] args) {
		InnerClassExample1 obj = new InnerClassExample1();
		
		InnerClass1 inner1 = obj.new InnerClass1();
		inner1.myMethod1();
		
		InnerClassExample1.InnerClass2 inner2 = new InnerClassExample1.InnerClass2();
//		InnerClassExample1.InnerClass2 inner2 = new InnerClass2();
		inner2.myMethod2();
		
	
		obj.myMethod();
		
	}

}
