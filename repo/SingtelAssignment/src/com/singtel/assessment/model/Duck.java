package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;
import com.signtel.assessment.util.enums.SoundEnum;
import com.singtel.assessment.helper.SingHelper;
import com.singtel.assessment.interfaces.Fly;
import com.singtel.assessment.interfaces.Swim;
import com.singtel.assessment.interfaces.Walk;

public class Duck extends Bird implements Swim, Fly,Walk{
	public Duck(){
		super(new SingHelper(SoundEnum.DUCK));
	}
	

	public Duck(SingHelper singHelper){
		super(singHelper);
	}
	
	
	
	@Override
	public void canSwim() {
		System.out.println(CommonConstants.I_CAN_SWIM);
		
	}

}
