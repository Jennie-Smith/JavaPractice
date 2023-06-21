package LeetCodeHackerRank;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
//        int size = arr.size();
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
        DecimalFormat df_obj = new DecimalFormat("#.######");
        List<Integer> answer = new ArrayList<>();
        df_obj.format(positiveCount/arr.size());
        answer.add(negativeCount/arr.size());
        answer.add(zeroCount/arr.size());
        System.out.println(answer);




    }
}
