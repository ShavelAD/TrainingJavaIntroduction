/**
 * Created by user on 08.05.2019.
 */
public class DateDefinition {
    private static final int MAX_DAY_THIRTY = 30;
    private static final int MAX_DAY_THIRTYONE = 31;
    private static final int MAX_DAY_FEB_LEAP = 29;
    private static final int MAX_DAY_FEB_NONLEAP = 28;
    private static final int YEAR_DIVIDER = 10000;
    private static final int MONTH_DIVIDER = 100;
    private static final int DAY_DIVIDER = 100;

    public static void main(String[] args){
        int day = 8;
        int month = 5;
        int year = 2019;
        dateOutput((nextDayDateFinder(day, month, year)));

    }
    private static int maxDayFinder(int month, int year) {
        int maxDays;
        if (month <= 7) {

            if (month % 2 == 1) {
                maxDays = MAX_DAY_THIRTYONE;
            } else {

                if (month == 2) {
                    if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                        maxDays = MAX_DAY_FEB_LEAP;
                    }

                    else {
                        maxDays = MAX_DAY_FEB_NONLEAP;
                    }
                } else {
                    maxDays = MAX_DAY_THIRTY;
                }
            }

        } else {

            if (month % 2 == 0) {
                maxDays = MAX_DAY_THIRTYONE;
            } else {
                maxDays = MAX_DAY_THIRTY;
            }

        }

        return maxDays;
    }
    private static int date(int day, int month, int year) {

        int date = year;
        date += month * 10000;
        date += day * 1000000;
        return date;
    }

    public static int nextDayDateFinder(int day, int month, int year) {
        int maxDay = maxDayFinder(month, year);

        int newDay = day;
        int newMonth = month;
        int newYear = year;

        if (newDay == maxDay) {
            newDay = 1;

            if (month == 12) {
                newMonth = 1;
                newYear++;
            } else {
                newMonth++;
            }
        } else {
            newDay = ++day;
        }

        return date(newDay, newMonth, newYear);
    }

    public static void dateOutput(int date) {
        int day, month, year;

        year = date % YEAR_DIVIDER;
        date /= YEAR_DIVIDER;

        month = date % MONTH_DIVIDER;
        date /= MONTH_DIVIDER;

        day = date % DAY_DIVIDER;
        date /= DAY_DIVIDER;

        System.out.println("d:" + day + "|m:" + month + "|y:" + year);
    }
}
