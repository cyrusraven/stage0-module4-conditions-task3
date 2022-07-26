package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month == 5) {
            System.out.println("Spring");
        } else if (month == 6) {
            System.out.println("Summer");
        } else if (month == 1) {
            System.out.println("Winter");
        } else if (month < 0) {
            System.out.println("wrong number!");
        }
    }
}
