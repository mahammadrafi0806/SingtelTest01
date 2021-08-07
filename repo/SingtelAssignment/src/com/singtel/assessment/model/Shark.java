/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;

/**
 * @author Rafui
 *
 */
public class Shark extends Fish {
	
	@Override
	public void bodySize() {
		System.out.println(CommonConstants.BODY_SIZE_BIG);
	}

	@Override
	public void bodyColor() {
		System.out.println(CommonConstants.BODY_COLOR_GREY);
	}
	
	public void canEat(){
		System.out.println(CommonConstants.I_EAT_FISH);
	}
}
