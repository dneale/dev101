package com.twu;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmn on 28/05/15.
 */
public class IsoscelesTriangleTest extends TestCase {

    @Test
    public void testDrawSingle() throws Exception {

        IsoscelesTriangle t = new IsoscelesTriangle(1);
        assertEquals("*\n", t.draw());
    }

    public void testDrawMultiple() throws Exception {
        IsoscelesTriangle t = new IsoscelesTriangle(3);
        assertEquals("  *\n" +
                     " ***\n" +
                     "*****\n",
                     t.draw());
    }
}