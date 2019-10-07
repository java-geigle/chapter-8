package assignments;

import java.util.Scanner;

public class distanceFromAverage {
    public static void main(String[] args){

        Scanner key=new Scanner(System.in);
        int input;
        int limit = (20);
        double average;
        double total=0;
        double distance;
        int[] numbs= new int[20];
        int temp;


        System.out.println("enter up to 20 values enter 999 to quit ");
     for(int i=0; i < limit;++i) {

         System.out.println("enter value " + (i + 1));
         temp = key.nextInt();

         if (temp != 999) {
             input = temp;
             numbs[i]=input;}
             else {
             numbs=new int[i];
             i = 20; }}
             if(numbs.length<1)
                 System.out.println("try again and enter a number this time");


        for (int t = 0; t < numbs.length; ++t){
            total = total + numbs[t];}

        average = total / numbs.length;

         for (int j = 0; j < numbs.length; ++j) {

             distance = numbs[j]-average;
             System.out.println("the distance from average for entry " + (j + 1) + " is " + distance);
            }







    }
}
