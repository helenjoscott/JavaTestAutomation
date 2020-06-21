package chapter7;

public class DayOfTheWeek {
    private String[] dayOfWeek = new String[10];

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
