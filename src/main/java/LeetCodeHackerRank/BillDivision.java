package LeetCodeHackerRank;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if(i != k){
                sum = sum + bill.get(i);
            }
        }
        int price = sum/2;
        if(price == b) {
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-price);
        }


    }

}
