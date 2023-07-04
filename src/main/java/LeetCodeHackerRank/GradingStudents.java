package LeetCodeHackerRank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++) {
            int mark  = grades.get(i);
            if(mark<38){
                list.add(mark);
            } else{
                int multiple = (mark/5) + 1;
                int mulOf5 = multiple * 5;
                int diff = mulOf5 - mark;
                if(diff < 3){
                    list.add(mulOf5);
                } else{
                    list.add(mark);
                }
            }
        }
        return list;

    }
}
