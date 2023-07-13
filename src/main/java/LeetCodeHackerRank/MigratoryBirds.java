package LeetCodeHackerRank;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int max = 0;
        int[] countArray = new int[3 << 1];
        for (int val: arr) {
            countArray[val]++;
            max = Math.max(max, countArray[val]);
        }
        for (int i = 0; i < countArray.length; i++) {
            if(countArray[i] == max){
                return i;
            }
        }
        return 0;

    }
}
