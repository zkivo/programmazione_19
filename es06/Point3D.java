package es06;

public class Point3D extends Point2D {

    private float z;

    public Point3D(Point3D point) {
        super(point.getX(), point.getY());
        z = point.getZ();
    }

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

}