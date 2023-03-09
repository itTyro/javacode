package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();

            //添加到学生对象
            s.setName(name);
            s.setAge(age);

            //添加到集合
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }

    }
}
