package booksSysrem;

import studentSystem.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class BooksSystem {
    public static void main(String[] args) {
        //1、提供操作菜单，可以选择要进行的操作。
        //
        //2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
        //
        //3、可以查询图书，显示所有图书信息，然后返回到菜单。
        //
        //4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
        //
        //5、可以删除图书，通过编号删除，删除成功后，返回到菜单。
        //
        //6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
        //
        //7、可以退出系统，结束程序运行。

        ArrayList<Books> list = new ArrayList<>();


        while (true) {
            System.out.println("-------------欢迎来到图书管理系统---------------");
            System.out.println("1: 添加图书");
            System.out.println("2: 查询所有图书");
            System.out.println("3: 根据书名查询信息");
            System.out.println("4: 删除图书");
            System.out.println("5: 修改图书");
            System.out.println("6: 退出系统");

            //键盘接收用户录入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择: ");
            String choose = sc.next();

            //根据用户录入来选择
            switch (choose) {
                case "1" -> addBooks(list);
                case "2" -> queryBooks(list);
                case "3" -> nameQueryBooks(list);
                case "4" -> deleteBooks(list);
                case "5" -> updateBooks(list);
                case "6" -> {
                    System.out.println("退出");
                    System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("没有这个选择");
            }
        }
    }

    //添加图书,  可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
    public static void addBooks(ArrayList<Books> list) {
        Books b = new Books();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("请输入编号");
            String id = sc.next();
            //判断id是否存在
            boolean flag = contains(list, id);
            if (flag) {
                //存在则循环重新输入
                System.out.println("编号" + id + "存在,重新输入");

            }else {
                //不存在则添加并跳出循环进行下一步操作
                b.setId(id);
                 break;
            }
        }

        System.out.println("请输入书名");
        String name = sc.next();
        b.setName(name);

        System.out.println("请输入作者");
        String author = sc.next();
        b.setAuthor(author);

        System.out.println("请输入价格");
        String price = sc.next();
        b.setPrice(price);

        //将学生对象添加到集合
        list.add(b);

        System.out.println("图书添加成功");
    }

    //查询所有图书信息
    public static void queryBooks(ArrayList<Books> list) {

        //判断有无要查询的学生信息
        if (list.size() == 0) {
            System.out.println("无图书信息,请添加后再查询");
            return;
        }

        //打印字段名
        System.out.println("图书编号\t\t书名\t作者\t价格");
        //循环输出信息
        for (int i = 0; i < list.size(); i++) {
            Books book = list.get(i);
            System.out.println(book.getId() + "\t" + "\t" + book.getName() + "\t" + book.getAuthor() + "\t" + book.getPrice());
        }
    }

    //根据书名查询图书信息
    public static void nameQueryBooks(ArrayList<Books> list) {

        if (list.size() == 0) {
            System.out.println("无图书信息,请添加后再查询");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查询信息的图书名");
        String name = sc.next();
        //图书的索引值进行查询 同时也能知道查询的图书是否存在,存在返回索引,不存在返回-1
        int nameIndex = getNameIndex(list, name);
        if (nameIndex == -1) {
            System.out.println("您要查询的书名信息不存在");
            return;
        }
        Books book = list.get(nameIndex);
        System.out.println(name + "的信息");
        System.out.println("图书编号\t\t书名\t作者\t价格");
        System.out.println(book.getId() + "\t" + "\t" + book.getName() + "\t" + book.getAuthor() + "\t" + book.getPrice());

    }

    //删除图书  通过编号删除，删除成功后，返回到菜单。
    public static void deleteBooks(ArrayList<Books> list) {

        if (list.size() == 0) {
            System.out.println("无图书信息,请添加后再查询");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的图书编号");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("编号不存在");
            return;
        }
        list.remove(index);
        System.out.println("编号" + id + "的图书删除成功");
    }

    //修改图书
    public static void updateBooks(ArrayList<Books> list) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入要修改的图书信息的编号");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("编号不存在");
            return;
        }

        Books book = list.get(index);

        System.out.println("输入修改的书名");
        String newName = sc.next();
        book.setName(newName);

        System.out.println("输入修改的作者");
        String newAuthor = sc.next();
        book.setAuthor(newAuthor);

        System.out.println("输入修改的价格");
        String newPrice = sc.next();
        book.setPrice(newPrice);

        System.out.println("修改成功");

    }

    //判断图书id是否存在
    public static boolean contains(ArrayList<Books> list,String id) {
        return getIndex(list,id) >= 0;
    }

    //求出编号所在的索引值
    public static int getIndex(ArrayList<Books> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            boolean flag = list.get(i).getId().equals(id);
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    //求出书名所在的索引值
    public static int getNameIndex(ArrayList<Books> list,String name) {
        for (int i = 0; i < list.size(); i++) {
            boolean flag = list.get(i).getName().equals(name);
            if (flag) {
                return i;
            }
        }
        return -1;
    }
}
