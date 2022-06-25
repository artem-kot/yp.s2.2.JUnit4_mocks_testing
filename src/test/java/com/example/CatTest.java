package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends BaseTestData {
    private Cat cat;

    @Mock
    private Feline feline;

    @Before
    public void setup() {
        cat = new Cat(feline);
    }

    @Test
    public void catGetSoundTest() {
        assertEquals(expectedCatSound, cat.getSound());
    }

    @Test
    public void catGetFoodTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(carnivoresFoodList);
        assertEquals(carnivoresFoodList, cat.getFood());
    }
}