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

public class Sample {

	public static void main(String[] args) {

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
	        System.out.println("Hi");

	}

}
