package LeetCodeHackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i < j){
                    if((ar.get(i) + ar.get(j)) % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;

    }
}
