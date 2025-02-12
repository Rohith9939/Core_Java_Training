package com.celcom.main;

import com.celcom.pack1.MyClass1;
import com.celcom.pack2.MyClass2;

//Normal import
import java.lang.Math;

//Static import 
import static java.lang.Math.PI;
import static java.lang.Integer.*;
import static java.lang.System.out;


public class MainClass{
	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1();
		obj1.myMethod1();
		obj1.myMethod2();
		
		MyClass2 obj2 = new MyClass2();
		obj2.myMethod3();
		
		
		out.println(Math.PI);
		System.out.println(PI);
	}
}
