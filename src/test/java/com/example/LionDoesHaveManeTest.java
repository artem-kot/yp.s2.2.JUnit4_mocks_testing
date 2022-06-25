package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest extends BaseTestData{

    private Feline feline = Mockito.mock(Feline.class);
    private String sex;
    private boolean expectedHasManeValue;
    public LionDoesHaveManeTest(String sex, boolean expectedHasManeValue) {
        this.sex = sex;
        this.expectedHasManeValue = expectedHasManeValue;
    }

    @Parameterized.Parameters
    public static Object[] getSexValue() {
        return new Object[][] {
                {maleSex, true},
                {femaleSex, false},
        };
    }

    @Test
    public void lionDoesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasManeValue, lion.doesHaveMane());
    }
}