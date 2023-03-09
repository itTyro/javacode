package interfacedemo2;

public class PingPongCoach extends Coach implements SpeakEnglish {
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speakEnglish() {

        System.out.println("说英语");
    }
}
