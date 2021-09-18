package com.avi;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner set = new Scanner(System.in);
        System.out.println("Principal: ");
        long principal = set.nextLong();
        System.out.println("Rate of interest: ");
        float rate = set.nextFloat();
        System.out.println("Number of years: ");
        float number= set.nextFloat();
        int numbers =(int) number *12;
        float rates =(float) rate/100;

        Locale indiaLocale=new Locale("en","IN");

        double  interest = principal*rate*Math.pow(1+rates,numbers)/(Math.pow(1+rates,numbers)-1) ;
        NumberFormat interests =  NumberFormat.getCurrencyInstance(indiaLocale);
         String  inkjet = interests.format(interest);
        System.out.print("Interest is "+inkjet);




    }
}
