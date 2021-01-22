import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateUtilsTest {

    @Nested
    @DisplayName("A year is a leap year")
    class AYearIsALeapYear {

        @Test
        @DisplayName("Year is divisible by four, but not by one hundred")
        public void yearIsDivisibleByFourButNotByOneHundred() {

            assertTrue(DateUtils.isLeapYear(2020));
        }

        @Test
        @DisplayName("Year is divisible by four hundred")
        public void yearIsDivisibleByFourHundred() {
            assertTrue(DateUtils.isLeapYear(2000));
        }
    }

    @Nested
    @DisplayName("A year is not a leap year")
    class AYearIsNotALeapYear {

        @Test
        @DisplayName("Year is not divisible by four")
        public void yearIsNotDivisibleByFour() {
            assertFalse(DateUtils.isLeapYear(1999));
        }

        @Test
        @DisplayName("Year is divisible by one hundred, but not by four hundred")
        public void yearIsDivisibleByOneHundredButNotByFourHundred() {
            assertFalse(DateUtils.isLeapYear(2100));
        }
    }

    @Nested
    @DisplayName("A year is not supported")
    class AYearIsNotSupported {

        @Test
        @DisplayName("Year is negative")
        public void yearIsNegative() {
            try {
                DateUtils.isLeapYear(-1);
            } catch (IllegalArgumentException ex) {
                assertEquals(ex.getMessage(), "Year must be larger than or equal to zero");
            }
        }
    }

}
