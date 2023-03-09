package time;

import java.util.Calendar;

public class DataTest3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();


//        c.add(Calendar.MONTH,1);
        c.set(Calendar.MONTH,11);
        System.out.println(c);

    }
}
