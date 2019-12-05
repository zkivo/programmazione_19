package es06;

public class Plane {

    private Point3D A;
    private Point3D B;
    private Point3D C;

    public Plane(Point3D A, Point3D B, Point3D C) {
        this.A = new Point3D(A);
        this.B = new Point3D(B);
        this.C = new Point3D(C);
    }

}