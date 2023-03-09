package test;

import java.awt.*;

//定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
//
//学生的属性：学号，姓名，年龄。
//
//要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
//
//要求2：添加完毕之后，遍历所有学生信息。
//
//要求3：通过id删除学生信息
//
//​             如果存在，则删除，如果不存在，则提示删除失败。
//
//要求4：删除完毕之后，遍历所有学生信息。
//
//要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
public class StudentText {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student(001,"zhansan",18);
        Student s2 = new Student(002,"lisi",19);
        Student s3 = new Student(003,"wangwu",20);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。

        Student s4 = new Student(004,"zhaoliu",21);

        boolean flag = contains(arr,s4.getId());

        if (flag) {

        } else {
            System.out.println("id一样,不进行添加");
        }
    }

    //创建方法判断id是否重复
    public static boolean contains(Student[] arr,int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                return false;
            }
        }
        return true;
    }

    //创建方法判断数组有没有存满

    public static int getCount(Student[] arr) {

    }
}
