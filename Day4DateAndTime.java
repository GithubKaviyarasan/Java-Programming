
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

class Day4DateAndTime {

    public static void main(String[] args) {

        // // 1. DATE
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

        // // 2. TIME
        LocalTime time = LocalTime.now();


        System.out.println("Plus Hours = " + time.plusHours(2));
        System.out.println("Minus Hours = " + time.minusHours(2));

        System.out.println("Plus Minutes = " + time.plusMinutes(10));
        System.out.println("Minus Minutes = " + time.minusMinutes(10));

        System.out.println("Plus Seconds = " + time.plusSeconds(30));
        System.out.println("Minus Seconds = " + time.minusSeconds(30));

        System.out.println("Hour = " + time.getHour());
        System.out.println("Minute = " + time.getMinute());
        System.out.println("Second = " + time.getSecond());

        // // 3. LOCAL DATE TIME + FORMATTER
        LocalDateTime answer = LocalDateTime.now();

        DateTimeFormatter displayFormat
                = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");

        System.out.println("\nFormatted Date = "
                + answer.format(displayFormat));

        // // 4. PERIOD
        // // Difference between two dates
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 3, 11);

        Period difference = Period.between(startDate, endDate);

        System.out.println("Years = " + difference.getYears());
        System.out.println("Months = " + difference.getMonths());
        System.out.println("Days = " + difference.getDays());

        // // 5. DURATION
        // // Difference between two times
        LocalTime startTime = LocalTime.of(10, 30);
        LocalTime endTime = LocalTime.of(14, 45);

        Duration duration = Duration.between(startTime, endTime);

        System.out.println("Hours = " + duration.toHours());
        System.out.println("Minutes = " + duration.toMinutes());

        // // 6. CALENDAR
        Calendar calendar = Calendar.getInstance();

        // Set specific date
        calendar.set(2026, Calendar.APRIL, 16);

        // Get individual values
        System.out.println("Year = " + calendar.get(Calendar.YEAR));
        System.out.println("Month = " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour = " + calendar.get(Calendar.HOUR));
        System.out.println("Minute = " + calendar.get(Calendar.MINUTE));

        // Add  Days
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After +5 Days = " + calendar.getTime());

        // Add  Months
        calendar.add(Calendar.MONTH, 2);
        System.out.println("After +2 Months = " + calendar.getTime());

        // Add  Year
        calendar.add(Calendar.YEAR, 1);
        System.out.println("After +1 Year = " + calendar.getTime());

        // Subtract  Days
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("After -5 Days = " + calendar.getTime());
    }
}
