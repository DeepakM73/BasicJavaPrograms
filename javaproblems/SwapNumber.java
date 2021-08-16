package com.bridgelabz.javaproblems;
import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers: ");
        Scanner s = new Scanner (System.in);
        int firstnumber = s.nextInt();
        int secondnumber = s.nextInt();
        int t;
        System.out.println("\nBefore swapping numbers: "+firstnumber +"  "+ secondnumber);
        t = firstnumber;
        firstnumber = secondnumber;
        secondnumber = t;
        System.out.println("After swapping: "+firstnumber +"   " + secondnumber);
    }
}
