package es03;

public class Calcolatrice {

    int[] generaVettore(int L) {
        int v[] = new int[L];
        for (int i = 0; i < L; i++) v[i] = (int) (Math.random() * 100);
        return v;
    }

    int[][] generaMatrice(int R, int C){
        int m[][] = new int[R][C];
        for (int i = 0; i < R; i++) m[i] = generaVettore(C);
        return m;
    }

    int[] sommaVettori(int[] a, int[] b) {
        int somma[] = null;
        if (a.length == b.length) {
            somma = new int[a.length];
            for(int i = 0; i < a.length; i++) 
                somma[i] = a[i] + b[i];
        }
        return somma;
    }

    public static String vettoreToString(int vettore[]) {
        String ret = "(";
        if (vettore == null) return null;
        for (int i = 0; i < vettore.length; i++) {
            ret = ret + (i == 0 ? "" : ", ") + vettore[i];
        }
        return ret + ")";
    }

    public static String matriceToString(int matrice[][]) {
        if (matrice == null) return null;
        String ret = "";
        for (int i = 0; i < matrice.length; i++) {
            ret = ret + "|";
            for (int j = 0; j < matrice[i].length; j++) {
                ret = ret + (j == 0 ? "" : " ") + matrice[i][j];
            }
            ret = ret + "|\n";
        }
        return ret;
    }

    int[][] sommaMatrici(int[][] a, int[][]b) {
        /* --
         * Una matrice potrebbe contenere più elementi
         * in una riga rispetto ad all'altra, in
         * questo caso ritornerà null.
         * --
         */
        int somma[][] = null;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++){
                if (a[i].length != b[i].length ||
                    a[i].length != a[0].length)
                    return null; //matrici con dimensioni diverse
            }
        } else return null;
        if (a.length != 0) {
            if (a[0].length != 0)
                somma = new int[a.length][a[0].length];
            else return null;
        } else return null;

        for (int i = 0 ; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                somma[i][j] = a[i][j] + b[i][j];
            }
        }
        return somma;
    }
}