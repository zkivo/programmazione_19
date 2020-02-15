package es11.Tennis;

import java.util.List;
import java.util.ArrayList;

public class Set {

    private static final int NUM_GIOCHI = 6;

    private List<Integer> punti_1; //punti giocatore 1
    private List<Integer> punti_2; //punti giocatore 2

    public Set() {
        punti_1 = new ArrayList<>();
        punti_2 = new ArrayList<>();
    }

    private void azzeraPunteggi() {
        int i;        
        for (i = 0; i < punti_1.size(); i++) {
            punti_1.remove(i);
        }
        for (i = 0; i < punti_2.size(); i++) {
            punti_2.remove(i);
        }
    }

    public String toString() {
        String ret = "";
        for (int i = 0; i < punti_1.size(); i++) {
            ret += punti_1.get(i) + "-" + punti_2.get(i) + ", ";
        }
        if (ret.length() > 0)
            ret = ret.substring(0, ret.length() - 2);
        else ret = "- Set non ancora simulato -";
        return ret;
    }

    public int simulazione() {
        //ritorna: 0  se vince il giocatore 1
        //         1  se vince il giocatore 2
        //        -1  errore

        azzeraPunteggi();

        int p_1 = 0; //ultimi valori della liste punti giocatori
        int p_2 = 0;
        int ran;

        do {
            if (p_1 >= Set.NUM_GIOCHI || p_2 >= Set.NUM_GIOCHI) {
                if (Math.abs(p_1 - p_2) == 2) {
                    if      (p_1 > p_2) return 0;
                    else if (p_1 < p_2) return 1;
                }
            }
            ran = (int)(Math.random() * 2); //0 o 1
            if (ran == 0) {
                punti_1.add(++p_1);
                punti_2.add(p_2);
            } else if (ran == 1) {
                punti_1.add(p_1);
                punti_2.add(++p_2);
            } else {
                return -1;
            }
        } while(true);

    }

}
