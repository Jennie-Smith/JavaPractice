package LeetCodeHackerRank;

public class Staircase {

    public static void staircase(int n) {
        String str="#";
        for (int i = 0; i < n; i++) {
            System.out.printf("%" + n + "s\n", str);
            str += "#";
        }

    }
}
