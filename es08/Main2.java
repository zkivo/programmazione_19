package es08;

public class Main2 {

    public static void main(String args[]) {

        Bicicletta bicicletta   = new Bicicletta("Bottecchia");
        Automobile automobile   = new Automobile("AB123CD", 500);
        Ciclomotore ciclomotore = new Ciclomotore(00112345);

        // i tre veicoli partono tutti dalla posizione 0

        bicicletta.setVelocitaIniziale(3.5, 2.2);
        bicicletta.setAccelerazione(1.3, 1.8);

        automobile.setVelocitaIniziale(20.4, 15.3);
        automobile.setAccelerazione(3.5, 1.9);

        ciclomotore.setVelocitaIniziale(10.3, 10.6);
        ciclomotore.setAccelerazione(3.3, 3.4);

        System.out.println("se t = 5.1\n" + 
                           "bicicletta[" + bicicletta.toString() + "] per t = 5.1:\n" + 
                           ": la sua posizione diventa " + bicicletta.muovi(5.1).toString() + "\n" +
                           "automobile[" + automobile.toString() + "] per t = 5.1:\n" + 
                           ": la sua posizione diventa " + automobile.muovi(5.1).toString() + "\n" +
                           "ciclomotore[" + ciclomotore.toString() + "] per t = 5.1:\n" + 
                           ": la sua posizione diventa " + ciclomotore.muovi(5.1).toString());
    }

}