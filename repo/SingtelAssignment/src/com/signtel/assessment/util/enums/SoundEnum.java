/**
 * 
 */
package com.signtel.assessment.util.enums;

/**
 * @author Rafi
 *
 */
public enum SoundEnum {
	CHICKEN("KO ko ko ko"), DUCK("Quack, quack"),DOG("Woof, woof"), ROOSTER("Cock-a-doodle-doo"), CAT("Me ow"), DEFAULT("making sound"), NO_SOUND(""),CATERPILLAR("caterpillar");
	private String sound;

	SoundEnum(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

}
