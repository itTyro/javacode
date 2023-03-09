package interfacedemo2;

public class Test {
    public static void main(String[] args) {
        PingPongAthlete pa = new PingPongAthlete("张三",23);
        pa.learn();
        pa.speakEnglish();
        System.out.println(pa.getAge() + ", " + pa.getName());
        PingPongCoach pc = new PingPongCoach("李四", 34);
        pc.teach();
        pc.speakEnglish();
        System.out.println(pc.getAge() + ", " + pc.getName());
    }
}
