/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcd;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author yperezmartinez
 */
@RunWith(Parameterized.class)
public class ParametrizadosTest {
    
    private int result;
  Calculo cal= new Calculo();
    
    @Before
   public void initialize() {
   
   
   }
   
   public ParametrizadosTest(Calculo cal, int result){
       this.cal=cal;
       this.result=result;
   }
   
   @Parameterized.Parameters
   public static Collection MCDnumeros() {
      return Arrays.asList(new Object[][] {
         { new Calculo (2,2,"calculo bien hecho"), 2},
         {  new Calculo (8,5,"calculo bien hecho"), 1},
         { new Calculo (4,2,"calculo bien hecho"), 2},
         {  new Calculo (2,4,"calculo bien hecho"), 2}
                      
      });
   }
   
     @Test
   public void testMCDnumbersChecker() {
      System.out.println("Parameterized  is : " +result);
      assertEquals(result, cal.obtenerMCD(cal.getNumero1(), cal.getNumero2()));
   }
       
   
    
}
