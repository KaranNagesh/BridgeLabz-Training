import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesDemo {

    public static void main(String[] args) {

        // Current time in GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // Current time in IST (Indian Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Current time in PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Displaying times
        System.out.println("Current Time in GMT: " + gmtTime);
        System.out.println("Current Time in IST: " + istTime);
        System.out.println("Current Time in PST: " + pstTime);
    }
}
