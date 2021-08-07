/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.enums.SoundEnum;
import com.singtel.assessment.helper.SingHelper;
import com.singtel.assessment.interfaces.NotFly;
import com.singtel.assessment.interfaces.Speak;
import com.singtel.assessment.interfaces.Walk;

/**
 * @author Rafi
 *
 */
public class Chicken extends Bird implements Walk, NotFly,Speak {


	public Chicken(){
		super(new SingHelper(SoundEnum.CHICKEN));
	}
	

	public Chicken(SingHelper singHelper){
		super(singHelper);
	}
}
