package com.avi;

import java.util.Scanner;

public class TypeCast {
    public static void main(String args[]){
        Scanner value = new Scanner(System.in);
        System.out.print("Enter a value to typecast ");
        int number = value.nextInt();
        byte number_1 =(byte) number;
        System.out.println(number_1);
        Scanner val = new Scanner(System.in);
        System.out.print("Enter a value to typecast ");
        double decimal = val.nextDouble();
        float number_2 =(float) decimal;
        System.out.println(number_2);
    }
}