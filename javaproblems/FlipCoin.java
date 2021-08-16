package com.bridgelabz.javaproblems;
import java.util.Scanner;

public class FlipCoin {
    static final Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Flip coin times: ");

        int num = s.nextInt();
        int count=0;
        int headsCount=0;
        int tailsCount=0;
        double headPer;
        double tailPer;
        while(num!=count){

            if(Math.random() < 0.5){
                System.out.println("Tails");
                tailsCount++;
            }
            else{
                System.out.println("Heads");
                headsCount++;
            }
            count++;
        }
        tailPer=(tailsCount/num)*100;
        headPer=(headsCount/num)*100;
        System.out.println("Tails: "+tailsCount);
        System.out.println("Heads: "+headsCount);
        System.out.format("Tails percentage: %.2f",tailPer);
        System.out.format("\nHeads percentage: %.2f",headPer);
    }
}
