package gr.aueb.cf.ch16;

public class CompactDisk implements Item {
    private int id;
    private String title;

    public CompactDisk() {}

    public CompactDisk(int id, String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CompactDisk{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
