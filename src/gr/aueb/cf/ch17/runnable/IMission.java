package CodingFactory23A.src.gr.aueb.cf.ch17.runnable;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus status);
    void embark();
}
