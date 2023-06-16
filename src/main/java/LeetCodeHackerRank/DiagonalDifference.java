package LeetCodeHackerRank;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = 0;
        int m = 0;
        for (int i = 0; i < arr.size(); i++) {
            n += arr.get(i).get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            m += arr.get(i).get(arr.size() - (i + 1));
        }

        return Math.abs(n -m);

    }
}
