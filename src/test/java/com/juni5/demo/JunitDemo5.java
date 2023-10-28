package com.juni5.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitDemo5 {
	
	//BeforeAll Annotation will run only once before executing all the method 
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Inside the Before All Method");
	}
	
	//AfterAll Annotation will run only once after executing all the methods
	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Inside the After All Method");
	}
	
	//BeforeEach Annotation will run before executing each testcase
	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Inside the Before Each Method");
	}
	
	//AfterEach Annotation will run after executing each testcase
	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("Inside the After Each Method");
	}

	@Test
	public void test1() {
		System.out.println("Inside the Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Inside the Test2");
	}

}
