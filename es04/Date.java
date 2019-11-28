package es04;

public class Date {

    private int giorno;
    private int mese;
    private int anno;

    public static final String NOMI_MESI[] = {"Gennaio", "Febbraio", "Marzo", "Aprile",
                                              "Maggio", "Giugno", "Luglio", "Agosto",
                                              "Settembre", "Ottobre", "Novembre", 
                                              "Dicembre"};
    public static final int NUMERO_GIORNI_MESI[] = {31, 28, 31,
                                                    30, 31, 30, 
                                                    31, 31, 30,
                                                    31, 30, 31};

    public Date(Date date) {
        this.giorno = date.giorno;
        this.mese = date.mese;
        this.anno = date.anno;
    }

    public Date(int g, int a) {
        int i;
        anno = a;
        for (i = 0; i < 12; i++) {
            if (g > 0) {
                g -= Date.NUMERO_GIORNI_MESI[i];
            } else if (g <= 0) {
                mese = i;
                giorno = g + Date.NUMERO_GIORNI_MESI[i-1];
                break;
            }
        }
        mese = i;
        giorno = g + NUMERO_GIORNI_MESI[i-1];
    }

    public Date(int g, int m, int a) {
        giorno = g;
        mese = m;
        anno = a;
    }

    public Date(int g, String m, int a) {
        giorno = g;
        anno = a;
        for (int i = 0; i < 12; i++) {
            if (m.toUpperCase().equals(NOMI_MESI[i].toUpperCase())) {
                mese = i + 1;
                return;
            }
        }
    }

    public boolean equals(Date d) {
        if (giorno == d.giorno && mese == d.mese &&
                anno == d.anno)
            return true;
        else return false;
    }

    public Date stampa1() {
        int sum = giorno;
        for (int i = 0; i < mese - 1; i++) {
            sum += NUMERO_GIORNI_MESI[i];
        }
        System.out.println(sum + " " + anno);
        return this;
    }

    public Date stampa2() {
        System.out.println(giorno + "/" + mese + "/" + anno);
        return this;
    }

    public Date stampa3() {
        System.out.println(this.toString());
        return this;
    }

    public String toString() {
        return giorno + " " + NOMI_MESI[mese-1] + " " + anno;
    }

    public static void main(String args[]) {
        
        Date d = new Date(6, 8, 1997);

        /*
         * d1,d3,d5 sono la stessa data riportata sotto forme diverse
         * d2,d4,d5 sono la stessa data   
         */

        Date d1 = new Date(107,2015);
        Date d2 = new Date(365,2015);
        Date d3 = new Date(17, 4, 2015);
        Date d4 = new Date(31, 12, 2015);
        Date d5 = new Date(17, "Aprile", 2015);
        Date d6 = new Date(31, "diceMbre", 2015);

        System.out.println(d1.equals(d3) && d3.equals(d5));
        System.out.println(d2.equals(d4) && d4.equals(d6));
        System.out.println(d1.equals(d));

        d1.stampa1().stampa2().stampa3();
        d2.stampa1().stampa2().stampa3();
    }

}