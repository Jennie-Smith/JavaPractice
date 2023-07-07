package LeetCodeHackerRank;

import java.util.List;

public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        int current_factor = a.get(a.size() - 1);
        int flag;
        while (current_factor <= b.get(0)) {
            flag = 0;
            for (int i = 0; i < a.size(); i++) {
                if (current_factor % a.get(i) != 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                for (int i = 0; i < b.size(); i++) {
                    if (b.get(i) % current_factor != 0) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                count++;
            }
            current_factor++;
        }
        return count;
    }
}
