package com.homesystems.samples.abstractFactory;

import com.homesystems.samples.animals.Animal;
import com.homesystems.samples.animals.AnimalType;
import com.homesystems.samples.birds.Bird;
import com.homesystems.samples.birds.BirdType;
import com.homesystems.samples.birds.Flamingo;
import com.homesystems.samples.birds.Parrot;
import com.homesystems.samples.birds.Woodpecker;

/**
 * Class to create the instances of Bird.
 */
public class BirdFactory extends AbstractAnimalKingdomFactory {
    @Override
    Animal getAnimal(final AnimalType animalType) throws Exception {
        return null;
    }

    @Override
    Bird getBird(final BirdType birdType) throws Exception {
        if (birdType == BirdType.PARROT) {
            return new Parrot();
        }
        else if (birdType == BirdType.FLAMINGO) {
            return new Flamingo();
        }
        else if (birdType == BirdType.WOODPECKER) {
            return new Woodpecker();
        }
        else {
            throw new Exception("Invalid animal type supplied");
        }
    }
}
