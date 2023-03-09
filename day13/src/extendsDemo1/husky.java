package extendsDemo1;

public class husky extends Dog{
    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }
    public void takeHome() {
        System.out.println("拆家");
    }
    public void method() {
        eat();
        drink();
        lookHome();
        takeHome();
    }
}
