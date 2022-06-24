package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest extends BaseTestData{

    @Mock
    Feline feline;

    @Test
    public void lionSexTest() {
        Exception e = assertThrows("", Exception.class, () -> new Lion(nonBinarySex, feline));
        assertEquals(expectedUnknownSexException, e.getMessage());
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(maleSex, feline);
        Mockito.when(feline.getKittens()).thenReturn(-7);
        assertEquals(-7, lion.getKittens());
    }


    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(femaleSex, feline);
        Mockito.when(feline.getFood(animalTypeCarnivore)).thenReturn(carnivoresFoodList);
        assertEquals(carnivoresFoodList, lion.getFood());
    }
}