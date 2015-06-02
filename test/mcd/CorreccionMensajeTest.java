/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yperezmartinez
 */
public class CorreccionMensajeTest {
    
    public CorreccionMensajeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of visualizar method, of class CorreccionMensaje.
     */
    @Test
    public void testVisualizar() {
        System.out.println("visualizar");
        Calculo cal = null;
        String expResult = "";
        String result = CorreccionMensaje.visualizar(cal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
}
