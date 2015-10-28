package com.homesystems.samples.abstractFactory;

import com.homesystems.samples.birds.Bird;
import com.homesystems.samples.birds.BirdType;
import com.homesystems.samples.birds.Flamingo;
import com.homesystems.samples.birds.Parrot;
import com.homesystems.samples.birds.Woodpecker;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Class to test the BirdFactory class
 */
public class BirdFactoryTest {
    private AbstractAnimalKingdomFactory birdFactory;

    @Before
    public void setup() {
        try {
            birdFactory = AnimalKingdomFactoryProducer.getAnimalKingdomFactory(AnimalKingdomType.AVES);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetBird() throws Exception {

        Bird bird = birdFactory.getBird(BirdType.WOODPECKER);
        assertNotNull(bird);
        assertTrue(bird instanceof Woodpecker);
        assertBird(bird, "speech=Knock, knock,name=Woody");
        bird = birdFactory.getBird(BirdType.PARROT);
        assertNotNull(bird);
        assertTrue(bird instanceof Parrot);
        assertBird(bird, "speech=Squawk,name=Polly");
        bird = birdFactory.getBird(BirdType.FLAMINGO);
        assertNotNull(bird);
        assertTrue(bird instanceof Flamingo);
        assertBird(bird, "speech=Swish, swish,name=Pinky");
    }

    @Test(expected = Exception.class)
    public void testExceptionThrown() throws Exception {
        birdFactory.getBird(null);
        fail();
    }

    private void assertBird(final Bird bird, final String expectedToString) {
        String animalToString = bird.toString();
        animalToString = animalToString.substring(animalToString.indexOf("[") + 1);
        animalToString = animalToString.substring(0, animalToString.indexOf("]"));
        assertEquals(expectedToString, animalToString);
    }
}
