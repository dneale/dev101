package com.twu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmn on 28/05/15.
 */
public class FizzBuzzTest {

    FizzBuzz fb;



    public void testIsFizz() throws Exception {
        assertTrue(fb.isFizz(3));
        assertFalse(fb.isFizz(1));
    }


    public void testIsBuzz() throws Exception {

        assertTrue(fb.isBuzz(5));
        assertFalse(fb.isBuzz(4));
    }


    public void testFizzBuzzGenerate() throws Exception {
        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz",
                fb.fizzBuzzGenerate(15));
    }

    @Before
    public void setUp() throws Exception {
        this.fb = new FizzBuzz();
    }
}