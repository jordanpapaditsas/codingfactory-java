package gr.aueb.cf.ch16;

/**
 *  Tightly coupled.
 */
public class SpeakingSchool {
    private Cat cat = new Cat();

    public SpeakingSchool() {
        cat = new Cat();
    }

    public void LearnToSpeak() {
        cat.speak();
    }
}
