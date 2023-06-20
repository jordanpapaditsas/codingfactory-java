package gr.aueb.cf.ch16;

public class SpeakingSchoolApp {
    ISpeakable whiteCat = new Cat("White cat");
    ISpeakable blackDog = new Dog("Black dog");

    // Wiring
    GenericSpeakingSchool catSchool = new GenericSpeakingSchool(whiteCat);
    GenericSpeakingSchool dogSchool = new GenericSpeakingSchool(blackDog);
}
