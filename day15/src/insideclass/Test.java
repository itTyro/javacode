package insideclass;

public class Test {
    public static void main(String[] args) {

//        Outer.Inner oi = new Outer().new Inner();
//        oi.age = "10";
//
        Outer o = new Outer();
        o.i.age = "10";
        System.out.println(o.i.age);
    }
}
