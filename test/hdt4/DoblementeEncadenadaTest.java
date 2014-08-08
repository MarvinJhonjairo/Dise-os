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
public class DoblementeEncadenadaTest {
    
    public DoblementeEncadenadaTest() {
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
     * Test of addLast method, of class DoblementeEncadenada.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object value = null;
        DoblementeEncadenada instance = new DoblementeEncadenada();
        instance.addLast(value);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeFirst method, of class DoblementeEncadenada.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        DoblementeEncadenada instance = new DoblementeEncadenada();
        Object expResult = null;
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of size method, of class DoblementeEncadenada.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DoblementeEncadenada instance = new DoblementeEncadenada();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class DoblementeEncadenada.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        DoblementeEncadenada instance = new DoblementeEncadenada();
        Object expResult = null;
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
