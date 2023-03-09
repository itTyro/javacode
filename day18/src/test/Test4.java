package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {

        //JDK7以前
        /*String birthday = "2003年5月28号";
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy年MM月dd号");
        Date date = sdf1.parse(birthday);

        long birthdayTime = date.getTime();

        long todayTime = System.currentTimeMillis();

        long result = todayTime - birthdayTime;

        int day = 1000 * 60 * 60 * 24;
        long resultTime = result / day;

        System.out.println(resultTime);*/


        //JDK8以后

        LocalDate now = LocalDate.now();//获取现在的日期
        System.out.println(now);

        LocalDate birthday1 = LocalDate.of(2003, 5, 28);
        LocalDate birthday2 = LocalDate.of(2005, 10, 15);

        //获取两个时间相隔的时间,第二个参数减第一个参数
        long day1 = ChronoUnit.DAYS.between(birthday1, now);
        long day2 = ChronoUnit.DAYS.between(birthday2, now);

        System.out.println("我出生的天数: " + day1);
        System.out.println("宝贝出生的天数: " + day2);

        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime birthdayDateTime1 = LocalDateTime.of(2003, 5, 28, 0, 0, 0);
        LocalDateTime birthdayDateTime2 = LocalDateTime.of(2005, 10, 15, 0, 0, 0);

        long months1 = ChronoUnit.MONTHS.between(birthdayDateTime1, dateTime);
        long months2 = ChronoUnit.MONTHS.between(birthdayDateTime2, dateTime);

        long weeks1 = ChronoUnit.WEEKS.between(birthdayDateTime1, dateTime);
        long weeks2 = ChronoUnit.WEEKS.between(birthdayDateTime2, dateTime);

        long millis1 = ChronoUnit.MILLIS.between(birthdayDateTime1, dateTime);
        long millis2 = ChronoUnit.MILLIS.between(birthdayDateTime2, dateTime);

        long second1 = ChronoUnit.SECONDS.between(birthdayDateTime1, dateTime);
        long second2 = ChronoUnit.SECONDS.between(birthdayDateTime2, dateTime);

        long minutes1 = ChronoUnit.MINUTES.between(birthdayDateTime1, dateTime);
        long minutes2 = ChronoUnit.MINUTES.between(birthdayDateTime2, dateTime);

        System.out.println("现在是:" + dateTime);
        System.out.println("我出生的月数: " + months1);
        System.out.println("宝贝出生的月数: " + months2);
        System.out.println("我出生的周数: " + weeks1);
        System.out.println("宝贝出生的轴数: " + weeks2);
        System.out.println("我出生的秒数: " + second1);
        System.out.println("宝贝出生的秒数: " + second2);
        System.out.println("我出生的毫秒数: " + millis1);
        System.out.println("宝贝出生的毫秒数: " + millis2);
        System.out.println("我出生的分钟数: " + minutes1);
        System.out.println("宝贝出生的分钟数: " + minutes2);
    }
}
