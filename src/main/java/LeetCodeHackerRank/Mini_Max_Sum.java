package LeetCodeHackerRank;

import java.util.Collections;
import java.util.List;

public class Mini_Max_Sum {

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        long low_sum = sum - arr.get(arr.size()-1);
        long high_sum = sum - arr.get(0);
        System.out.println(low_sum + " " + high_sum);

    }
}
