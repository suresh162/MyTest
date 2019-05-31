package com.example.mytest;

import org.junit.Test;

import Model.Airthemetic;

import static junit.framework.TestCase.assertEquals;

public class AirthmeticTest {
    @Test
    public void testAddition()
    {
        Airthemetic airthmetic = new Airthemetic();
        float expectedResult =10;
        float actualResult = airthmetic.add(4,6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSubtraction()
    {
        Airthemetic airthmetic = new Airthemetic();
        float expectedResult =10;
        float actualResult = airthmetic.subtract(4,6);
        assertEquals(expectedResult,actualResult);
    }
}
