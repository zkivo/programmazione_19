package es11.Tris;

import java.util.List;

public abstract class Giocatore {

    private int  punti;
    private char simbolo;

    public Giocatore(char simbolo) {
        setPunti(0);
        setSimbolo(simbolo);
    }

    public abstract boolean gioca(List<Character> griglia) 
            throws MyTrisException;

    public boolean hasWon(List<Character> griglia) throws MyTrisException {
        if (griglia == null) throw new MyTrisException("Griglia " + 
                                                       "non inizializzata.");
        if (griglia.size() != 9) throw new MyTrisException("Griglia " + 
                                                         "non inizializzata.");
        for (int pos = 0; pos < 9; pos++) {
            if (griglia.get(pos) == null)
                throw new MyTrisException("Elementi nulli");
        }
        if (griglia.get(0) == simbolo && 
                griglia.get(1) == simbolo && 
                griglia.get(2) == simbolo) {
           return true;
        } else if (griglia.get(2) == simbolo && 
                   griglia.get(5) == simbolo && 
                   griglia.get(8) == simbolo) {
           return true;
        } else if (griglia.get(6) == simbolo && 
                   griglia.get(7) == simbolo && 
                   griglia.get(8) == simbolo) {
           return true;
        } else if (griglia.get(0) == simbolo && 
                   griglia.get(3) == simbolo && 
                   griglia.get(6) == simbolo) {
           return true;
        } else if (griglia.get(0) == simbolo && 
                   griglia.get(4) == simbolo && 
                   griglia.get(8) == simbolo) {
           return true;
        } else if (griglia.get(2) == simbolo && 
                   griglia.get(4) == simbolo && 
                   griglia.get(6) == simbolo) {
           return true;
        } else if (griglia.get(1) == simbolo && 
                   griglia.get(4) == simbolo && 
                   griglia.get(7) == simbolo) {
           return true;
        } else if (griglia.get(3) == simbolo && 
                   griglia.get(4) == simbolo && 
                   griglia.get(5) == simbolo) {
           return true;
        } else return false;
    }

    public void aumentaPunti() {
        this.punti++;
    }
    
    public void setPunti(int punti) {
        this.punti = punti;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public int getPunti() {
        return this.punti;
    }

    public char getSimbolo() {
        return this.simbolo;
    }

} 
