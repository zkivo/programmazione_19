 package es04;

import java.util.Scanner;

public class Punto {

    private double x;
    private double y;

    public Punto(Punto p) {
        this(p.x, p.y);
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Punto p) {
        if (x == p.x && y == p.y) return true;
        else return false;
    }

    public double distanza(Punto p) {
        return Math.sqrt((p.x - x)*(p.x - x)+
                         (p.y - y)*(p.y - y));
    }

    public Punto puntoMedio(Punto p) {
        return new Punto((p.x + x)/2, (p.y + y)/2);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Punto p1, p2;
        System.out.print("Inserisci le coordinate del primo punto " +
                         "separate da uno spazio\n>>"); 
        p1 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Inserire il secondo punto\n>>");
        p2 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Distanza: " + p1.distanza(p2));
        System.out.println("Punto medio: " + p1.puntoMedio(p2));
        System.out.println(p1.equals(p2) ? "I due punti sono uguali." :
                                           "I due punto sono diversi.");
    }

 }