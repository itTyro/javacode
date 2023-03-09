package time;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest4 {
    public static void main(String[] args) throws ParseException {
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String order = "2023年11月11日 0:09:0";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startData = sdf1.parse(start);
        Date endData = sdf1.parse(end);
        Date orderData = sdf1.parse(order);

        long startTime = startData.getTime();
        long endTime = endData.getTime();
        long orderTime = orderData.getTime();



        if (orderTime >= startTime && orderTime <= endTime) {
            System.out.println("参与秒杀成功");
        }else {
            System.out.println("参与秒杀失败");
        }
    }
}
