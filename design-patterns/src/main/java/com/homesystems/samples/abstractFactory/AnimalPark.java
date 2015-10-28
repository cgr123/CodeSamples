package com.homesystems.samples.abstractFactory;

import com.homesystems.samples.animals.Animal;
import com.homesystems.samples.animals.AnimalType;

/**
 * Demo class to show the abstract factory pattern in action.
 */
public class AnimalPark {

    public static void main(String[] args) {
        try {
            AbstractAnimalKingdomFactory mammalFactory = AnimalKingdomFactoryProducer.getAnimalKingdomFactory(AnimalKingdomType.MAMMALIA);
            System.out.println("Visiting the wolves");
            animalEncounter(mammalFactory, AnimalType.WOLF);
            System.out.println("Visiting the lions");
            animalEncounter(mammalFactory, AnimalType.LION);
            System.out.println("Visiting the monkeys");
            animalEncounter(mammalFactory, AnimalType.MONKEY);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void animalEncounter(final AbstractAnimalKingdomFactory mammalFactory, AnimalType animalType) throws Exception {
        Animal wolf = mammalFactory.getAnimal(animalType);
        System.out.println(wolf.makeSpeech());
    }
}
