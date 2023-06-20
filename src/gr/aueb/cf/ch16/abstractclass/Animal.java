package CodingFactory23A.src.gr.aueb.cf.ch16.abstractclass;

public abstract class Animal {
    private long id;
    private String name;

    public Animal () {}

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();

    public void eat() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public abstract String toString();
}
