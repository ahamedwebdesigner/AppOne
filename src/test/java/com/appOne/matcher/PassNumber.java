package com.appOne.matcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public  class PassNumber extends TypeSafeMatcher<Integer>{

	//Shows the value when exception occurs.
    @Override
    public void describeTo(Description desc) {
           desc.appendText("expecterd 35");

    }

	@Override
	protected boolean matchesSafely(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
