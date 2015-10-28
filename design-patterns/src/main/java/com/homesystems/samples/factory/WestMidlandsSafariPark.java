package com.homesystems.samples.factory;

import com.homesystems.samples.animals.Animal;
import com.homesystems.samples.animals.AnimalType;

/**
 * Class to represent a safari park.
 */
public class WestMidlandsSafariPark {

    public static void main(String[] args) {
        try {
            System.out.println("At West Midlands Safari Park");
            System.out.println("Entering lion enclosure");
            animalEncounter(AnimalType.LION);
            System.out.println("Entering monkey woods");
            animalEncounter(AnimalType.MONKEY);
            System.out.println("Entering wolf enclosure");
            animalEncounter(AnimalType.WOLF);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void animalEncounter(AnimalType type) throws Exception {
        Animal nearByAnimal = AnimalFactory.getAnimal(type);
        System.out.println(nearByAnimal.makeSpeech());
    }
}
