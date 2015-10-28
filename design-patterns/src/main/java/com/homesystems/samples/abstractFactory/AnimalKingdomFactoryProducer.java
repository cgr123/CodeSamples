package com.homesystems.samples.abstractFactory;

/**
 * Class to produce (create) the request instance of an AbstractAnimalKingdomFactory
 */
public class AnimalKingdomFactoryProducer {

    public static AbstractAnimalKingdomFactory getAnimalKingdomFactory(AnimalKingdomType animalKingdomType) throws Exception {
        if (animalKingdomType == AnimalKingdomType.AVES) {
            return new BirdFactory();
        }
        else if (animalKingdomType == AnimalKingdomType.MAMMALIA) {
            return new MammalFactory();
        }
        else {
            throw new Exception("Invalid/unsupported animal kingdom class supplied");
        }
    }
}
