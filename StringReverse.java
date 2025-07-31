package com.ds;


import java.util.Stack;

/**
 * Reverse a string using Stack DS
 */
public class StringReverse {

    static String str = "Tarun";
    static String revStr = "";

    static String str2 = "This is tarun i oo . ..   ....";

    public static void main(String[] args) {
        reverseString(str);
        System.out.println("Rev Str = " + revStr);

        String wordReverse = reverseWordInString(str2);
        System.out.println("Rev Words in a String = " + wordReverse);

    }

    private static String reverseWordInString(String str2) {
        String[] str = str2.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=str.length-1; i>=0; i--) {
            sb.append(str[i]).append(" ");
        }

        return sb.toString();
    }

    private static void reverseString(String str) {
        Stack<String> stack = new Stack();
        char[] strArr = str.toCharArray();
        for (int i=0; i<str.length(); i++) {
            stack.push(String.valueOf(strArr[i]));
        }

        while(!stack.isEmpty()) {
            String tempChar = stack.pop();
            revStr = revStr + tempChar;
        }
    }
}
