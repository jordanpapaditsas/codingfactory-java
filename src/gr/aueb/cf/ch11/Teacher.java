package CodingFactory23A.src.gr.aueb.cf.ch11;

/**
 *  This is a {@link Teacher} Java Bean.
 *  POJO  (Plain Old Java Object).
 */
public class Teacher {
    private long id;
    private String firstname;
    private String lastname;

    public Teacher() {          // Default Constructor (auto initialization
        id = 0;
        firstname = null;
        lastname = null;
    }

    public Teacher(long id, String firstname, String lastname) {     // Overloaded Constructor
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
