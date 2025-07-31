package com.ds;

import com.ds.structures.Stack;

import java.io.IOException;

/**
 * Summation of N natural numbers using Stack DS
 */

public class NumberSummation {

    static int num;
    static int ans;
    static Stack theStack;

    public static void main(String[] args) throws IOException {
        num = 50;
        stackAddition();
        System.out.println("Sum = " + ans);
    }

    public static void stackAddition() {
        theStack = new Stack(10000);
        ans = 0;
        while (num > 0) {
            theStack.push(num);
            --num;
        }
        while (!theStack.isEmpty()) {
            int newN = theStack.pop();
            ans += newN;
        }
    }
}
