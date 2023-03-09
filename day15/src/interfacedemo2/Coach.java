package interfacedemo2;

public abstract class Coach extends People{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
