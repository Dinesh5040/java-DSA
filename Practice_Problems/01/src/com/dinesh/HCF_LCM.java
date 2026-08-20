package com.dinesh;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int hcf = 1;
        for(int i = 1; i<=num1 && i<=num2; i++) {
            if(num1%i==0 && num2%i==0);{
                hcf = i;
            }
        }
        int lcm = (num1 * num2) / hcf;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}
