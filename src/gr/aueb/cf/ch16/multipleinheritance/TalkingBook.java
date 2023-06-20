package CodingFactory23A.src.gr.aueb.cf.ch16.multipleinheritance;

public class TalkingBook implements ISpeakable, IReadable {
    @Override
    public void read() {
        System.out.println("Read");

    }

    @Override
    public void speak() {
        System.out.println("Speak");

    }
}
