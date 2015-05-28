package com.twu;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmn on 28/05/15.
 */
public class RightAngledTriangleTest extends TestCase {

    @Test
    public void testDrawSingle() throws Exception {
        RightAngledTriangle t = new RightAngledTriangle(1);
        assertEquals(t.draw(), "*\n");
    }
    @Test
    public void testDrawMultiple() throws Exception {
        RightAngledTriangle t = new RightAngledTriangle(3);
        assertEquals("*\n" +
                     "**\n" +
                     "***\n",
                     t.draw());


    }
}