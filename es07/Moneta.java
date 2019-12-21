package es07;

import es07.Oggetto;

public class Moneta extends Oggetto {

    public Moneta() {
        setNumeroFacce(2);
    }

    public void draw() {
        int num  = (int) (Math.random() * 10 + 1); //intero tra 1 e 10
        int temp = (int) (Math.random() * 2);
        
        for(int i = 0; i < num; i++)
            System.out.print(temp++ % 2 == 0 ? "T " : "C ");
        System.out.println();
    }

}