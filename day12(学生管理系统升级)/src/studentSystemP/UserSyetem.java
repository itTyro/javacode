package studentSystemP;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserSyetem {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作 1登录 2注册 3忘记密码 4退出");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1" ->sign_in(list);
                case "2" ->register(list);
                case "3" ->forget(list);
                case "4" ->{
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> {
                    System.out.println("输入有误,请重新输入");

                }
            }
        }
    }

    //登录
    public static void sign_in(ArrayList<User> list) {

        System.out.println("欢迎来到登录界面,请输入用户名");
        Scanner sc = new Scanner(System.in);
        //录入用户名
        String username = sc.next();
        int index = getIndex(list,username);
        if (index == -1) {
            System.out.println("用户不存在,请先注册");
            return;
        }

        //录入密码和验证码
        for (int i = 0;i < 3;i++) {
            System.out.println("请输入密码");
            String password = sc.next();

            String checkCode = check();
            System.out.println(checkCode);
            System.out.println("请输入验证码");
            String chCode = sc.next();

            boolean flag1 = list.get(index).getPassword().equals(password);
            boolean flag2 = checkCode.equalsIgnoreCase(chCode);

            if (flag1 && flag2) {
                System.out.println("登录成功");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            } else if (flag1){
                System.out.println("验证码错误,还有" + (2-i) + "次机会");
            } else if (flag2) {
                System.out.println("密码错误,还有" + (2-i) + "次机会");
            } else {
                System.out.println("密码和验证码错误,还有" + (2-i) + "次机会");
            }
        }



    }

    //注册
    public static void register(ArrayList<User> list) {

        User u = new User();
        Scanner sc = new Scanner(System.in);

        String username;
        //判断用户名唯一
        loop:while (true) {
            System.out.println("请输入用户名,长度必须是3~15位,且只能是英文和数字,不能纯数字");
            username = sc.next();
            if (getIndex(list,username) != -1) {
                System.out.println("用户名已存在,请重新输入");
                continue;

            }else if (username.length() < 3 || username.length() > 15) {
                System.out.println("用户名长度不符合要求,请输入长度为3~15位之间");
                continue;
            }
            int count = 0;
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                    if (c >= '0' && c <= '9') {
                        count++;
                    }
                    }else {
                    System.out.println("输入的字符非法");
                    continue loop;
                }
            }
            if (count < username.length()){
                //给user对象的username赋值
                u.setUsername(username);

                break;
            }else{
                System.out.println("不能是纯数字");
            }
        }


        //输入两次密码,判断一致
        while (true) {
            System.out.println("请输入密码");
            String password1 = sc.next();
            System.out.println("请再次输入密码");
            String password2 = sc.next();
            if (password1.equals(password2)){
                //给user的password赋值
                u.setPassword(password2);

                break;
            }else {
                System.out.println("两次的密码输入不同,请重新输入");
            }
        }


        //录入身份证并判断是否合法
        while (true) {
            System.out.println("请输入身份证");
            String id = sc.next();
            if (judgeId(id)) {
                u.setId(id);
                break;
            }else {
                System.out.println("身份证非法,请重新输入");
            }
        }


        //录入手机号码
        while (true) {
            System.out.println("请输入手机号码");
            String phoneNumber = sc.next();
            if (judgePhone(phoneNumber)) {
                u.setPhoneNumber(phoneNumber);
                break;
            }else {
                System.out.println("输入的手机号码非法");
            }

        }

        //将学生对象添加到集合
        list.add(u);

        System.out.println("注册成功");

    }

    //忘记密码
    public static void forget(ArrayList<User> list) {

        Scanner sc = new Scanner(System.in);

        //输入用户名
        System.out.println("请输入用户名");
        String username = sc.next();

        //判断用户名是否存在
        int index = getIndex(list, username);
        if (index == -1) {
            System.out.println("用户名" + username + "未注册");
            return;
        }

        //录入身份证
        System.out.println("请输入身份证");
        String id = sc.next();
        //录入手机号码
        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();

        boolean flag1 = list.get(index).getId().equals(id);
        boolean flag2 = list.get(index).getPhoneNumber().equals(phoneNumber);

        //判断身份证和手机号码是否正确
        if (!(flag1 && flag2)) {
            System.out.println("账号信息不匹配,修改失败");
            return;
        }

        //代码执行到这一步说明信息与账号匹配

        System.out.println("请输入修改的密码");
        String newPassword = sc.next();
        list.get(index).setPassword(newPassword);
        System.out.println("密码修改成功");


    }

    //判断用户名是否存在
    public static int getIndex(ArrayList<User> list,String username) {

        for (int i = 0; i < list.size(); i++) {
            boolean flag = list.get(i).getUsername().equals(username);
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    //判断身份证是否合法
    public static boolean judgeId(String id) {
        if (id.length() == 18) {
            if (id.charAt(0) != 0) {
                for (int i = 0; i < id.length() - 1; i++) {
                    char c = id.charAt(i);
                    if (c >= '0' && c <= '9'){

                    }else return false;
                }
                char c = id.charAt(id.length() - 1);
                if (c >= '0' && c <= '9' || c == 'X' || c == 'x'){
                    return true;
                }
            }
        }
        return false;
    }

    //手机号码验证
    public static boolean judgePhone(String phoneNumber) {
        if (phoneNumber.length() == 11) {
            if (phoneNumber.charAt(0) != 0) {
                for (int i = 0; i < phoneNumber.length(); i++) {
                    char c = phoneNumber.charAt(i);
                    if (c >= '0' && c <= '9') {
                        return true;
                    }else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    //验证码
    public static String check() {
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char)(65 + i);
            }else {
                arr[i] = (char)(97 + i - 26);
            }
        }
        //验证码
        StringBuilder sb = new StringBuilder();
        //创建随机数
        Random r = new Random();
        int num = r.nextInt(10);
        //将数字添加到字符串最后一位
        sb.append(num);

        //生成验证码
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr.length);
            sb.append(arr[index]) ;
        }
        String str = sb.toString();
        char[] c = str.toCharArray();
        //打乱验证码顺序
        for (int i = 0; i < str.length(); i++) {
            int index = r.nextInt(str.length());

            char temp = c[i];
            c[i] = c[index];
            c[index] = temp;
        }
        String result = new String(c);
        return result;

    }
}
