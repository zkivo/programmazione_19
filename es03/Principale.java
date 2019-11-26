package es03;

public class Principale {
    public static void main(String args[]) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
    
        persona1.setNome("Mario").setCognome("Rossi").setEta(22);
        persona2.setNome("Giuseppe").setCognome("Russo").setEta(30);
        persona3 = persona1;

        System.out.println("Persona1: " + persona1.toString() +
                         "\nPersona2: " + persona2.toString() +
                         "\nPersona3: " + persona3.toString());
        
        persona3.setNome("Luca").setCognome("Bianchi").setEta(25);
        System.out.println("Persona1: " + persona1.toString() +
                         "\nPersona2: " + persona2.toString() +
                         "\nPersona3: " + persona3.toString());
    }
}