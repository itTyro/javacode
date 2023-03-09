package staticDemo2;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan",23,"nan");
        Student s2 = new Student("lisi",28,"nan");
        Student s3 = new Student("wangwu",25,"nan");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.getMaxAge(list);

        System.out.println(maxAge);
    }
}
