/**
 * 
 */
package com.singtel.assessment.model;

import com.signtel.assessment.util.enums.LanguageEnum;
import com.signtel.assessment.util.enums.SoundEnum;
import com.singtel.assessment.helper.LanguageHelper;
import com.singtel.assessment.helper.SingHelper;

/**
 * @author Rafi
 *
 */
public class Rooster extends Chicken {
	LanguageHelper languageHelper;
	SingHelper singHelper;
	LanguageEnum languageEnum;

	public Rooster() {
		this.singHelper = new SingHelper(SoundEnum.ROOSTER);
	}

	public Rooster(LanguageEnum languageEnum) {
		this.singHelper = new SingHelper(SoundEnum.ROOSTER);
		this.languageEnum = languageEnum;
	}

	@Override
	public void makeSound() {
		String tranlateSound = LanguageHelper.translate(SoundEnum.ROOSTER.getSound(), languageEnum);
		System.out.println(tranlateSound);
	}

}
