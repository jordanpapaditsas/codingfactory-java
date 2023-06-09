package CodingFactory23A.src.gr.aueb.cf.ch11;

/**
 *  Aggregation / Composition
 */
public class Circle {
    private gr.aueb.cf.ch11.Point center;
    private int radius;

    public Circle() {

    }

    public Circle(gr.aueb.cf.ch11.Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public gr.aueb.cf.ch11.Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(gr.aueb.cf.ch11.Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
