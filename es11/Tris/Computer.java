package es11.Tris;

import java.util.List;

public class Computer extends Giocatore {

    public Computer(char c) {
        super(c);
    }

    public boolean gioca(List<Character> griglia) throws MyTrisException {
        String str_pos = "";
        int    pos;
        if (griglia == null) throw new MyTrisException("Griglia " + 
                                                       "non inizializzata.");
        if (griglia.size() != 9) throw new MyTrisException("Griglia " + 
                                                         "non inizializzata.");
        for (pos = 0; pos < 9; pos++) {
            if (griglia.get(pos) != null) {
                if (griglia.get(pos) == ' ') {
                    break;
                }
            } else throw new MyTrisException("Elementi nulli");
        }

        if (pos == griglia.size()) return false; //griglia piena

        do {
            pos = (int)(Math.random() * 9);
            if (griglia.get(pos) == ' ') {
                if      (pos == 0) str_pos = "A1";
                else if (pos == 1) str_pos = "B1";
                else if (pos == 2) str_pos = "C1";
                else if (pos == 3) str_pos = "A2";
                else if (pos == 4) str_pos = "B2";
                else if (pos == 5) str_pos = "C2";
                else if (pos == 6) str_pos = "A3";
                else if (pos == 7) str_pos = "B3";
                else str_pos = "C3";
                System.out.println("Computer coordinate: " + str_pos);
                griglia.set(pos, getSimbolo());
                return true;
            }
        } while (true); 

    }

}
