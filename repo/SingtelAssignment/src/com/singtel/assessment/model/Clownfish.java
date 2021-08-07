/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;

/**
 * @author Rafi
 *
 */
public class Clownfish extends Fish {
	
	@Override
	public void bodySize() {
		System.out.println(CommonConstants.BODY_SIZE_SMALL);
	}

	@Override
	public void bodyColor() {
		System.out.println(CommonConstants.BODY_COLOR_ORANGE);
	}
	
	public void makeJoke(){
		System.out.println(CommonConstants.I_MAKE_JOKE);
	}

}
