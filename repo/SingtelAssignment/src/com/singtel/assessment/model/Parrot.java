/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.CommonConstants;
import com.signtel.assessment.util.enums.SoundEnum;
import com.singtel.assessment.helper.SingHelper;
import com.singtel.assessment.interfaces.Fly;

/**
 * @author Rafi
 *
 */
public class Parrot extends Bird implements Fly{
	public Parrot() {
        super(new SingHelper(SoundEnum.DEFAULT));
    }

    public Parrot(SingHelper singHelper) {
        super(singHelper);
    }

    public void canFly() {
        System.out.println(CommonConstants.I_CAN_FLY);
    }
}
