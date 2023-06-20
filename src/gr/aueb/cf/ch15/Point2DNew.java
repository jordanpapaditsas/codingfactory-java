package CodingFactory23A.src.gr.aueb.cf.ch15;

/**
 *  Composition & Forwarding
 *  Wrapper & Decoration
 *  Delegation
 */
public class Point2DNew {
    // Composition - private instance
    private Point point;
    private int y;

    public Point2DNew() {}

    public Point2DNew(Point point, int y) {
        this.point = point;
        this.y = y;
    }

    public Point getPoint() {
        return point;
    }

    public int getY() {
        return y;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Forwarding
    public void movePlus10() {
        point.movePlus10();
        y += 10;
    }

    public void movePlusOne() {
        point.movePlusOne();
        y += 1;
    }
}
