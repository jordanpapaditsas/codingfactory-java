package gr.aueb.cf.ch11;

import CodingFactory23A.src.gr.aueb.cf.ch11.Point;

/**
 *  Immutable 3D Point.
 */
public final class Point3D {
    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }

    public int getZ() {
        return z;
    }

}
