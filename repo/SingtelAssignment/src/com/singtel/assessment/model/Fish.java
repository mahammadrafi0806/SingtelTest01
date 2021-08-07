/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;
import com.singtel.assessment.interfaces.Body;
import com.singtel.assessment.interfaces.Swim;

/**
 * @author Rafi
 *
 */
public class Fish extends Animal implements Swim,Body {

	@Override
	public void bodySize() {
		
	}

	@Override
	public void bodyColor() {
		
	}

	@Override
	public void canSwim() {
		System.out.println(CommonConstants.I_CAN_SWIM);
		
	}


}
