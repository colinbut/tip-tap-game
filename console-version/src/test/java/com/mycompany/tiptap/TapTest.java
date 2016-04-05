/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.tiptap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Tap}
 *
 * @author colin
 */
public class TapTest {

    private Tap tap = new Tap();

    @Test
    public void testTap() {
        tap.tap();
        Assert.assertEquals(1, tap.getCounter());
    }
}
