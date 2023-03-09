package bigdecimal;

import java.math.BigDecimal;

public class Demo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(0.1);
        System.out.println(bd1);

        BigDecimal bd2 = new BigDecimal("0.23");
        System.out.println(bd2);
        BigDecimal bd3 = new BigDecimal("0.58");
        System.out.println(bd2.add(bd3));

        BigDecimal bd5 = BigDecimal.valueOf(8);
        BigDecimal bd4 = BigDecimal.valueOf(8);
        System.out.println(bd4);
        System.out.println(bd4 == bd5);

        BigDecimal bd6 = BigDecimal.valueOf(8.0);
        BigDecimal bd7 = BigDecimal.valueOf(8.0);
        System.out.println(bd6);
        System.out.println(bd6 == bd7);
    }
}
