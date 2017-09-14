package test;
import simplemath.TwoInts;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoIntsTest {

	TwoInts obj1, obj2, obj3;
	
	@Before 
	public void beforeEveryMethod() {
		
		obj1 = new TwoInts(); // using the default constructor to instantiate
		obj2 = new TwoInts(5, 15);
		obj3 = new TwoInts(-3, 10);
	}
	
	
	@After
	public void doAfterEveryTestMethod() {
		obj1 = null;
		obj2 = null;
		obj3 = null;
	}
	
	// teting the contructor
	@Test
	public void testTwoInts() {
		assertNotNull(obj1);
		assertEquals(1, obj1.getNum1());
		assertEquals(2, obj1.getNum2());
	}

	@Test
	public void testTwoIntsOverloadedContructor() {
		assertNotNull(obj2);
		assertNotNull(obj3);
		assertEquals(5, obj2.getNum1());
		assertTrue(10 == obj3.getNum2());
	}
	
	@Test
	public void testSumOfTwo() {
		
		TwoInts objTwoInts = new TwoInts(5, 15);
		assertEquals(20, objTwoInts.sumOfTwo());
		
		TwoInts objTwoInts2 = new TwoInts( -5, 15);
		assertEquals(10, objTwoInts2.sumOfTwo());
	}

	@Test
	public void testDifference() {
		// using obj2
		assertEquals(10 , obj2.difference());

	}

	@Test
	public void testLarger() {
		fail("Not yet implemented");
	}

}
