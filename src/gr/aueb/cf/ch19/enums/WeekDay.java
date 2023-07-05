package CodingFactory23A.src.gr.aueb.cf.ch19.enums;

public enum WeekDay {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private final String day;

    private WeekDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
