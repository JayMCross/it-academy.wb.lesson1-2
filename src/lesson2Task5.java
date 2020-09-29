public class lesson2Task5 {
    public static void main(String[] args) {

        int timeVarSec = 10000000;

        int sec = timeVarSec % 60;
        int m = (timeVarSec - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hours = h % 24;
        int days = (h - hours) / 24;
        int weeks = days % 7;

        System.out.println(weeks + " weeks, " + days + " days, " + hours + " hours, " + min + " minutes, " + sec + " seconds");
    }
}
