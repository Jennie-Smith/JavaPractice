package LeetCodeHackerRank;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        Collections.sort(candles);
        int size = candles.size();
        int largest = candles.get(size-1);
        int count = 1;
        for (int i = size-2; i >= 0; i--) {
            if(candles.get(i) != largest){
                break;
            } else{
                count++;
            }
        }
        return count;
    }

}
