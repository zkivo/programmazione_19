package es03;

import java.util.ArrayList;

public class Principale_2 {

    public static void main(String args[]) {
        ArrayList<Persona> miaLista = new ArrayList<>();
        Persona persona1 = new Persona("Mario","Rossi",22);
        Persona persona2 = new Persona("Giuseppe","Russo",30);
        Persona persona3 = new Persona("Luca", "Bianchi", 25);
        miaLista.add(persona1);
        miaLista.add(persona2);
        miaLista.add(persona3);
        System.out.println("Dimesioni lista: " + miaLista.size());
        System.out.println("miaLista(1): " + miaLista.get(1));
        miaLista.remove(1);
        System.out.println(miaLista);
        miaLista.clear();
        if (miaLista.size() == 0) {
            System.out.println(miaLista);
            System.out.println("Arraylist cancellata correttamente.");
        } 
    }

}