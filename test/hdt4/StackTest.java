/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hdt4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Casa
 */
public class StackTest {
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        Stack instance = new StackVector();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stack instance = new StackVector();
        Object expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Stack instance = new StackVector();
        Object expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class Stack.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        Stack instance = new StackVector();
        boolean expResult = false;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Stack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Stack instance = new StackVector();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
