package biginteger;

import java.math.BigInteger;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        BigInteger gb1 = new BigInteger("98899999999999999999");
        BigInteger gb2 = new BigInteger(4,new Random());
        BigInteger gb3 = new BigInteger("100",2);
        System.out.println(gb1);
        System.out.println(gb2);
        System.out.println(gb3);

        System.out.println(BigInteger.valueOf(787827872223L));

        //-16~16不会重新创建BigInteger对象,地址复用
        BigInteger gb5 = BigInteger.valueOf(16);
        BigInteger gb4 = BigInteger.valueOf(16);
        System.out.println(gb4 == gb5);

        BigInteger gb6 = BigInteger.valueOf(17);
        BigInteger gb7 = BigInteger.valueOf(17);
        System.out.println(gb6 == gb7);

        //对象一旦创建不能修改里面的值,而是产生一个新的BigInteger
        BigInteger gb8 = BigInteger.valueOf(1);
        BigInteger gb9 = BigInteger.valueOf(2);
        System.out.println(gb8.add(gb9));
        System.out.println(gb8);
        System.out.println(gb9);
    }
}
