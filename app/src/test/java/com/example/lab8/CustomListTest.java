package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;


    @Test
    public void addCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.addCity(new City("Edmo","AB"));
        assertEquals(list.getCount(),listSize+1);
    }
    @Test
    public void deleteCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.deleteCity(new City("Edmo","AB"));
        assertEquals(list.getCount(),listSize-1);
    }
}
