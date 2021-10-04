/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.namth.mathutil.main;

import com.namth.mathutil.core.MathUtil;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        MathUtil.getFactorial(-5);
        //test manual, đưa dât , gọi hàm để check , soanhs expected với inout
        //tất cả phải làm bằng mắt, cho từng trường hợp cho từng tình huống test
        System.out.println("0! = 1? " + MathUtil.getFactorial(0));
        System.out.println("1! = 1? " + MathUtil.getFactorial(1));
        System.out.println("2! = 2? " + MathUtil.getFactorial(2));
        System.out.println("3! = 6? " + MathUtil.getFactorial(3));
    }
}
