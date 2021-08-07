/**
 * 
 */
package com.singtel.assessment.test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.signtel.assessment.util.enums.LanguageEnum;
import com.signtel.assessment.util.enums.SoundEnum;
import com.singtel.assessment.helper.SingHelper;
import com.singtel.assessment.model.Animal;
import com.singtel.assessment.model.AnimalsCount;
import com.singtel.assessment.model.Bird;
import com.singtel.assessment.model.Butterfly;
import com.singtel.assessment.model.Cat;
import com.singtel.assessment.model.Chicken;
import com.singtel.assessment.model.Clownfish;
import com.singtel.assessment.model.Dog;
import com.singtel.assessment.model.Dolphin;
import com.singtel.assessment.model.Duck;
import com.singtel.assessment.model.Fish;
import com.singtel.assessment.model.Frog;
import com.singtel.assessment.model.Parrot;
import com.singtel.assessment.model.Rooster;
import com.singtel.assessment.model.Shark;

/**
 * @author Rafi
 *
 */
public class ResultTest {
	
	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	private final PrintStream stream = System.out;

	public ResultTest(){
		
	}
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
		System.setOut(new PrintStream(outStream));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
		System.setOut(stream);
	}

	@Test
    public void walk() {

        new Bird().canWalk();
        assertThat(outStream.toString(), containsString("I can walk"));
        new Chicken().canWalk();
        assertThat(outStream.toString(), containsString("I can walk"));
        new Duck().canWalk();
        assertThat(outStream.toString(), containsString("I can walk"));
        new Rooster().canWalk();
        assertThat(outStream.toString(), containsString("I can walk"));
        new Butterfly("caterpillar").canWalk();
        assertThat(outStream.toString(), containsString("I can walk"));
    }

    @Test
    public void fly() {
        new Duck().canFly();
        assertThat(outStream.toString(), containsString("I can fly"));
        new Parrot().canFly();
        assertThat(outStream.toString(), containsString("I can fly"));
        new Butterfly("butterfly").canFly();
        assertThat(outStream.toString(), containsString("I can fly"));

        new Butterfly("caterpillar").canFly();
        assertThat(outStream.toString(), containsString("I cant Fly"));
    }

    @Test
    public void sing() {
        new Bird().makeSound();
        assertThat(outStream.toString(), containsString("making sound"));
        new Duck().makeSound();
        assertThat(outStream.toString(), containsString("Quack, quack"));
        new Chicken().makeSound();
        assertThat(outStream.toString(), containsString("KO ko ko ko"));

        new Chicken(new SingHelper(SoundEnum.CHICKEN)).makeSound();
        assertThat(outStream.toString(), containsString("KO ko ko ko"));
        new Rooster().makeSound();
        assertThat(outStream.toString(), containsString("Cock-a-doodle-doo"));
        new Rooster(LanguageEnum.DANISH).makeSound();
        assertThat(outStream.toString(), containsString("kykyliky"));

        new Dog(new SingHelper(SoundEnum.DOG)).makeSound();
        assertThat(outStream.toString(), containsString("Woof, woof"));
        new Cat(new SingHelper(SoundEnum.CAT)).makeSound();
        assertThat(outStream.toString(), containsString("Me ow"));

        new Parrot().makeSound();
        assertThat(outStream.toString(), containsString("making sound"));
        new Parrot(new SingHelper(SoundEnum.DOG)).makeSound();
        assertThat(outStream.toString(), containsString("Woof, woof"));
        new Parrot(new SingHelper(SoundEnum.CAT)).makeSound();
        assertThat(outStream.toString(), containsString("Me ow"));
        new Parrot(new SingHelper(SoundEnum.ROOSTER)).makeSound();
        assertThat(outStream.toString(), containsString("Cock-a-doodle-doo"));

        new Butterfly("caterpillar").makeSound();
        assertThat(outStream.toString(), containsString("I can Sing"));
        new Butterfly("butterfly").makeSound();
        assertThat(outStream.toString(), containsString(""));


    }

    @Test
    public void swim() {
        new Duck().canSwim();
        assertThat(outStream.toString(), containsString("I can swim"));
        new Fish().canSwim();
        assertThat(outStream.toString(), containsString("I can swim"));
        new Dolphin().canSwim();
        assertThat(outStream.toString(), containsString("I can swim"));
    }


    @Test
    public void getBodyColor() {
    	new Fish().bodyColor();
    	assertThat(outStream.toString(), containsString(""));
    	new Shark().bodyColor();
    	assertThat(outStream.toString(), containsString("Grey"));
        new Clownfish().bodyColor();
        assertThat(outStream.toString(), containsString("Orange"));

    }

    @Test
    public void getBodySize() {
    	new Fish().bodySize();
    	assertThat(outStream.toString(), containsString(""));
    	new Shark().bodySize();
    	assertThat(outStream.toString(), containsString("Large"));
    	new Clownfish().bodySize();
        assertThat(outStream.toString(), containsString("Small"));
    }

    @Test
    public void fishTest() {
        new Shark().canEat();
        assertThat(outStream.toString(), containsString("I eat Fish"));
        new Clownfish().makeJoke();
        assertThat(outStream.toString(), containsString("I Make Jokes"));
    }

    @Test
    public void CountingAnimals() {

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly("butterfly"),
                new Butterfly("caterpillar"),
                new Cat()
        };
        AnimalsCount animalCount = new AnimalsCount(animals);

        assertEquals(animalCount.getFlyingAnimalCount(), 7);
        assertEquals(animalCount.getWalkingAnimalCount(), 10);
        assertEquals(animalCount.getSpeakingAnimalCount(), 10);
        assertEquals(animalCount.getSwimingAnimalCount(), 6);


    }
	
	
}
