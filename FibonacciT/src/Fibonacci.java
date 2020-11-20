/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Fibonacci {

    static int calcular(int i) {
        if (i <= 1 ) {
            return i;
        }
        else{
             return calcular(i-1)+calcular(i-2);
             
        }

       
       
    }

}
