package es04;

public class Studente {

    String nome;
    String cognome;
    Date data_di_nascita;
    long matricola;

    public Studente(String nome, String cognome, Date data_di_nascita, 
            long matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.data_di_nascita = new Date(data_di_nascita);
        this.matricola = matricola;
    }

    public String toString() {
        return nome + " " + cognome + " - " + data_di_nascita + " - " +
                   matricola; 
    }

    public boolean equals(Studente studente) {
        if (this.nome.equals(studente.nome) &&
                this.cognome.equals(studente.cognome) &&
                this.data_di_nascita.equals(studente.data_di_nascita) &&
                this.matricola == studente.matricola)
            return true;
        else return false;
    }

    public static void main(String args[]) {

        Studente s1 = new Studente("Luca", "Bianchi", new Date(6, 8, 1997),
                                   3564111);
        Studente s2 = new Studente("Mario", "Rossi", 
                                   new Date(1, "febbraio", 2000),
                                   9919222);

        System.out.println(s1 + "\n" + s2);
        System.out.println(s1.equals(s2));
    }

}