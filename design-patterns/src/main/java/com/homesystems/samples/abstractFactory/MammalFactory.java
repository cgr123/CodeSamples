package com.homesystems.samples.abstractFactory;

import com.homesystems.samples.animals.Animal;
import com.homesystems.samples.animals.AnimalType;
import com.homesystems.samples.animals.Lion;
import com.homesystems.samples.animals.Monkey;
import com.homesystems.samples.animals.Wolf;
import com.homesystems.samples.birds.Bird;
import com.homesystems.samples.birds.BirdType;

/**
 * Class to create mammals.
 */
public class MammalFactory extends AbstractAnimalKingdomFactory {
    @Override
    Animal getAnimal(final AnimalType animalType) throws Exception {
        if (animalType == AnimalType.MONKEY) {
            return new Monkey();
        }
        else if (animalType == AnimalType.LION) {
            return new Lion();
        }
        else if (animalType == AnimalType.WOLF) {
            return new Wolf();
        }
        else {
            throw new Exception("Invalid animal type supplied");
        }
    }

    @Override
    Bird getBird(final BirdType birdType) {
        return null;
    }
}
