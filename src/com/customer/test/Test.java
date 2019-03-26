package com.customer.test;


public class Test {

	public static void main(String[] args) {

		String str = "3.75Ð¡Ê±(0.47Ìì)";
		double timeLong = Double.parseDouble(str.substring(0, 4));
		System.out.println(timeLong);
	}

}
