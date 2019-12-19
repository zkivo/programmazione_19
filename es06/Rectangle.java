package es06;

public class Rectangle {

    private float width;
    private float length;

    public void setWidth(float width) {
        this.width = width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getArea() {
        return width * length;
    }

    public float getWidth() {
        return width;
    }

    public float getPerimetro() {
        return width * 2 + length * 2;
    }

    public String toString() {
        return "Rettangolo: altezza=" + length + ", base=" + width;
    }

}