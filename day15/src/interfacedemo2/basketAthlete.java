package interfacedemo2;

public class basketAthlete extends Athlete{
    public basketAthlete() {
    }

    public basketAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学蓝球");
    }
}
