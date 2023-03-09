package extendsDemo1;

public class ZhongHua extends Dog{
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }

    public void method() {
        eat();
        drink();
        lookHome();
    }
}
