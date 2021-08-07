/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;
import com.signtel.assessment.util.enums.SoundEnum;
import com.singtel.assessment.helper.SingHelper;
import com.singtel.assessment.interfaces.Speak;
import com.singtel.assessment.interfaces.Swim;
import com.singtel.assessment.interfaces.Walk;

/**
 * @author Rafi
 *
 */
public class Frog extends Animal implements Swim,Walk,Speak {

	private SingHelper singHelper;

	public Frog(){
		this.singHelper = new SingHelper(SoundEnum.DEFAULT);
	}
	

	public Frog(SingHelper singHelper){
		this.singHelper = singHelper;
	}
	
	@Override
	public void canSpeak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSound() {
		singHelper.makeSound();
		
	}

	@Override
	public void canWalk() {
		System.out.println(CommonConstants.I_CAN_WALK);
		
	}


	@Override
	public void canSwim() {
		System.out.println(CommonConstants.I_CAN_SWIM);
		
	}

	
}