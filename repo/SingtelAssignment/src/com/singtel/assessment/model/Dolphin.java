/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;
import com.singtel.assessment.interfaces.Swim;

/**
 * @author Rafi
 *
 */
public class Dolphin extends Animal implements Swim {

	@Override
	public void canSwim() {
		System.out.println(CommonConstants.I_CAN_SWIM);
		
	}

}
