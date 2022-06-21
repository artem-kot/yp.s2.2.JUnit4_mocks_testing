package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    private String sex;
    private boolean expectedHasManeValue;
    public LionTest(String sex, boolean expectedHasManeValue) {
        this.sex = sex;
        this.expectedHasManeValue = expectedHasManeValue;
    }

    @Parameterized.Parameters
    public static Object[] getSexValue() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Небинарный лев", false}
        };
    }

//    REFACTOR THIS METHOD USING A PROPER EXCEPTION HANDLING AS IN AnimalTest CLASS
//    ALSO MOVE OUT PARAMETERIZED TEST AS A SEPARATE CLASS
//    CHANGE NAMES FOR PARAMETERIZED CLASSES TO RESEMBLE THE ACTUAL METHODS THEY ARE TESTING
    @Test
    public void lionSexTest() throws Exception {
        try {
            Lion lion = new Lion(sex, new Feline());
            assertEquals(expectedHasManeValue, lion.hasMane);
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void getKittens() {
    }

    @Test
    public void doesHaveMane() {
    }

    @Test
    public void getFood() {
    }
}