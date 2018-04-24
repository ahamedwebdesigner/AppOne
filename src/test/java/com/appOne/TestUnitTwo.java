package com.appOne;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Test;

public class TestUnitTwo {
	 @Test
	    public void testWithMatchers() {
	        assertThat("this string", is("this string"));
	        assertThat(123, is(123));
	        assertThat(1, instanceOf(Integer.class));
	        assertThat(1, isA(Integer.class));
	        
	        
	    }
	 
	 
	 @Test
	    public void listShouldInitiallyBeEmpty() {
		   List<Integer> list = Arrays.asList(5, 2, 4);
		   assertThat(list, Matchers.hasSize(3));
		   assertThat(list, Matchers.contains(5, 2, 4));
		   assertThat(list, Matchers.containsInAnyOrder(2, 4, 5));
            assertThat(list, Matchers.everyItem(Matchers.greaterThan(1)));
	 }
	 
	 @Test
	 public void arrayHasSizeOf4() {
	     Integer[] ints = new Integer[] { 7, 5, 12, 16 };
          assertThat(ints, Matchers.arrayWithSize(4));
	 }
	 
	 @Test
	 public void arrayContainsNumbersInGivenOrder() {
	     Integer[] ints = new Integer[] { 7, 5, 12, 16 };
	     assertThat(ints, Matchers.arrayContaining(7, 5, 12, 16));
	 }

	 
}
