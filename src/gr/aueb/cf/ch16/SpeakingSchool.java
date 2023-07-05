package gr.aueb.cf.ch16;

/**
 *  Tightly coupled.
 */
public class SpeakingSchool {
    private CodingFactory23A.src.gr.aueb.cf.ch16.Cat cat = new CodingFactory23A.src.gr.aueb.cf.ch16.Cat();

    public SpeakingSchool() {
        cat = new CodingFactory23A.src.gr.aueb.cf.ch16.Cat();
    }

    public void LearnToSpeak() {
        cat.speak();
    }
}
