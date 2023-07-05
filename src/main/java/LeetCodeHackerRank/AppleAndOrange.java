package LeetCodeHackerRank;

import java.util.List;

public class AppleAndOrange {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int count = 0;
        for (int i = 0; i < apples.size(); i++) {
            int sum = a + apples.get(i);
            if(sum >= s && sum <= t){
                count++;
            }
        }
        System.out.println(count);
        count = 0;
        for (int i = 0; i < oranges.size(); i++) {
            int sum = b + oranges.get(i);
            if(sum >= s && sum <= t){
                count++;
            }
        }
        System.out.println(count);

    }
}
