package es06;

import es07.Scalable;

public class Rectangle implements Scalable {

    private float width;
    private float length;

    public Rectangle(float width, float length) 
            throws IllegalArgumentException {
        setWidth(width);
        setLength(length);
    }

    public void setWidth(float width) 
            throws IllegalArgumentException  {
        if (width < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        this.width = width;
    }

    public void setLength(float length) 
            throws IllegalArgumentException {
        if (length < 0) {
            throw new IllegalArgumentException("length < 0");
        }
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