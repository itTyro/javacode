package extendsDemo1;

public class Sand extends Dog{
    @Override
    public void eat() {
        System.out.println("吃狗粮,吃骨头");
    }
    public void method() {
        eat();
        drink();
        lookHome();
    }
}
