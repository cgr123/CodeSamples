package com.homesystems.samples.abstractFactory;

import com.homesystems.samples.birds.Bird;
import com.homesystems.samples.birds.BirdType;

/**
 * Demo class to show the abstract factory pattern in action.
 */
public class BirdPark {
    public static void main(String[] args) {
        try {
            AbstractAnimalKingdomFactory birdFactory = AnimalKingdomFactoryProducer.getAnimalKingdomFactory(AnimalKingdomType.AVES);
            System.out.println("Visiting the woodpeckers");
            birdEncounter(birdFactory, BirdType.WOODPECKER);
            System.out.println("Visiting the Parrots");
            birdEncounter(birdFactory, BirdType.PARROT);
            System.out.println("Visiting the Flamingos");
            birdEncounter(birdFactory, BirdType.FLAMINGO);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void birdEncounter(final AbstractAnimalKingdomFactory birdFactory, BirdType birdType) throws Exception {
        Bird bird = birdFactory.getBird(birdType);
        System.out.println(bird.makeSpeech());
    }
}
