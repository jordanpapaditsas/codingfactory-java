package CodingFactory23A.src.gr.aueb.cf.ch1.model;

/**
 *  Point Java Bean.
 */
public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String convertToString() {
        return "Point{" + "x= " + x + ", y= " + y + '}';
    }
}
