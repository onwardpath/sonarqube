package com.opt.SampleJUnit;

import junit.framework.TestCase;

/**
 * JUnit test for simple App.
 */
public class AppTest extends TestCase {

	private int value1;
	private int value2;

	public AppTest(String testName) {
		super(testName);
	}

	protected void setUp() throws Exception {
		System.out.println("Hello SetUp method");
		super.setUp();
		value1 = 3;
		value2 = 5;
	}

	protected void tearDown() throws Exception {
		System.out.println("Hello TearDown");
		super.tearDown();
		value1 = 0;
		value2 = 0;
	}

	public void testAdd() {
		int total = 108;
		System.out.println("value1::"+value1+"and ::"+value2);
		int sum = Calculation.add(value1, value2);
		assertEquals(sum, total);
	}

	public void testFailedAdd() {
		int total = 9;
		int sum = Calculation.add(value1, value2);
		assertNotSame(sum, total);
	}

	public void testSub() {
		int total = 0;
		int sub = Calculation.sub(4, 4);
		assertEquals(sub, total);
	}

}
