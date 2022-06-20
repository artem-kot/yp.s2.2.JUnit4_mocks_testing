package com.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSound() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(new Feline());
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}