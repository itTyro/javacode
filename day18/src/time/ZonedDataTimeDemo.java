package time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDataTimeDemo {
    public static void main(String[] args) {
        //获取当前时间加地区    //2022-11-01T16:13:42.385741+08:00[Asia/Shanghai]
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //of指定时间
        ZonedDateTime zdt1 = ZonedDateTime.of(2023, 01, 1,
                11, 11, 11, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(zdt1);

        //通过instant + ZoneId.of获取指定时间加时区ofInstant()
        Instant instant1 = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zdf2 = ZonedDateTime.ofInstant(instant1, zoneId);
        System.out.println(zdf2);

        //with修改数据
        ZonedDateTime time1 = zdf2.withYear(2023);
        System.out.println(time1);

        //minus减少时间
        ZonedDateTime time2 = zdf2.minusYears(1L);
        System.out.println(time2);

        //plus增加时间
        ZonedDateTime time3 = zdf2.plusYears(1L);
        System.out.println(time3);
    }
}
