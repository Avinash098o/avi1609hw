package com.avi;

import java.util.Scanner;

public class scanner {
    public static void main(String args[]){
        Scanner avi = new Scanner(System.in);
        System.out.println("What is your name");
        String next = avi.next();
        System.out.print("My name is " + next);

        Scanner av = new Scanner(System.in);
        System.out.println("What is your age");
        int net = av.nextInt();
        System.out.println("My name is " + net);
    }
}
