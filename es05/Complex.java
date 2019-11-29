package es05;

//import java.util.Math;

public class Complex {

    private double re;
    private double im;

    public Complex() {
        this(0, 1);
    }

    public Complex(double re) {
        this(re, 1);
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex somma(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex sottrai(Complex c) {
        return somma(c);
    }

    public double distanza(Complex c) {
        return Math.sqrt(((re - c.re)*(re - c.re)) +
                          (im - c.im)*(im - c.im));
    }

    public String toString() {
        return re + (im < 0? " - i" + (-im) : " + i" + im); 
    }

    public static void main(String args[]) {

        Complex c1 = new Complex(3,7);
        Complex c2 = new Complex(2);
        Complex c3 = new Complex();
        Complex c4 = new Complex(0,-5.2);

        System.out.println(c1 + "\n" + c2 + "\n" + c3 + "\n" + c4);
        System.out.println("------");
        System.out.println(c1.somma(c2) + "\n" + c2.somma(c3));
        System.out.println(c1.distanza(c2));
        System.out.println(c4.distanza(c3));

    }

}