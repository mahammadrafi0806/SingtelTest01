/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;
import com.singtel.assessment.interfaces.Fly;
import com.singtel.assessment.interfaces.Speak;
import com.singtel.assessment.interfaces.Walk;

/**
 * @author Rafi
 *
 */
public class Butterfly extends Insect implements Fly,Walk,Speak {
	String behavior;
	public Butterfly(String behavior){
		this.behavior=behavior;
	}
	

	@Override
	public void canSpeak() {
		
	}

	@Override
	public void makeSound() {
		if(behavior.equals("caterpillar")){
			System.out.println(CommonConstants.I_CAN_SING);
		} 
		
	}
	
	@Override
	public void canWalk() {
		if(behavior.equals("caterpillar")){
			System.out.println(CommonConstants.I_CAN_WALK);
		} 
		
	}
	
	@Override
	public void canFly() {
		if(behavior.equals("caterpillar")){
			System.out.println(CommonConstants.I_CANT_FLY);
		} else {
			System.out.println(CommonConstants.I_CAN_FLY);
		}
		
	}

}
