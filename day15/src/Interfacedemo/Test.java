package Interfacedemo;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙", 1);
        f.swim();
        f.eat();
        System.out.println(f.getName() + ", " + f.getAge());

        Dog d = new Dog("阿拉斯加",3);
        System.out.println(d.getAge() + "岁的" + d.getName());
        d.eat();
        d.swim();

        Rabbit r = new Rabbit("小兔",1);
        System.out.println(r.getAge() + "岁的" + r.getName());
        r.eat();


    }
}
