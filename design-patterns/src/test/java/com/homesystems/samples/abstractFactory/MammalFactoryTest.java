package com.homesystems.samples.abstractFactory;

import com.homesystems.samples.animals.Animal;
import com.homesystems.samples.animals.Lion;
import com.homesystems.samples.animals.Monkey;
import com.homesystems.samples.animals.Wolf;
import org.junit.Before;
import org.junit.Test;

import static com.homesystems.samples.animals.AnimalType.LION;
import static com.homesystems.samples.animals.AnimalType.MONKEY;
import static com.homesystems.samples.animals.AnimalType.WOLF;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Class to test the mammal factory.
 */
public class MammalFactoryTest {

    private AbstractAnimalKingdomFactory mammalFactory;

    @Before
    public void setup() {
        try {
            mammalFactory = AnimalKingdomFactoryProducer.getAnimalKingdomFactory(AnimalKingdomType.MAMMALIA);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAnimal() throws Exception {

        Animal animal = mammalFactory.getAnimal(MONKEY);
        assertNotNull(animal);
        assertTrue(animal instanceof Monkey);
        assertAnimal(animal, "speech=Screech,name=Mikey");
        animal = mammalFactory.getAnimal(WOLF);
        assertNotNull(animal);
        assertTrue(animal instanceof Wolf);
        assertAnimal(animal, "speech=Howl,name=Fang");
        animal = mammalFactory.getAnimal(LION);
        assertNotNull(animal);
        assertTrue(animal instanceof Lion);
        assertAnimal(animal, "speech=Roar,name=Alex");
    }

    @Test(expected = Exception.class)
    public void testExceptionThrown() throws Exception {
        mammalFactory.getAnimal(null);
        fail();
    }

    private void assertAnimal(final Animal animal, final String expectedToString) {
        String animalToString = animal.toString();
        animalToString = animalToString.substring(animalToString.indexOf("[") + 1);
        animalToString = animalToString.substring(0, animalToString.indexOf("]"));
        assertEquals(expectedToString, animalToString);
    }
}
