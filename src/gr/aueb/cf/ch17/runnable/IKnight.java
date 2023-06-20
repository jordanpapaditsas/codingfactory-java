package CodingFactory23A.src.gr.aueb.cf.ch17.runnable;

public interface IKnight {
    void embarkOnMission(IMission mission);

    IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new KillTheDragonMission()
    };

    void run();
}
