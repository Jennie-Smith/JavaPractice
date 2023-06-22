package LeetCodeHackerRank;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int size = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int n: arr) {
            if(n >0){
                positiveCount++;
            } else if (n == 0) {
                zeroCount++;
            } else{
                negativeCount++;
            }
        }
        double positiveRatio = (double) positiveCount / size;
        double negativeRatio = (double) negativeCount / size;
        double zeroRatio = (double) zeroCount / size;

        System.out.printf("%.6f\n%.6f\n%6.f\n", positiveRatio, negativeRatio, zeroRatio);
    }
}
