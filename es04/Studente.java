package es04;

public class Studente {

    private static long MATRICOLA_COUNTER = 0;
    private String nome;
    private String cognome;
    private Date data_di_nascita;
    private long matricola;

    public Studente(String nome, String cognome, Date data_di_nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.data_di_nascita = new Date(data_di_nascita);
        this.matricola = MATRICOLA_COUNTER++;
    }

    public String toString() {
        return nome + " " + cognome + " - " + data_di_nascita + " - " +
                   matricola; 
    }

    public String getCognome() {
        return cognome;
    }

    public long getMatricola() {
        return matricola;
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

        Studente s1 = new Studente("Luca", "Bianchi", new Date(6, 8, 1997));
        Studente s2 = new Studente("Mario", "Rossi", 
                                   new Date(1, "febbraio", 2000));

        System.out.println(s1 + "\n" + s2);
        System.out.println(s1.equals(s2));
    }

}