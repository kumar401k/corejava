package com.ds;

public class RecurssionTest {

    public static void main(String arg[]) {
        int f = factorial(10);
        System.out.println(f);
    }

    private static int factorial(int n) {
        //System.out.println(n);
        if(n==1) {
            return 1;
        }
        else {
            int result = n * factorial(n-1);
            //System.out.println(result);
            return result;
        }
    }
}
