package com.juni5.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class DemoTest {
	public static int num1 = 10;
	public static int num2 = 100;

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
		System.out.println("Inside BeforeEach Method");
	}

	// AfterEach annotation will run After executing each testCase
	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("Inside afterEach Method");
	}

	@Test
	public void test1() {
		System.out.println("Inside test1 Method");
		assertEquals(100, num2);
		assertFalse(100==num1);
	}

	@Test
	public void test2() {
		System.out.println("Inside test2 Method");
		assertEquals(100, num2);
		assertTrue(100==num2);
	}

}
