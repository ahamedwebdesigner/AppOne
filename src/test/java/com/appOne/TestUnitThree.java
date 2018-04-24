package com.appOne;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class TestUnitThree {
	 @Test
	    public void isStringEmpty() {
	        String stringToTest = "";
	        assertThat(stringToTest,  Matchers.isEmptyString());
	    }
	 
	 @Test
	 public void objectHasSummaryProperty () {

	     Todo todo = new Todo(1, "Learn Hamcrest", "Important");
	     assertThat(todo, Matchers.hasProperty("summary"));
	 }

	 
	 @Test
	 public void objectHasSameProperties () {

	     Todo todo1 = new Todo(1, "Learn Hamcrest", "Important");
	     Todo todo2 = new Todo(1, "Learn Hamcrest", "Important");

	     assertThat(todo1, Matchers.samePropertyValuesAs(todo2));
	 }

}
