package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class ReverseNumber {
    /**
     * Taking Number as input from user and printing reversal of that number.
     * @param args
     */
    public static void main(String[] args){
        int reversalOfNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to be reversed: ");
        int numberToBeReversed = sc.nextInt();
        while(numberToBeReversed != 0)
        {
            reversalOfNumber = reversalOfNumber*10+numberToBeReversed%10;
            numberToBeReversed /= 10;
        }
        System.out.println("the reversal of  a given Number is"+reversalOfNumber);
    }
}
