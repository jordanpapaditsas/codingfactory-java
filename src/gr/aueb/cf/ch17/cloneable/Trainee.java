package CodingFactory23A.src.gr.aueb.cf.ch17.cloneable;

public class Trainee implements Cloneable {
    private String name;
    private City city;

    Trainee() {}

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Trainee) super.clone();
    }
}
