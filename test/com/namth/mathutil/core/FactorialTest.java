/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.namth.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class FactorialTest {
     @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowException() {
// check xem co ngoai le hay khong khi dua data ca chon
        MathUtil.getFactorial(-5);
        
    }

    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        long expected = 120;
        long actual = MathUtil.getFactorial(5);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtil.getFactorial(0));

    }
    //Quy uoc xanh do
    //neu xanh thi tat ca phai cung xanh
    // do thi chi can mot cai do

   
    
    
}
