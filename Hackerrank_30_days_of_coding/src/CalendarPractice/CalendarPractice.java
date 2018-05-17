package CalendarPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {

    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,0);


        System.out.println("this->"+Calendar.DATE);
        System.out.println(calendar.getTime());
        SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
        String formatted=format1.format(calendar.getTime());
        System.out.println(formatted);

    }
}
