package com.ds.corejava;

public class ArraysSeparate0n1 {
    public static void main(String arg[]) {
        int arr[] = { 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0 };

        seggregate0n1(arr);
    }

    private static void seggregate0n1(int[] arr) {
        int type0 = 0;
        int type1 = arr.length-1;

        while(type0 < type1) {
            if (arr[type0] == 1) {
                arr[type0] = arr[type0] + arr[type1];
                arr[type1] = arr[type0] - arr[type1];
                arr[type0] = arr[type0] - arr[type1];
                type1--;
            } else {
                type0++;
            }
        }
        System.out.println("Seggregated Array => "+arr);
    }
}
