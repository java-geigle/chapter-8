package examples;

import java.util.Scanner;

public class averageQuizzes {
    public static void main(String[] args){

        int[] scoresAR=new int[10];
        int score;

        int total=0;
      int high=0;
      int low=100;
        Scanner input= new Scanner(System.in);

        for(int i =0; i< scoresAR.length;++i) {
            System.out.println("enter quiz score " + i + ">>>");
            score = input.nextInt();
            scoresAR[i] = score;
            total= scoresAR[i]+total;
        }
        System.out.println("the scores enterd were");

        for (int j=0;j< scoresAR.length;j++) {
            System.out.println(scoresAR[j]);
            if (scoresAR[j] > high)
                high = scoresAR[j];
            if (scoresAR[j] < low)
                low = scoresAR[j];
        }
        System.out.println("the average is "+(total/ scoresAR.length));
        System.out.println("the high is "+high+" the low is "+low);
        highLow.displayhighLow(scoresAR);
        }

    }
