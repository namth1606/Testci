/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.namth.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtil {

    
    
    public static long getFactorial(int n){
    long product = 1;
    if(n < 0 || n > 20)
        throw new IllegalArgumentException("n must be between 0 ... 20");
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
  
    
}
//TDD - Test Driven Development
