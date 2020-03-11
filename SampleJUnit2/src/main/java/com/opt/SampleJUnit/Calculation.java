package com.opt.SampleJUnit;

public class Calculation {
	// Method to Add
	public static int add(int a, int b) {
		
		int c =0;
		
		if (a > 100)
			c = a + b;
		else 
			c = a + b + 50;
		
		if (a < 100)
			c = a+b+100;
		return c;
	}

	// Method to substract
	public static int sub(int a, int b) {
		int c;
		
		if (a > b)
			c = a - b;
		else 
			c = b-a;
		
		if (a > b)
			a = 0;
	
		return c;
	}
}
