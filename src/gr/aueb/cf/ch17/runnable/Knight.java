package CodingFactory23A.src.gr.aueb.cf.ch17.runnable;

public class Knight implements IKnight, Runnable {
    private static final IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new RescueTheCaptiveMission()
    };

    private String name;

    public Knight() {}

    public Knight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void embarkOnMission(IMission mission) {
        System.out.println(name + ": ");
        mission.embark();
        mission.setStatus(MissionStatus.STARTED);
    }

    @Override
    public void run() {
        synchronized (missions) {
            // critical section
            for (IMission mission : missions) {
                if (mission.getStatus() == MissionStatus.NOT_STARTED) {
                    this.embarkOnMission(mission);
                    break;
                }
            }
        }
    }
}
