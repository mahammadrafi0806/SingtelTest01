/**
 * 
 */
package com.singtel.assessment.helper;

import com.signtel.assessment.util.enums.SoundEnum;

/**
 * @author Rafi
 *
 */
public class SingHelper {
	
	private SoundEnum soundEnum;

    public SingHelper(SoundEnum soundEnum) {
        this.soundEnum = soundEnum;
    }

    public void makeSound() {
        System.out.println(soundEnum.getSound());
    }
}
