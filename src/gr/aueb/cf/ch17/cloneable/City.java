package CodingFactory23A.src.gr.aueb.cf.ch17.cloneable;

public class City implements Cloneable {
    private String name;

    public City() {}

    public City(String name) {
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
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (City) super.clone();  // Object.clone()
    }
}
