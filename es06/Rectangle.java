package es06;

import es07.Scalable;

public class Rectangle implements Scalable {

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

    public float getLength() {
        return length;
    }

    public float getPerimetro() {
        return width * 2 + length * 2;
    }

    public void scale(double factor) {
        length *= (float) factor;
        width  *= (float) factor;
    }

    public void draw() {
        System.out.println(toString());
    }

    public String toString() {
        return "Rettangolo: altezza=" + length + ", base=" + width;
    }

}