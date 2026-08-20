package com.dinesh;

import java.util.Scanner;

public class SuM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String value = input.next();
            if (value.equals("x")) {
                break;
            }
            int num = Integer.parseInt(value);
            sum = sum + num;
        }
        System.out.println("sum = " + sum);
    }
}
