import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class exe_274 {
    public static String sumTimeStrings(String time1, String time2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime localTime1 = LocalTime.parse(time1, formatter);
        LocalTime localTime2 = LocalTime.parse(time2, formatter);

        LocalTime sumTime = localTime1.plusHours(localTime2.getHour())
                .plusMinutes(localTime2.getMinute())
                .plusSeconds(localTime2.getSecond());

        String result = sumTime.format(formatter);
        return result;
    }
    public static void main(String[] args) {
        String time1 = "11:20:30";
        String time2 = "07:35:45";

        // Tính tổng thời gian
        String sumTime = sumTimeStrings(time1, time2);

        System.out.println("Tổng thời gian: " + sumTime);
    }

}
