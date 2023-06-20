package CodingFactory23A.src.gr.aueb.cf.ch17.callback;

public class Knight implements IKnight{

    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();
    }
}
