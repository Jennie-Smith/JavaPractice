package LeetCodeHackerRank;

public class DayoftheProgrammer {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        if(year == 1918){
            return "26.09.1918";
        }
        int remfour = year % 4;
        int remhund = year % 100;
        int fourhund = year % 400;

        String yy = String.valueOf(year);
        String ddmmyy;
        String ddmm = "12.09.";

        if(year > 1918){
            if((remfour == 0 && remhund != 0) || (remhund == 0 && fourhund == 0)){
                ddmmyy = ddmm.concat(yy);
                return ddmmyy;
            }
        } else if (remfour == 0) {
            ddmmyy = ddmm.concat(yy);
            return ddmmyy;
        }
        return "13.09." + yy;

    }
}
