package com.ltidemos;

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		String msg = c.sayHello();
		System.out.println(msg);
		
		int sum = c.addNos(100, 200);
		System.out.println(sum);

	}

}
