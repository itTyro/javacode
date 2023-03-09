package time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        //获取当前时间
        ZonedDateTime time1 = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        //解析/格式化器
        DateTimeFormatter result = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH点mm分ss秒 E a");
        //格式化
        System.out.println(result.format(time1));
    }
}
