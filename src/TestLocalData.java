

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestLocalData {
    public static void main(String[] args) {
        //has no hours
        LocalDate today = LocalDate.now();
        System.out.println(today);

        String format = today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(format);

        LocalDate localDateB = LocalDate.of(2022, Month.OCTOBER, 7);

        Period until = today.until(localDateB);

        System.out.println(until.toTotalMonths());

        //has hours
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));

        LocalTime freeTime = LocalTime.of(15, 45);
        System.out.println(freeTime);

    }
}
