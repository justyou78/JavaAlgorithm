package com.example.abstrat_and_interface;

public class Main {
	public static void main(String[] args) {
		ChildClass c= new ChildClass();
		c.test();
		c.test02();
		c.testinterface();
		Abstract a = new ChildClass();
		a.test02();
	}
}
