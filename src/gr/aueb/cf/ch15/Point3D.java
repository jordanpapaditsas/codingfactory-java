package CodingFactory23A.src.gr.aueb.cf.ch15;

public class Point3D extends Point2D {
    private int z;

    public Point3D() {
        // super();
        // z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);  // Constructor chaining
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

   /* @Override
    public String convertToString() {
        return super.convertToString() + "(" + z + ")";
    } */

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z =+ 1;
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }
}
