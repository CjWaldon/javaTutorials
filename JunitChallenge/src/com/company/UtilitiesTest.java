package com.company;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UtilitiesTest {
    Utilities util;
    char[] sourceArray;

    @org.junit.Before
    public void setup(){
        util = new Utilities();
        sourceArray = "hello".toCharArray();
    }

    @org.junit.Test
    public void everyNthChar() {
        assertArrayEquals(new char[]{'e','l'}, util.everyNthChar(sourceArray, 2));
        assertEquals(sourceArray, util.everyNthChar(sourceArray, 12));
    }

    @org.junit.Test
    public void removePairs() {
       assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
       assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
       assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
       assertEquals("A", util.removePairs("A"));
       assertEquals("", util.removePairs(""));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converterDivideBy0(){
        util.converter(10, 0);
        fail("Should throw ArithmeticException");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertEquals("even", util.nullIfOddLength("even"));
        assertNull("string length was odd so null is returned", util.nullIfOddLength("odd"));
    }
}