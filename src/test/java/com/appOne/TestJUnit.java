package com.appOne;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJUnit {
	 public  static Basket mybosket ;
	 
	@BeforeClass
	public  static void onceExecutedBeforeAll() {
			mybosket= new Basket(new String[]{"Apple", "Banana", "oranges"});
		System.out.println(" @BeforeClass called ");
	}

	@Before
	public void executedBeforeEach() {
	   System.out.println("@Before: executedBeforeEach");
	}
	
	@Test
	 public void testSetup() {
	      String str= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",str);
	   }
	
	  @Test
	    public void testGetTheStringArray() {
		 
		  String[] expectedCartItems = {"Apple", "Banana", "oranges"};
	        assertArrayEquals(expectedCartItems, mybosket.getCart());
	    }
	  
	  
	  @Test
	    public void testConcatenate() {
		  Basket mybosket2 = new Basket( new String[]{"Apple", "Banana", "oranges"});
	  

		  System.out.println("mybosket  "+Arrays.toString(mybosket.getCart()));
		  System.out.println("mybosket2  "+Arrays.toString(mybosket2.getCart()));
		  assertEquals(mybosket,mybosket2);
		 // assertEquals(Arrays.toString(mybosket.getCart()), Arrays.toString(mybosket2.getCart()));
	    }
	  
	  @Test
	    public void testGetTheBoolean() {
		  Basket mybosket = new Basket( new String[]{"Apple", "Banana", "oranges"});
//		  assertTrue(mybosket.getCart().length == 3);
		  assertFalse(mybosket.getCart().length == 4);
	    }

	  
	  
	  @Test
	    public void testGetTheObject() {
		  Basket mybosket = new Basket( new String[]{"Apple", "Banana", "oranges"});
		  //assertNull(mybosket);
		  assertNotNull(mybosket);

	       
	    }
	  
	  @Test
	    public void testGetTheSameObject() {
		  Basket mybosket = new Basket( new String[]{"Apple", "Banana", "oranges"});
		  Basket mybosket2 = new Basket( new String[]{"Apple", "Banana", "oranges"});	 
		  Basket mybosket3 = mybosket;
		  assertSame(mybosket,mybosket3);
		  assertNotSame(mybosket,mybosket2);
		
	    }
	  
	  @Test
	  public void testWithMatchers() {
		  assertThat(345, is(345) );
		  assertThat(123, not( is(345) ) );

	  }

		@AfterClass
		public static void onceExecutedAfterAll() {
			System.out.println("@AfterClass: onceExecutedAfterAll");
		}
		
		
		@After
		public void executedAfterEach() {
			
			System.out.println("@After: executedAfterEach");
		}
		
}

