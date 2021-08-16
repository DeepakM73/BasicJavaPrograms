package com.bridgelabz.javaproblems;

import java.util.Scanner;

public class LargestNumberOfThree {
    static	Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter three numbers:: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if((a>b) && (a>c)){
            System.out.println("The Largest number is a");
        }
        else if((b>a) && (b>c)){
            System.out.println("The Largest number is b");
        }
        else{
            System.out.println("The Largest number is c");
        }
    }

}
