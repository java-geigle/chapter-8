package assignments;

import java.util.Scanner;

import static java.lang.Math.abs;

public class distanceFromAverage {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        double input;
        int limit = 20;
        double average = 0;
        double total = 0;
        double distance;
        double[] numbs = new double[20];
        int count = 0;


        System.out.println("enter up to 20 values enter 999 to quit ");
        for (int i = 0; i < limit; ++i) {

            System.out.println("enter value " + (i + 1));
            input = key.nextInt();

            if (input != 999) {
                numbs[i] = input;
                total = total + numbs[i];

            } else {

                average = total / count;



                for (int j = 0; j < count; ++j) {
                    distance = numbs[j] - average;
                    System.out.println(numbs[j]);

                    System.out.println("the average is " + average + " distance for entry " + (j + 1) + " is " + abs(distance));

                }
                i = 94;
            }


            ++count;

        }
            if (count < 1)
                System.out.println("try again and enter a number this time");



    }
}
