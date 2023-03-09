package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //增
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //删
//        list.remove("aaa");
//        String s = list.remove(1);
//        System.out.println(s);

        //改
//        String s = list.set(0, "AAA");
//        System.out.println(s);

        //查
//        String s = list.get(0);
//        System.out.println(s);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }


        System.out.println(list);
    }
}
