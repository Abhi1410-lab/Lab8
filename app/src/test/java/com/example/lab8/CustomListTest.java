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
        City city = new City("Edmo","AB");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(new City("Edmo","AB"));
        assertEquals(list.getCount(),1);
    }
    @Test
    public void hasCityTest(){

        CustomList list2 = new CustomList(null, new ArrayList<City>());
        City city = new City("Edmo","AB");
        list2.addCity(city);
        assertEquals(true, list2.hasCity(city));
    }

    @Test
    public void countCitiesTest(){
        CustomList list3 = new CustomList(null, new ArrayList<City>());
        City city = new City("Edmo","AB");
        list3.addCity(city);
        int listSize = list3.getCount();
        assertEquals(listSize, list3.countCities());
    }

}
