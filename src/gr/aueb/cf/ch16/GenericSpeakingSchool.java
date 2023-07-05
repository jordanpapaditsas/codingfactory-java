package gr.aueb.cf.ch16;

/**
 *  Loosely coupled.
 */
public class GenericSpeakingSchool {
    private final CodingFactory23A.src.gr.aueb.cf.ch16.multipleinheritance.ISpeakable speakable;

    // Dependency Injection
    // IoC - Inversion of Control
    public GenericSpeakingSchool(CodingFactory23A.src.gr.aueb.cf.ch16.ISpeakable speakable) {
        this.speakable = (CodingFactory23A.src.gr.aueb.cf.ch16.multipleinheritance.ISpeakable) speakable;
    }

    public void learnToSpeak() {
        speakable.speak();
    }
}
