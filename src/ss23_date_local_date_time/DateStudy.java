package ss23_date_local_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStudy {
    public static void main(String[] args) {
        String dateOfBirth = "20/10/2022";
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(simpleDateFormat.format(date)); // dd/MM/yyyy => 01/01/2022

    }
}
