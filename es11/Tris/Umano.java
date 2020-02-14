package es11.Tris;

import java.util.List;
import java.util.Scanner;

public class Umano extends Giocatore {

    String nickname;

    public Umano(char c, String nickname) {
        super(c);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean gioca(List<Character> griglia) throws MyTrisException {

        Scanner scanner = new Scanner(System.in);
        String str;        
        char c;
        int pos;
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
            System.out.print(nickname + " coordinate: ");
            str = scanner.nextLine();
            if (str.length() != 2) {
                System.out.println("-- Input non valido --");
                continue;
            }
            str = str.toUpperCase();
            pos = 0;
            if      (str.charAt(0) == 'A') pos += 0;
            else if (str.charAt(0) == 'B') pos += 1;
            else if (str.charAt(0) == 'C') pos += 2;
            else if (str.charAt(0) == '1') pos += 0;
            else if (str.charAt(0) == '2') pos += 3;
            else if (str.charAt(0) == '3') pos += 6;
            else {
                System.out.println("-- Input non valido --");
                continue;
            }

            if      (str.charAt(1) == 'A') pos += 0;
            else if (str.charAt(1) == 'B') pos += 1;
            else if (str.charAt(1) == 'C') pos += 2;
            else if (str.charAt(1) == '1') pos += 0;
            else if (str.charAt(1) == '2') pos += 3;
            else if (str.charAt(1) == '3') pos += 6;
            else {
                System.out.println("-- Input non valido --");
                continue;
            }

            if (griglia.get(pos) == ' ') {
                griglia.set(pos, getSimbolo());
                return true;
            }
            System.out.println("-- Casella non vuota --");
        } while (true);

    }

}
