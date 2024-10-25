package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void setup() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void testHasCity() {
        City city = new City("Edmonton", "Alberta");
        assertFalse(list.hasCity(city)); // Initially, the city is not in the list
        list.addCity(city);
        assertTrue(list.hasCity(city));  // After adding, the city should be in the list
    }

}
