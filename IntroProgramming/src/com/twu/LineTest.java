package com.twu;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dmn on 28/05/15.
 */
public class LineTest extends TestCase {

    @Test
    public void testDraw() throws Exception {

        Line line;
        /* Test single length line */
        line = new Line(1, false);
        assertEquals(line.draw(), "*\n");

        /* Test horizontal line */
        line = new Line(3, false);
        assertEquals(line.draw(), "***\n");

        /* Test vertical line */
        line = new Line(3, true);
        assertEquals(line.draw(), "*\n*\n*\n");
    }

}