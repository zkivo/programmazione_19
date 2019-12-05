package es06;

public class Votante {

    protected static final int MAX_VOTI = 5;
    private long numero_telefono;
    private int voto[];
    private int count_voti;

    public Votante(long numero_telefono) {
        this.numero_telefono = numero_telefono;
        voto = new int[MAX_VOTI];
        count_voti = 0;
    }

    public boolean vota(int cantante) {
        if (count_voti >= 5) return false;
        voto[count_voti++] = cantante;
        return true;
    }

    public int getCountVoti() {
        return count_voti;
    }

    public long getNumeroTelefono() {
        return numero_telefono;
    }

}