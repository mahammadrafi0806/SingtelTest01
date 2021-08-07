package com.singtel.assessment.model;

import com.singtel.assessment.interfaces.Fly;
import com.singtel.assessment.interfaces.Speak;
import com.singtel.assessment.interfaces.Swim;
import com.singtel.assessment.interfaces.Walk;

public class AnimalsCount {
    Animal[] animals;
    int flyingAnimalCount = 0;
    int walkingAnimalCount = 0;
    int speakingAnimalCount = 0;
    int swimingAnimalCount = 0;


    public AnimalsCount(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Fly) {
                flyingAnimalCount += 1;
            }
            if (animals[i] instanceof Walk) {
                walkingAnimalCount += 1;
            }
            if (animals[i] instanceof Speak) {
                speakingAnimalCount += 1;
            }
            if (animals[i] instanceof Swim) {
                swimingAnimalCount += 1;
            }
        }
    }


	public int getFlyingAnimalCount() {
		return flyingAnimalCount;
	}


	public void setFlyingAnimalCount(int flyingAnimalCount) {
		this.flyingAnimalCount = flyingAnimalCount;
	}


	public int getWalkingAnimalCount() {
		return walkingAnimalCount;
	}


	public void setWalkingAnimalCount(int walkingAnimalCount) {
		this.walkingAnimalCount = walkingAnimalCount;
	}


	public int getSpeakingAnimalCount() {
		return speakingAnimalCount;
	}


	public void setSpeakingAnimalCount(int speakingAnimalCount) {
		this.speakingAnimalCount = speakingAnimalCount;
	}


	public int getSwimingAnimalCount() {
		return swimingAnimalCount;
	}


	public void setSwimingAnimalCount(int swimingAnimalCount) {
		this.swimingAnimalCount = swimingAnimalCount;
	}
}