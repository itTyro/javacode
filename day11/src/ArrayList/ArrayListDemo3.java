package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<User>();
        User u1 = new User("heima001","zhangsan","123456");
        User u2 = new User("heima002","lisi","12345678");
        User u3 = new User("heima003","wangwu","123456asd");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        boolean flag = contains(list, "heima002 ");
        System.out.println(flag);

        int index = getIndex(list, "heima001");
        System.out.println(index);

    }

    public static boolean contains(ArrayList<User> list,String id) {
        //直接算出是否存在
//        for (int i = 0; i < list.size(); i++) {
//            boolean flag = list.get(i).getId().equals(id);
//
//            if (flag) {
//                return true;
//            }
//        }
//        return false;

        //直接调用方法
        int index = getIndex(list, id);
        if (index != -1) {
            return true;
        }
        return false;
    }

    public static int getIndex(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            boolean flag = list.get(i).getId().equals(id);
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
