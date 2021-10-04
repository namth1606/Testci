/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.namth.mathutil.core;

import static com.namth.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ADMIN
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //chuan bi bo data, tach data ra han cac lenh ktra ham 
    // data nay ta co the de dat o cac file .txt .csv .excel ben ngoai
    //@before (load du lieu vao ram)
    // data input / output la nhung cap 
    //nhieu cap can phai test , do do data de test ham phai la mang hai chieu
    // mang hai chieu duoc nap tu file text 
    // hoac tao mang hai chieu ngay day dieu duoc
    @Parameters
    public static Object[][] initData(){
    return new Integer[][]{
                           {0, 1},
                           {1, 1},
                           {2, 2},
                           {3, 6},
                           {4, 24},
                           {5, 120}
                           };
    }
    
    //ta cần map 2 cột vào 2 biến để lát hồi nhồi /feed chúng vào 
    //hàm checkfactorial ,ta gọi là testing kiểu paramiter
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {     
        assertEquals(expected, getFactorial(input));
    }
}
