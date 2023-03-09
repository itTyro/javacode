package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",19);
        Student s3 = new Student("wangwu",20);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }

    }
}
