/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcd;

/**
 *
 * @author yperezmartinez
 */
public class CorreccionMensaje {
    
     public static String visualizar(Calculo cal) {
        String mens = "";
        if (cal.getNumero1() < 0 && cal.getNumero2() < 0) {
            mens = cal.getMensajeResultado();
          System.out.println(mens);
        }
     if (cal.getNumero1() > 0 && cal.getNumero2() > 0) {
         mens = cal.getMensajeResultado();
          System.out.println("bien hecho");
        } else {
          mens = cal.getMensajeResultado();
       System.out.println("mal hecho");
        }
    return mens;
    }
    
}
