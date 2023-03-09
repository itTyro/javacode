package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<Phone>();
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> result = getPhoneInfo(list);

        for (int i = 0; i < result.size(); i++) {
            Phone s = result.get(i);
            System.out.println(s.getBrand() + ", " + s.getPrice());
        }
    }
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        //创建集合容器接收才可以返回两个值
        ArrayList<Phone> resultList = new ArrayList<Phone>();
        //遍历集合中的每一个对象中的价格
         for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            if (p.getPrice() < 3000) {
                resultList.add(p);
            }
        }
         return resultList;
    }
}
