package LeetCodeHackerRank;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int max_count = 0;
        int min_count = 0;
        int max_value = scores.get(0);
        int min_value = scores.get(0);
        for (int i = 0; i < scores.size(); i++) {
            int val = scores.get(i);
            if(val > max_value){
                max_value = val;
                max_count++;
            }
            if(val < min_value){
                min_value = val;
                min_count++;
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(max_count);
        al.add(min_count);
        return al;

    }

}
