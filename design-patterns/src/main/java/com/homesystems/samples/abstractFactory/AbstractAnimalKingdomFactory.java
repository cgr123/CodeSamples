package com.homesystems.samples.abstractFactory;

import com.homesystems.samples.animals.Animal;
import com.homesystems.samples.animals.AnimalType;
import com.homesystems.samples.birds.Bird;
import com.homesystems.samples.birds.BirdType;

/**
 * Class to act as the abstract class for the animal kingdom factory.
 */
public abstract class AbstractAnimalKingdomFactory {
    abstract Animal getAnimal(AnimalType animalType) throws Exception;

    abstract Bird getBird(BirdType birdType) throws Exception;
}
