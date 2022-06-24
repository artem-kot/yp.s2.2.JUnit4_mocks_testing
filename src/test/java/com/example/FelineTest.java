package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineTest extends BaseTestData {

    Feline feline = new Feline();

    @Test
    public void felineGetFoodTest() throws Exception {
        assertEquals(carnivoresFoodList, feline.getFood(animalTypeCarnivore));
        assertNotEquals(carnivoresFoodList, feline.getFood(animalTypeHerbivore));
    }

    @Test
    public void felineGetFamilyTest() {
        assertEquals(expectedFelineFamily, feline.getFamily());
    }

    @Test
    public void felineEatMeatTest() throws Exception {
        assertEquals(carnivoresFoodList, feline.eatMeat());
    }

    @Test
    public void felineGetKittensTest() {
        assertEquals(1, feline.getKittens());
    }

}