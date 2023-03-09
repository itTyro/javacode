package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDemo1 {
    public static void main(String[] args) throws ParseException {

        String str = "2022年11月11日 11时11分11秒";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date d1 = sdf.parse(str);
        System.out.println(d1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒EE");
        System.out.println(sdf2.format(d1));
    }

    private static void mathad() {
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        System.out.println(sdf1.format(d1));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒E");
        System.out.println(sdf2.format(d1));
    }
}
