package es11.Seggio;

public class Studente implements Comparable<Studente>{

    private String nome;
    private String cognome;
    private long matricola;
    private long codice_controllo;

    public Studente(String nome, String cognome, long matricola,
            long codice_controllo) {
        setNome(nome);
        setCognome(cognome);
        setMatricola(matricola);
        setCodiceControllo(codice_controllo);
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Studente)) return false;
        Studente s = (Studente) o;
        return (nome.equals(s.getNome())        &&
                cognome.equals(s.getCognome())  &&
                matricola == s.getMatricola()   &&
                codice_controllo == s.getCodiceControllo() ?
                true : false);
    }

    public int compareTo(Studente s) {
        if (getMatricola() > s.getMatricola())      return 1;
        else if (getMatricola() < s.getMatricola()) return -1;
        else return 0;
    }

    public int hashCode() {
        return (int)(matricola + codice_controllo);
    }

    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome +
               ", Matricola: " + matricola + ", Codice di controllo: " +
               codice_controllo;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public long getMatricola() {
        return matricola;
    }

    public long getCodiceControllo() {
        return codice_controllo;
    }

    public void setNome(String nome) {
        this.nome = new String(nome);
    }

    public void setCognome(String cognome) {
        this.cognome = new String(cognome);
    }

    public void setMatricola(long matricola) {
        this.matricola = matricola;
    }

    public void setCodiceControllo(long codice_controllo) {
        this.codice_controllo = codice_controllo;
    }

}
