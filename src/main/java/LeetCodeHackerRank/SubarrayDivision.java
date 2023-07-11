package LeetCodeHackerRank;

import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int ans = 0;
        for (int i = 0; i <= s.size()-m; i++) {
            int sum = 0;
            for (int j = i; j < i+m; j++) {
                sum = sum + s.get(j);
            }
            if(sum == d){
                ans++;
            }
        }
        return ans;
    }
}

