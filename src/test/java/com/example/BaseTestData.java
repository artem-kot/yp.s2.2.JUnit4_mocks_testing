package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTestData {
//    Test data is grouped by the class it's related to
//    Animal
    static String animalTypeHerbivore = "Травоядное";
    static String animalTypeCarnivore = "Хищник";
    static String animalTypeOmnivoreIsUnknown = "Всеядное";
    static ArrayList<String> herbivoresFoodList = new ArrayList<>(List.of("Трава", "Различные растения"));
    static ArrayList<String> carnivoresFoodList = new ArrayList<>(List.of("Животные", "Птицы", "Рыба"));
    static String expectedFamiliesList = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    static String expectedUnknownAnimalException = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

//    Cat
    static String expectedCatSound = "Мяу";

//    Feline
    static String expectedFelineFamily = "Кошачьи";

//    Lion
    static String maleSex = "Самец";
    static String femaleSex = "Самка";
    static String nonBinarySex = "Небинарный лев";
    static String expectedUnknownSexException = "Используйте допустимые значения пола животного - самец или самка";


}
