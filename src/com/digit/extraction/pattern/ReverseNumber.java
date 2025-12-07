package com.digit.extraction.pattern;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ReverseNumber {



    public int reverseNo(int number)
    {
        int reverse = 0;
        while(number>0)
        {
            int separate = number%10;
            reverse  =  reverse * 10 + separate;
            number = number/10;
        }
        return reverse;
    }

    public static void main(String[] args)
    {Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        ReverseNumber no = new ReverseNumber();
        int reversed = no.reverseNo(a);

        System.out.println("Reversed number: " + reversed);

    }
}
