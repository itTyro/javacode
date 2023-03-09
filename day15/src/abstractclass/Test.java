package abstractclass;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙",2);
        System.out.println(f.getName() + f.getAge());
        f.eat();
        f.drink();

        Dog d = new Dog("小狗",3);
        System.out.println(d.getName() + d.getAge() + "岁");
        d.eat();
        d.drink();

        Sheep s = new Sheep("山羊",5);
        System.out.println(s.getName() + s.getAge() + "岁");
        s.eat();
        s.drink();
    }
}
