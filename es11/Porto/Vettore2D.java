package es11.Porto;

public class Vettore2D {

    private double x;
    private double y;

    public Vettore2D(Vettore2D vettore) {
        setX(vettore.getX());
        setY(vettore.getY());
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public Vettore2D(double x, double y) {
        setX(x);
        setY(y);
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

}
