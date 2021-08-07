package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;
import com.signtel.assessment.util.enums.SoundEnum;
import com.singtel.assessment.helper.SingHelper;
import com.singtel.assessment.interfaces.Speak;
import com.singtel.assessment.interfaces.Walk;

/**
 * @author Rafi
 *
 */
public class Cat extends Animal implements Walk,Speak {
	
	private SingHelper singHelper;

	public Cat(){
		this.singHelper = new SingHelper(SoundEnum.CAT);
	}
	

	public Cat(SingHelper singHelper){
		this.singHelper = singHelper;
	}


	@Override
	public void canSpeak() {
		
	}

	@Override
	public void makeSound() {
		singHelper.makeSound();
		
	}

	@Override
	public void canWalk() {
		System.out.println(CommonConstants.I_CAN_WALK);
		
	}

}
