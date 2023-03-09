package polymorphicDemo1;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王",30);
        Animal d = new Dog(2,"黑");
        p.keepPet(d,"骨头");
        Person p2 = new Person("老李",25);
        Animal c = new Cat(3,"灰");
        p2.keepPet(c,"鱼");
    }
}
