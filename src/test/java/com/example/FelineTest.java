package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineTest extends BaseTestData {

    Feline feline = new Feline();

    @Test
    public void getFoodTest() throws Exception {
        assertEquals(carnivoresFoodList, feline.getFood(animalTypeCarnivore));
        assertNotEquals(carnivoresFoodList, feline.getFood(animalTypeHerbivore));
    }

    @Test
    public void getFamilyTest() {
        assertEquals(expectedFelineFamily, feline.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals(carnivoresFoodList, feline.eatMeat());
    }

    @Test
    public void testGetFamilyTest() {
        assertEquals(expectedFelineFamily, feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getSeveralKittensTest() {
        assertEquals(0, feline.getKittens(0));
        assertEquals(-7, feline.getKittens(-7));
        assertEquals(42, feline.getKittens(42));
    }
}