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
public class SimplementeEncadenadaTest {
    
    public SimplementeEncadenadaTest() {
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
     * Test of size method, of class SimplementeEncadenada.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SimplementeEncadenada instance = new SimplementeEncadenada();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class SimplementeEncadenada.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SimplementeEncadenada instance = new SimplementeEncadenada();
        Object expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class SimplementeEncadenada.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        SimplementeEncadenada instance = new SimplementeEncadenada();
        Object expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class SimplementeEncadenada.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        SimplementeEncadenada instance = new SimplementeEncadenada();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
