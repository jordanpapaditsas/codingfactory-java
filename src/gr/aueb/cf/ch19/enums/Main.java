package CodingFactory23A.src.gr.aueb.cf.ch19.enums;

public class Main {

    public static void main(String[] args) {
        WeekDay weekdays;

        for (WeekDay weekDay : WeekDay.values()) {
            System.out.println(weekDay.getDay());
        }
    }
}
