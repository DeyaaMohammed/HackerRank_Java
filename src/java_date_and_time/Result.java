package java_date_and_time;

import java.util.Calendar;
import java.util.Locale;

public class Result {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        // The first month of the year in the Gregorian and Julian calendars is JANUARY which is 0
        calendar.set(year, month - 1, day);
        //Calendar.Long A style specifier for getDisplayName indicating a long name, such as "January"
        String dayOfTheWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.CANADA).toUpperCase();
        return dayOfTheWeek;
    }
}
