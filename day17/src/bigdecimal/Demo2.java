package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo2 {
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(8.23);
        BigDecimal bd2 = BigDecimal.valueOf(8.34);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);
        System.out.println(bd1.multiply(bd2));
//        System.out.println(bd1.divide(bd2));
        System.out.println(bd1.divide(bd2,2, RoundingMode.HALF_UP));
    }
}
