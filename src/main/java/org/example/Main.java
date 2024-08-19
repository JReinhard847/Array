package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Erstes Array:" + Arrays.toString(firstArray));
        int sum = 0;
        for (int temp : firstArray) {
            sum += temp;
        }
        System.out.println("Summe des ersten Arrays:" + sum);
        int max = 0;
        for (int temp : firstArray) {
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println("Maximum des ersten Arrays:" + max);

        int[] secondArray = {11, 13, 15, 17, 19, 12, 14, 16, 18, 20};
        System.out.println("Zweites Array:" + Arrays.toString(secondArray));
        int[] sumArr = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            sumArr[i] = firstArray[i] + secondArray[i];
        }
        System.out.println("Summe der beiden Arrays:" + Arrays.toString(sumArr));
    }
}