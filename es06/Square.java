package es06;

public class Square extends Rectangle {

    public Square(float width) {
        setWidth(width);
        setLength(width);
    }

    public void scale(double factor) {
        float temp = getLength() * (float) factor; 
        setLength(temp);
        setWidth(temp);
    }

    public void draw() {
        System.out.println(toString());
    }

    public String toString() {
        return "Quadrato di lato: "  + this.getWidth();
    }

}