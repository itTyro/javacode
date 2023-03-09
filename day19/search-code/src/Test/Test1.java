package Test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        GirlTest1 gf1 = new GirlTest1("xiaohuanghuang", 16, 1.61);
        GirlTest1 gf2 = new GirlTest1("xiaohuanghuang", 18, 1.68);
        GirlTest1 gf3 = new GirlTest1("xiaoqingqing", 18, 1.68);

        GirlTest1[] gf = {gf1, gf2, gf3};

        Arrays.sort(gf, new Comparator<GirlTest1>() {
            @Override
            public int compare(GirlTest1 o1, GirlTest1 o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0) {
                    return 1;
                }else  if (temp < 0) {
                    return -1;
                }else return -1;
            }
        });

        System.out.println(Arrays.toString(gf));
    }
}
