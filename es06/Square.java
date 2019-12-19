package es06;

public class Square extends Rectangle {

    public Square(float width) {
        setWidth(width);
        setLength(width);
    }

    public String toString() {
        return "Quadrato di lato: "  + this.getWidth();
    }

}