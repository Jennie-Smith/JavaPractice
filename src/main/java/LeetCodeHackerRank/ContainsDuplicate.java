package LeetCodeHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicate {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> Answer = new ArrayList<Integer>();
        int aTotal = 0;
        int bTotal = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) > b.get(j)) {
                    aTotal += 1;
                    System.out.println(a.get(i));
                    System.out.println(b.get(j));
                    System.out.println(aTotal);

                } else if (a.get(i) < b.get(j)) {
                    bTotal += 1;
                }
            }
        }
        Answer.add(aTotal);
        Answer.add(bTotal);
        return Answer;

    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(check.contains(nums[i])){
                return true;
            }
            check.add(nums[i]);
        }
        return false;
    }

//    or faster way

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<Integer>();
        List<Integer> bList = new ArrayList<>();
        aList.add(5);
        aList.add(6);
        aList.add(7);
        bList.add(3);
        bList.add(6);
        bList.add(10);
        System.out.println(aList);
        System.out.println(bList);
        System.out.println(compareTriplets(aList, bList));
    }

}

