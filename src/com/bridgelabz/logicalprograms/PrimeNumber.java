package com.bridgelabz.logicalprograms;
import java.util.Scanner;
public class PrimeNumber {
    /**
     * Taking Number as input from user and checking whether it is prime or not.
     * @param args
     */
    public static void main(String[] args){
        int checkNumber,k=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        checkNumber = scanner.nextInt();
        if(checkNumber<=0||checkNumber==1)
            System.out.println(checkNumber+"is not a prime number");
        else
        {
            k=0;
            for(int i=2;i<checkNumber;i++)
            {
                if(checkNumber%i==0)
                    k=1;break;
            }
        }
        if(k==0)
            System.out.println(checkNumber+" is prime");
        else
            System.out.println(checkNumber+" is not prime");
    }
}
