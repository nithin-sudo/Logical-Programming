package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        int sumOfPositiveDivisor=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to be checked: ");
        int perfectNumber = scanner.nextInt();
        for (int i=1;i<perfectNumber;i++)
        {
            if(perfectNumber%i==0)
            {
                sumOfPositiveDivisor=sumOfPositiveDivisor+i;
                System.out.println("the positive divisors of given number are:"+i);
            }
        }
        if(sumOfPositiveDivisor==perfectNumber)
            System.out.println("entered number is a perfect number");
        else
            System.out.println("entered number is not a perfect number");
    }
}
