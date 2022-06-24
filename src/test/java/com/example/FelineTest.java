package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineTest extends BaseTestData {

    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        assertEquals(carnivoresFoodList, feline.getFood(animalTypeCarnivore));
        assertNotEquals(carnivoresFoodList, feline.getFood(animalTypeHerbivore));
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        assertEquals(expectedFelineFamily, feline.getFamily());
    }

    @Test
    public void eatMeat() {

    }

    @Test
    public void testGetFamily() {
    }

    @Test
    public void getKittens() {
    }

    @Test
    public void testGetKittens() {
    }
}