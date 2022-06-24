package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest extends BaseTestData {
    private final String animalKind;
    private final ArrayList expectedFoodList;

    public AnimalGetFoodTest(String animalKind, ArrayList expectedFoodList){
        this.animalKind = animalKind;
        this.expectedFoodList = expectedFoodList;
    }
    @Parameterized.Parameters
    public static Object[] getAnimalKind() {
        return new Object[][] {
                {animalTypeHerbivore, herbivoresFoodList},
                {animalTypeCarnivore, carnivoresFoodList}
        };
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        assertEquals(animal.getFood(animalKind), expectedFoodList);
    }
}