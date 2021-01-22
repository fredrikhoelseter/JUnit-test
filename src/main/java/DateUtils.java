


public class DateUtils {

    public static boolean isLeapYear(int year) throws IllegalArgumentException {
        if (year >= 0) {
            return (year % 4 == 0) &&
                    (year % 100 != 0) ||
                    (year % 400 == 0);
        } else {
            throw new IllegalArgumentException("Year must be larger than or equal to zero");
        }
    }
}
