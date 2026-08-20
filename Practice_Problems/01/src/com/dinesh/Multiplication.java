package com.dinesh;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for(int a = 1; a<=20; a++){
           int result = num*a;
           System.out.println(result);
        }

    }
}
