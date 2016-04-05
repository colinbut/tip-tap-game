package com.mycompany.tiptap;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 *
 * @author colin 
 */
public class AppTest {

    private App app;

    @Before
    public void setup() {
        app = new App();
    }

    @Test
    public void testApp() {
        Assert.assertEquals(2, app.tap());
    }
}
