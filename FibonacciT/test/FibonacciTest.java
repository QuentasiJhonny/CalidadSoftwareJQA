/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jhonny
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }

    /**
     * Test of Fibonacci method, of class Fibonacci.
     */
    @Test
    public void testFibonacci_0() {
        
        assertEquals(0,Fibonacci.calcular(0));
    }
    
     @Test
    public void testFibonacci_1() {
        
        assertEquals(1,Fibonacci.calcular(1));
    }
      @Test
    public void testFibonacci_2() {
        
        assertEquals(1,Fibonacci.calcular(1));
    }
       @Test
    public void testFibonacci_5() {
        
        assertEquals(5,Fibonacci.calcular(5));
    }
    /**
     * Test of mostrarSerie method, of class Fibonacci.
     */
    @Test
    public void testMostrarSerie() {
    }
    
}
