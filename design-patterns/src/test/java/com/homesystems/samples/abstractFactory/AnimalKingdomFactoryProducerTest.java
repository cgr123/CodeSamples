package com.homesystems.samples.abstractFactory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Class to test the AnimalKingdomFactoryProducer class.
 */
public class AnimalKingdomFactoryProducerTest {
    @Test
    public void testGetBirdFactory() throws Exception {

        AbstractAnimalKingdomFactory animalKingdomFactory = AnimalKingdomFactoryProducer.getAnimalKingdomFactory(AnimalKingdomType.AVES);
        assertNotNull(animalKingdomFactory);
        assertTrue(animalKingdomFactory instanceof BirdFactory);
    }

    @Test
    public void testGetMammalFactory() throws Exception {
        AbstractAnimalKingdomFactory animalKingdomFactory = AnimalKingdomFactoryProducer.getAnimalKingdomFactory(AnimalKingdomType.MAMMALIA);
        assertNotNull(animalKingdomFactory);
        assertTrue(animalKingdomFactory instanceof MammalFactory);
    }

    @Test(expected = Exception.class)
    public void testInvalidInput() throws Exception {
        AnimalKingdomFactoryProducer.getAnimalKingdomFactory(null);
        fail();
    }
}
