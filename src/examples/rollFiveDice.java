package examples;

import java.util.Random;

public class rollFiveDice {
    public static void main(String[] args){
        Random rand = new Random();
        int [] dieR = new int [5];
        int total=0;


        for(int i=0;i<5;++i){
            int die = rand.nextInt(6) + 1;
            dieR[i] = die;
            System.out.println(die);
        }
//        System.out.println(dieR[0]);

        for(int j=0;j<dieR.length;++j)
            total=total+dieR[j];
        System.out.println("total is "+total);
    }

}
