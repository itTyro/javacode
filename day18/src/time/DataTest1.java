package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest1 {
    public static void main(String[] args) throws ParseException {
        String str1 = "2003-01-23 11:11:11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf1.parse(str1);
        System.out.println(d1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss");
        System.out.println(sdf.format(d1));
    }
}
