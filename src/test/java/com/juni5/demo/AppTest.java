package com.juni5.demo;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.junit.app.App;

public class AppTest {
	
	App a1;

	// BeforeAll annotation will run only once before executing all the methods in
	// the class or suite
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Inside Before All Method");
	}

	// AfterAll annotation will run only once after executing all the methods in
	// the class or suite
	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Inside after All Method");
	}

	// BeforeEach annotation will run Before executing each testCase
	@BeforeEach
	public void setUp() throws Exception {
		a1 = new App();
		System.out.println("Inside BeforeEach Method");
	}

	// AfterEach annotation will run After executing each testCase
	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("Inside afterEach Method");
	}

	@Test
	public void test1() {
		assertEquals(10,a1.add(-10, 20));
		assertEquals(-30,a1.sub(-20, 10));
		assertEquals(30,a1.mul(10, 3));
		assertEquals(-2,a1.div(20, -10));
		assertEquals(2,a1.mod(20,9));
		System.out.println("Inside test1 Method");

	}

	@Test
	public void test2() {
		assertEquals(30,a1.add(10, 20));
		assertEquals(10,a1.sub(20, 10));
		assertEquals(30,a1.mul(10, 3));
		assertEquals(2,a1.div(20, 10));
		assertEquals(0,a1.mod(20, 10));
		System.out.println("Inside test2 Method");
	}

}
