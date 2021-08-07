/**
 * 
 */
package com.singtel.assessment.helper;

import com.signtel.assessment.util.enums.LanguageEnum;
import com.signtel.assessment.util.enums.SoundEnum;

/**
 * @author Rafi
 *
 */
public class LanguageHelper {
	public static String translate(String sound, LanguageEnum translateTo) {

        if (translateTo == null || !sound.equals(SoundEnum.ROOSTER.getSound())) {
            System.out.println("Unable to translate sound: " + sound);
            return sound;
        }

        switch (translateTo) {
            case DANISH:
                return LanguageEnum.DANISH.getLanguage();
            case DUTCH:
                return LanguageEnum.DUTCH.getLanguage();
            case FINNISH:
                return LanguageEnum.FINNISH.getLanguage();
            case FRENCH:
                return LanguageEnum.FRENCH.getLanguage();
            case GERMAN:
                return LanguageEnum.GERMAN.getLanguage();
            case GREEK:
                return LanguageEnum.GREEK.getLanguage();
            case HEBREW:
                return LanguageEnum.HEBREW.getLanguage();
            case HUNGARIAN:
                return LanguageEnum.HUNGARIAN.getLanguage();
            case ITALIAN:
                return LanguageEnum.ITALIAN.getLanguage();
            case JAPANESE:
                return LanguageEnum.JAPANESE.getLanguage();
            case PORTUGUESE:
                return LanguageEnum.PORTUGUESE.getLanguage();
            case RUSSIAN:
                return LanguageEnum.RUSSIAN.getLanguage();
            case SWEDISH:
                return LanguageEnum.SWEDISH.getLanguage();
            case TURKISH:
                return LanguageEnum.TURKISH.getLanguage();
            case URDU:
                return LanguageEnum.URDU.getLanguage();
            default:
                System.out.println("Unable to translate to: " + translateTo);
                return sound;
        }

    }
}
