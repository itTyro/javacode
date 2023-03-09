package interfacedemo2;

public class PingPongAthlete extends Athlete implements SpeakEnglish{
    public PingPongAthlete() {
    }

    public PingPongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学乒乓球");
    }

    @Override
    public void speakEnglish() {

        System.out.println("说英语");
    }
}
