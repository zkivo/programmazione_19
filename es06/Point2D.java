package es06;

public class Point2D {

    private float x;
    private float y;

    public Point2D(Point2D point) {
        this.x = point.x;
        this.y = point.y;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}