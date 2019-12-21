package es07;

import es07.Moneta;
import es07.Dado;

public abstract class Oggetto {

    private int numero_facce;

    public void setNumeroFacce(int num) {
        this.numero_facce = num;
    }

    public int getNumeroFacce() {
        return this.numero_facce;
    }

    public abstract void draw();

    public static void main(String args[]) {
        Dado dado = new Dado();
        Moneta moneta = new Moneta();
        dado.draw();
        moneta.draw();
    }

}