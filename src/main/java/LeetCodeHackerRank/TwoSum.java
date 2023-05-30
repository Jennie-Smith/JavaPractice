package LeetCodeHackerRank;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

//    hashmap method - faster method - more memory
    public int[] twoSumHashMap(int[] nums, int target){
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex != null){
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
    
//    {5, 2, 4}  = 6 ; answer = [1,2] or [2, 1]
//    gets the index of the two numbers that equal the target
}
