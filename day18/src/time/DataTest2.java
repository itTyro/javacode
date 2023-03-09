package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest2 {
    public static void main(String[] args) throws ParseException {
        String str1 = "2022年11月11日 00:00:00";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1 = sdf1.parse(str1);
        long time = d1.getTime();
        System.out.println(time);
    }
}
