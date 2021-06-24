package com.bridgelabz.logicalprograms;

public class StopWatch {
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
        System.out.println("start time is "+startTime+" milli seconds");
        printHelloWorld();
        long endTime=System.currentTimeMillis();
        System.out.println("endTime is"+endTime+" milli seconds");
        printElapsedTime(startTime,endTime);
    }
    private static void printElapsedTime(long startTime,long endTime)
    {
        long elapsedTime=endTime-startTime;
        System.out.println("Elapsed time:"+elapsedTime+" milli seconds");;
    }
    public static void printHelloWorld()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("HelloWorld");
        }
    }
}
