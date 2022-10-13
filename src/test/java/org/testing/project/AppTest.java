package org.testing.project;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(3, 4);
        assertTrue(result == 7);
        assertFalse(result==8);
    }
    @Test
    public void testSub() {
        App app = new App();
        int result = app.sub(3, 4);
        assertTrue(result == -1);
    }
    @Test
    public void testIsFiveDigit() {
        App app = new App();
        assertTrue(app.isFiveDigit(12345));
        assertTrue(app.isFiveDigit(99999));
        assertFalse(app.isFiveDigit(100000));
    }
    @Test
    public void testGetGrade() {
        App app = new App();
        assertTrue(app.getGrade(80).equals("A"));
        assertTrue(app.getGrade(60).equals("B"));
        assertTrue(app.getGrade(40).equals("C"));
        assertTrue(app.getGrade(20).equals("D"));
        assertTrue(app.getGrade(120).equals("Invalid marks"));
    }
    @Test
    public void testGetAreaOfCircle() {
        App app = new App();
        assertTrue(app.getAreaOfCircle(2) == 12.566370614359172);
    }
    @Test
    public void testGetAreaOfRectangle() {
        App app = new App();
        assertTrue(app.getAreaOfRectangle(2, 3) == 6);
    }
}
