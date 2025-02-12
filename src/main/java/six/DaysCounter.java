package six;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

/*
https://www.codewars.com/kata/59569ba543e2a8ebda00012a
 */

public class DaysCounter {

    public long getDaysBetween2Dates(String from, String to) {
        return DAYS.between(LocalDate.parse(from), LocalDate.parse(to));
    }
}