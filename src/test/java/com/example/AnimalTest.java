package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest extends BaseTestData {
    @Test
    public void getFamily() {
        Animal animal = new Animal();
        assertEquals(expectedFamiliesList,animal.getFamily());
    }

    @Test
    public void getFood() {
        Animal animal = new Animal();
        Exception e = assertThrows("", Exception.class, () -> animal.getFood(animalTypeOmnivoreIsUnknown));
        assertEquals(expectedUnknownAnimalException, e.getMessage());
    }
}