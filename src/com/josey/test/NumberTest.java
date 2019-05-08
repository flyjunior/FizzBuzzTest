package com.josey.test;

/**
 * Created by JOSEY on 2019/5/8.
 */
public class NumberTest {

    public static void main(String[] args) {
        printFizzBuzz(100);
    }


    public static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; ++i) {
            //判断是否能被3整除
            if (i % 3 == 0) {
                //能被3和5同时整除
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
                //判断是否能被5整除
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
