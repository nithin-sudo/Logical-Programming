package com.bridgelabz.logicalprograms;
import java.util.Random;
import java.util.Scanner;
public class CouponNumber {
    /**
     * Taking range from user and printing distinct values upto the range
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many distinct values you want:");
        int distinctNumber=scanner.nextInt();
        int[] distinctArray = new int[distinctNumber];
        int countRandomNumber=0;
        for (int index = 0; index <distinctNumber; index++) {
            Random random = new Random();
            int couponNumber = random.nextInt(distinctNumber)+1;
            countRandomNumber++;
            if (index == 0) {
                distinctArray[index] = couponNumber;
                System.out.println("distinct values are:"+couponNumber);
            }
            else {
                for (int j = 0; j < index; j++) {
                    if (distinctArray[j] == couponNumber) {
                        index--;
                        break;
                    }
                    else if (j==index-1 ) {
                        distinctArray[index] = couponNumber;
                        System.out.println("distinct values are :"+couponNumber);
                    }
                }
            }
        }
        System.out.println("number of attempts are :"+countRandomNumber);
    }
}