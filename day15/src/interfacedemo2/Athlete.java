package interfacedemo2;

public abstract class Athlete extends People{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void learn();
}
