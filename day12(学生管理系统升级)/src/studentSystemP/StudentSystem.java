package studentSystemP;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";


    public static void startStudentSystem() {

        ArrayList<Student> list = new ArrayList<>();


        while (true) {
            System.out.println("-------------欢迎来到学生管理系统---------------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出");

            //键盘接收用户录入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择: ");
            String choose = sc.next();

            //根据用户录入来选择
            switch (choose) {
                case ADD_STUDENT -> addStudent(list);
                case DELETE_STUDENT -> deleteStudent(list);
                case UPDATE_STUDENT -> updateStudent(list);
                case QUERY_STUDENT -> queryStudent(list);
                case EXIT -> {
                    System.out.println("退出");
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有这个选择");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {

        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.println("请输入id");
        String id = sc.next();
        while (true) {
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("输入的id重复,请重新输入id");
                id = sc.next();
            } else break;
        }
        stu.setId(id);

        System.out.println("请输入名字");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入年龄");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入家庭地址");
        String address = sc.next();
        stu.setAddress(address);

        list.add(stu);

        System.out.println("学生信息添加成功");

    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为" + id + "的学生信息删除成功");
        }else {
            System.out.println("id为" + id + "的学生信息不存在");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生信息id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("id为" + id + "的学生信息不存在");
            return;
        }
        Student stu = list.get(index);

        System.out.println("请输入修改的姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入修改的年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入修改的地址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息,请添加后再进行查询");
            return;
        }

        System.out.println("id\t\t姓名\t年龄\t家庭住址");

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + "\t" + stu.getAddress());
        }
    }

    //判断id是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            boolean flag = list.get(i).getId().equals(id);
            if (flag) {
                return true;
            }
        }
        return false;
    }

    //找出查询的id的索引
    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            boolean flag = list.get(i).getId().equals(id);
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
