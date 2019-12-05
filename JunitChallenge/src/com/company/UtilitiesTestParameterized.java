package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    Utilities util;
    String source;
    String output;

    public UtilitiesTestParameterized(String source, String output) {
        this.source = source;
        this.output = output;
    }

    @org.junit.Before
    public void setup(){
        util = new Utilities();
    }


    @org.junit.Test
    public void removePairs() {
        assertEquals(output, util.removePairs(source));

    }


    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {"ABCDEFF","ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566","123456"},
                {"ZYZQQB","ZYZQB"},
                {"A","A"}
        });
    }
}
