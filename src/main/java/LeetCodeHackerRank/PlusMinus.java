package LeetCodeHackerRank;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int num: arr) {
            if(num > 0){
                positiveCount++;
            } else if (num < 0) {
                zeroCount++;
            } else{
                negativeCount++;
            }
        }
        double positiveRatio = (double) positiveCount / n;
        double negativeRatio = (double) negativeCount / n;
        double zeroRatio = (double) zeroCount / n;

        System.out.printf("%.6f\n%.6f\n%6.f\n", positiveRatio, negativeRatio, zeroRatio);
    }
}
