package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {
    @Test
    public void getFamily() {
        Animal animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",animal.getFamily());
    }

    @Test
    public void getFood() {
        Animal animal = new Animal();
        Exception e = assertThrows("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                Exception.class, () -> animal.getFood("Всеядное"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
    }
}