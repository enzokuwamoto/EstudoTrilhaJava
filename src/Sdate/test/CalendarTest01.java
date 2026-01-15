package Sdate.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Sunday is the first day of the week");
        }
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK);

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.HOUR, 10);
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(calendar);
    }

    public static class DateTest01 {
        static void main(String[] args) {
            Date date = new Date(1764163266123L);
            long msAtual = date.getTime();
            System.out.println(date);
        }
    }
}
