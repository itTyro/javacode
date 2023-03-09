package Demo;

public class UserTest {
    public static void main(String[] args) {
        User us = new User("林志龙","123456","123@qq.com","男",26);
        System.out.println(us.getUsername());
        System.out.println(us.getPassword());
        System.out.println(us.getEmail());
        System.out.println(us.getGender());
        System.out.println(us.getAge());

    }
}
