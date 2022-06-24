package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetSeveralKittensTest extends BaseTestData {

    private final int expectedNumberOfKittens;
    private final int numberOfKittensInput;

    public FelineGetSeveralKittensTest(int expectedNumberOfKittens, int numberOfKittensInput) {
        this.expectedNumberOfKittens = expectedNumberOfKittens;
        this.numberOfKittensInput = numberOfKittensInput;
    }

    @Parameterized.Parameters
    public static Object[] getTestDataKittens() {
        return new Object[][] {
            {-7, -7},
            {0, 0},
            {42, 42}
        };
    }

    @Test
    public void getSeveralKittensTest() {
        Feline feline = new Feline();
        assertEquals(expectedNumberOfKittens, feline.getKittens(numberOfKittensInput));
    }
}
