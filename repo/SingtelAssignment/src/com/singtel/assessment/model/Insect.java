package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;
import com.singtel.assessment.interfaces.Fly;
import com.singtel.assessment.interfaces.Walk;
import com.singtel.assessment.model.Animal;

public class Insect extends Animal implements Fly, Walk {

	@Override
	public void canFly() {
		System.out.println(CommonConstants.I_CAN_FLY);
	}

	@Override
	public void canWalk() {
		System.out.println(CommonConstants.I_CAN_WALK);
	}

}
