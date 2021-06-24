package com.bridgelabz.logicalprograms;
public class StopWatch {
    /**
     * calling currentTimeMillis  method and printing start time and end time and calling printElapsedTime method
     * by passing startTime and endTime as parameters.
     * @param args
     */
    public static void main(String[] args){
        long startTime=System.currentTimeMillis();
        System.out.println("start time is "+startTime+" milli seconds");
        printHelloWorld();
        long endTime=System.currentTimeMillis();
        System.out.println("endTime is"+endTime+" milli seconds");
        printElapsedTime(startTime,endTime);
    }
    /**
     * Printing the elapsed time.
     * @param startTime
     * @param endTime
     */
    private static void printElapsedTime(long startTime,long endTime)
    {
        long elapsedTime=endTime-startTime;
        System.out.println("Elapsed time:"+elapsedTime+" milli seconds");;
    }
    /**
     * Just printing a simple statements until given condition.
     */
    public static void printHelloWorld()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("HelloWorld");
        }
    }
}
