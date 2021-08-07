/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;
import com.signtel.assessment.util.enums.SoundEnum;
import com.singtel.assessment.helper.SingHelper;
import com.singtel.assessment.interfaces.Fly;
import com.singtel.assessment.interfaces.Speak;
import com.singtel.assessment.interfaces.Walk;

/**
 * @author Rafi
 *
 */
public class Bird extends Animal implements Fly, Walk, Speak {
	
	private SingHelper singHelper;

	public Bird(){
		this.singHelper = new SingHelper(SoundEnum.DEFAULT);
	}
	

	public Bird(SingHelper singHelper){
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
	public void canFly() {
		System.out.println(CommonConstants.I_CAN_FLY);
		
	}

}
