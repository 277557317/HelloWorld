package com.customer.test;


public class Test {

	public static void main(String[] args) {

		String str = "3.75Сʱ(0.47��)";
		double timeLong = Double.parseDouble(str.substring(0, 4));
		System.out.println(timeLong);
	}

}
