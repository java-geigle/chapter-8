package assignments;

import java.util.Scanner;

public class arraMethodDemo {
    public static void main(String[] args){
int[] input=new int[10];

Scanner ing=new Scanner(System.in);
for(int i=0;i < input.length;++i){

   System.out.println("enter value "+(i+1));
   input[i]=ing.nextInt();

}

display(input);
displayReverse(input);
displayLess(input,ing);
displaySum(input);
    }

    public static void display(int[] input){
        for(int i=0;i < input.length;++i){
            System.out.print(input[i]+" ");
            System.out.println();
        }

    }
    public static void displayReverse(int[] input){

        for(int i=input.length; i>=0;--i ){
            System.out.print(input[i]+" ");
            System.out.println();
        }

    }
    public static void displaySum(int[] input){
       int total =0;
        for(int i=0;i<input.length;++i)
            total = total+input[i];
        System.out.println("the total is "+total);
        displayHighAverage(input,total);
    }
    public static void displayLess(int[] input,Scanner ing){
        int limit;
        System.out.println("enter a limit");
        limit=ing.nextInt();
        for(int i=0;i<limit;++i){
            if (input[i] < limit){
                System.out.print(input[i]+" ");
            }
        }
    }
    public static void displayHighAverage(int[] input,int total){
        double average;
        average=total/input.length;
        System.out.println(average);


    }
}
