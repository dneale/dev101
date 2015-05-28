package com.twu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmn on 28/05/15.
 */
public class FizzBuzzTest {

    FizzBuzz fb;

    @Test
    public void testIsFizz() throws Exception {
        assertTrue(fb.isFizz(3));
        assertFalse(fb.isFizz(1));
    }

    @Test
    public void testIsBuzz() throws Exception {

        assertTrue(fb.isBuzz(5));
        assertFalse(fb.isBuzz(4));
    }

    @Test
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
                "FizzBuzz\n",
                fb.fizzBuzzGenerate(15));
    }

    @Before
    public void setUp() throws Exception {
        this.fb = new FizzBuzz();
    }
}