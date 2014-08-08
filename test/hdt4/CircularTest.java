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
public class CircularTest {
    
    public CircularTest() {
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
     * Test of addFirst method, of class Circular.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object value = null;
        Circular instance = new Circular();
        instance.addFirst(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class Circular.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        Circular instance = new Circular();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class Circular.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        Circular instance = new Circular();
        Object expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class Circular.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        Circular instance = new Circular();
        Object expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Circular.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Circular instance = new Circular();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
