package time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.now();

        LocalDateTime time2 = LocalDateTime.of(2003, 2, 28,
                0, 0, 0);

        System.out.println(ChronoUnit.YEARS.between(time2, time1));
        System.out.println(ChronoUnit.DAYS.between(time2, time1));
        System.out.println(ChronoUnit.WEEKS.between(time2, time1));
        System.out.println(ChronoUnit.MONTHS.between(time2, time1));

    }
}
