package org.example;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gib einen String ein:");
        String s = in.nextLine();
        System.out.println("Einzeln:");
        for (char c : s.toCharArray()) {
            System.out.println(c);
        }
    }
}
