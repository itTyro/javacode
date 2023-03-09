package time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        //获取现在的世界标准时间
        Instant instant1 = Instant.now();
        System.out.println(instant1);


        Instant instant2 = Instant.ofEpochMilli(1000L);//毫秒
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1);
        System.out.println(instant3);//秒

        //指定时区的时间
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //isBefore: 判断调用者代表的时间是不是在参数表示的时间前面面
        boolean result1 = instant1.isBefore(instant2);
        System.out.println(result1);

        //isAfter: 判断调用者代表的时间是不是在参数表示的时间后面
        boolean result2 = instant1.isAfter(instant2);
        System.out.println(result2);

        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = instant4.minusMillis(1000L);
        System.out.println(instant5);
        Instant instant6 = instant4.minusSeconds(2);
        System.out.println(instant6);
    }
}
