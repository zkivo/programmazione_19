package es04;

import java.util.Scanner;

public class Razionale {

    private int numeratore;
    private int denominatore;

    public Razionale(Razionale r) {
        this.numeratore = r.numeratore;
        this.denominatore = r.denominatore;
    }

    public Razionale(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public Razionale somma(Razionale r){
        return new Razionale((this.numeratore * r.denominatore) + 
                             (this.denominatore * r.numeratore), 
                             this.denominatore * r.denominatore);
    }

    public Razionale sottrai(Razionale r) {
        return somma(new Razionale(-1 * r.numeratore, r.denominatore));
    }

    public Razionale moltiplica(Razionale r) {
        return new Razionale(this.numeratore * r.numeratore, 
                             this.denominatore * r.denominatore);
    }

    public Razionale dividi(Razionale r) {
        return new Razionale(this.numeratore * r.denominatore,
                             this.denominatore * r.numeratore);
    }

    public boolean equals(Razionale r) {
        if (this.numeratore == r.numeratore &&
                this.denominatore == r.denominatore)
            return true;
        else return false;
    }

    public String toString() {
        return this.numeratore + "/" + this.denominatore;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Razionale r1;
        Razionale r2;
        System.out.print("Inserisci numeratore e denominatore di una frazione " +
                         "separati da uno spazio\n>>"); 
        r1 = new Razionale(scanner.nextInt(), scanner.nextInt());
        System.out.print("Inserire la seconda frazione\n>>");
        r2 = new Razionale(scanner.nextInt(), scanner.nextInt());
        System.out.println("Somma: " + r1.somma(r2));
        System.out.println("Differenza: " + r1.sottrai(r2));
        System.out.println("Prodotto: " + r1.moltiplica(r2));
        System.out.println("Rapproto: " + r1.dividi(r2));
    }

}