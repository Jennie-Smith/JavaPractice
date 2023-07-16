package LeetCodeHackerRank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int element = ar.get(i);
            if(set.contains(element)){
                set.remove(element);
                count++;
            }else{
                set.add(element);
            }
        }
        return count;

    }
}
