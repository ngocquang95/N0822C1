package ss23_date_local_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeStudy {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//        LocalDateTime localDateTime = LocalDateTime.now();
//
//        System.out.println(localDate);
//        System.out.println(localTime);
//        System.out.println(localDateTime);

//        LocalDate localDate = LocalDate.now();
//        localDate = localDate.plusYears(10);
//        System.out.println(localDate.plusYears(-10));
//        System.out.println(localDate.withYear(2000));


//        LocalDate localDate1 = LocalDate.now();
//        LocalDate localDate2 = LocalDate.now().plusYears(-1);

        /// ----------- 2000 ----------- 2020 -2021-now------- 2030
//        System.out.println(localDate1.isBefore(localDate2));


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.format(dateTimeFormatter));
    }

    public static int test() {
        return 10;
    }
}
