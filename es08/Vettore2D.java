package es08;

public class Vettore2D {

    private double x;
    private double y;

    public Vettore2D() {
        this(0,0);
    }

    public Vettore2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";    
    }

}