package es06; 

public class Circle {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) Math.PI * radius * radius; 
    }

    public float getPerimetro() {
        return 2 * (float) Math.PI * radius; 
    }

    public String toString() {
        return "Cerchio di raggio: " + radius;
    }

}