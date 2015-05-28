package com.twu;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by dmn on 28/05/15.
 */
public class PrimeFactorsTest {

    @Test
    public void testGenerateEmpty() throws Exception {
        PrimeFactors pf = new PrimeFactors();
        ArrayList<Integer> a = new ArrayList<Integer>();

        assertEquals(a, pf.generate(1));

    }
    @Test
    public void testGenerate() throws Exception {
        PrimeFactors pf = new PrimeFactors();
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(3);
        a.add(5);
        assertEquals(a, pf.generate(30));

    }
}