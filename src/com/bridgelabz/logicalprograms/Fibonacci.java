package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class Fibonacci {
    /**
     * Taking the fibonacciRange input from user and printing fibonacci series until that range.
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int fibonacciRange = scanner.nextInt();
        int precedingNumberOne=0,precedingNumberTwo=1,nextNumber;
        System.out.println("fibonnaci series for given range:");
        System.out.print(precedingNumberOne);
        System.out.print(" "+precedingNumberTwo);
        for(int i=2;i<fibonacciRange;i++)
        {
            nextNumber=precedingNumberOne+precedingNumberTwo;
            precedingNumberOne=precedingNumberTwo;
            precedingNumberTwo=nextNumber;
            System.out.print(" "+nextNumber);
        }

    }
}
