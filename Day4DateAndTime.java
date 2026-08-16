import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Day4DateAndTime {

    public static void main(String[] args) {

        // 1. Date
        // -----------------
        LocalDate date = LocalDate.now();

        System.out.println("Today = " + date);

        System.out.println("Plus Month = " + date.plusMonths(2));
        System.out.println("Minus Month = " + date.minusMonths(2));

        System.out.println("Plus Year = " + date.plusYears(1));
        System.out.println("Minus Year = " + date.minusYears(1));

        System.out.println("After 5 Days = " + date.plusDays(5));
        System.out.println("Before 5 Days = " + date.minusDays(5));

        System.out.println("Day = " + date.getDayOfMonth());
        System.out.println("Month = " + date.getMonth());
        System.out.println("Year = " + date.getYear());

        System.out.println("Month Number = " + date.getMonthValue());
        System.out.println("Day of Year = " + date.getDayOfYear());
        System.out.println("Day of Week = " + date.getDayOfWeek());


        // 2. Time
        // -----------------
        LocalTime time = LocalTime.now();

        System.out.println("Current Time = " + time);

        System.out.println("Plus Hours = " + time.plusHours(2));
        System.out.println("Minus Hours = " + time.minusHours(2));

        System.out.println("Plus Minutes = " + time.plusMinutes(10));
        System.out.println("Minus Minutes = " + time.minusMinutes(10));

        System.out.println("Plus Seconds = " + time.plusSeconds(30));
        System.out.println("Minus Seconds = " + time.minusSeconds(30));

        System.out.println("Hour = " + time.getHour());
        System.out.println("Minute = " + time.getMinute());
        System.out.println("Second = " + time.getSecond());


        // 3. LocalDateTime
        // -----------------
        LocalDateTime answer = LocalDateTime.now();

        DateTimeFormatter displayformat =
                DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
                // // DateTimeFormatter.ofPattern("DD/MM/YY HH:mm:ss");

        System.out.println("Formatted Date = " + answer.format(displayformat));

        // // 4. find the period/difference between two dates
        LocalDate startDate = LocalDate.of(2024, 1, 01);
        LocalDate endDate = LocalDate.of(2025, 3, 11);

        Period difference = Period.between(startDate, endDate);

        System.out.println("Years = " + difference.getYears());
        System.out.println("Months = " + difference.getMonths());
        System.out.println("Days = " + difference.getDays()); 

    }
}