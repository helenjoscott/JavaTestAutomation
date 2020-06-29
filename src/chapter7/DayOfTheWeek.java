package chapter7;

public class DayOfTheWeek {
    private final String[] dayOfWeek = new String[7];

    public String getDayOfWeek(int userInput) {
        dayOfWeek[0] = ("Monday");
        dayOfWeek[1] = ("Tuesday");
        dayOfWeek[2] = ("Wednesday");
        dayOfWeek[3] = ("Thursday");
        dayOfWeek[4] = ("Friday");
        dayOfWeek[5] = ("Saturday");
        dayOfWeek[6] = ("Sunday");
        return dayOfWeek[userInput-1];
    }
}
