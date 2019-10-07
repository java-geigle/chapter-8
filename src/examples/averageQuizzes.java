package examples;

import java.util.Scanner;

public class averageQuizzes {
    public static void main(String[] args){
      int entry;

      int score;

      int total=0;
      int high=0;
      int low=100;
      int quit;
      do{
        Scanner input= new Scanner(System.in);
        System.out.println("how many students?>>>");
        entry=input.nextInt();
                  int[] scoresAR=new int[entry];
        for(int i =0; i< scoresAR.length;++i) {
            System.out.println("enter quiz score " + i + ">>>");
            score = input.nextInt();
            scoresAR[i] = score;
            total= scoresAR[i]+total;
        }
        System.out.println("the scores entered were");


        for (int j=0;j< scoresAR.length;j++) {
            System.out.println(scoresAR[j]);
            if (scoresAR[j] > high)
                high = scoresAR[j];
            else if (scoresAR[j] < low)
                low = scoresAR[j];

        }
        System.out.println("the average is "+(total/ scoresAR.length));

        highLow.displayhighLow(scoresAR);
        System.out.println("are you done? enter 999 to quit ");
        quit= input.nextInt();

        }  while(quit ==999);
    }
    }

