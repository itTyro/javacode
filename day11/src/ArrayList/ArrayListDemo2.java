package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();

            s.setName(name);
            s.setAge(age);

            list.add(s);
        }


        for (int i = 0; i < list.size(); i++) {

            if (i == list.size() -1) {
                System.out.println(list.get(i).getName() + list.get(i).getAge());
            } else {
                System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
            }
        }

    }
}
