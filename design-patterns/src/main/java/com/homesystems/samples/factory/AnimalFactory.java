package com.homesystems.samples.factory;

import com.homesystems.samples.animals.Animal;
import com.homesystems.samples.animals.AnimalType;
import com.homesystems.samples.animals.Lion;
import com.homesystems.samples.animals.Monkey;
import com.homesystems.samples.animals.Wolf;

/**
 * Class to provide the factory method to create animals.
 */
public class AnimalFactory {

    public static Animal getAnimal(AnimalType animalType) throws Exception {
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
}
