package gr.aueb.cf.ch16;

public class SpeakingSchoolApp {
    CodingFactory23A.src.gr.aueb.cf.ch16.ISpeakable whiteCat = (CodingFactory23A.src.gr.aueb.cf.ch16.ISpeakable) new CodingFactory23A.src.gr.aueb.cf.ch16.Cat("White cat");
    CodingFactory23A.src.gr.aueb.cf.ch16.ISpeakable blackDog = (CodingFactory23A.src.gr.aueb.cf.ch16.ISpeakable) new CodingFactory23A.src.gr.aueb.cf.ch16.Dog("Black dog");

    // Wiring
    GenericSpeakingSchool catSchool = new GenericSpeakingSchool(whiteCat);
    GenericSpeakingSchool dogSchool = new GenericSpeakingSchool(blackDog);
}
