package com.twu;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmn on 28/05/15.
 */
public class DiamondTest extends TestCase {

    @Test
    public void testGetName() throws Exception {
        Diamond d = new Diamond(3, "Bill");
        assertEquals("Bill", d.getName());

    }

    @Test
    public void testDrawSingle() throws Exception {
        Diamond d = new Diamond(1);
        assertEquals("*\n", d.draw());
    }

    @Test
    public void testDrawMultiple() throws Exception {
        Diamond d = new Diamond(3);
        assertEquals("  *\n"   +
                     " ***\n"  +
                     "*****\n" +
                     " ***\n"  +
                     "  *\n",
                     d.draw());
    }
    @Test
    public void testDrawMultipleWithName() throws Exception {
        Diamond d = new Diamond(3, "Bill");
        assertEquals("  *\n"   +
                     " ***\n"  +
                     "Bill\n"  +
                     " ***\n"  +
                     "  *\n",
                d.draw());
    }

}