package LeetCodeHackerRank;

import java.util.List;

public class bigSum {

    public static long aVeryBigSum(List<Long> ar) {
        long n = 0;
        for (int i = 0; i < ar.size(); i++) {
            n = n + ar.get(i);
        }
        return n;
    }
}
