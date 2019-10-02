package examples;

public class highLow {
    public static void displayhighLow(int[] scoresAR){





        int high=0;
        int low=100;
        for (int j=0;j<scoresAR.length;j++) {
            System.out.println(scoresAR[j]);
            if (scoresAR[j] > high)
                high = scoresAR[j];
            if (scoresAR[j] < low)
                low = scoresAR[j];
        }
        System.out.println("the high is"+high+" the low is "+low);
    }
}

