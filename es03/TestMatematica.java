package es03;

public class TestMatematica {

    public static void main(String args[]) {
        Calcolatrice miaCalcolatrice = new Calcolatrice();

        int vettore1[] = miaCalcolatrice.generaVettore(3);
        int vettore2[] = miaCalcolatrice.generaVettore(3);
        int vettore3[] = miaCalcolatrice.generaVettore(5);

        int sommaVettori_1_2[] = 
            miaCalcolatrice.sommaVettori(vettore1, vettore2); 

        int sommaVettori_1_3[] =
            miaCalcolatrice.sommaVettori(vettore1, vettore3);
        
        System.out.println(Calcolatrice.vettoreToString(vettore1) + " + " +
                           Calcolatrice.vettoreToString(vettore2) + " = " + 
                           Calcolatrice.vettoreToString(sommaVettori_1_2) + "\n" +
                           Calcolatrice.vettoreToString(vettore1) + " + " +
                           Calcolatrice.vettoreToString(vettore3) + " = " + 
                           Calcolatrice.vettoreToString(sommaVettori_1_3));
        
        int matrice1[][] = miaCalcolatrice.generaMatrice(3, 3);
        int matrice2[][] = miaCalcolatrice.generaMatrice(3, 3);
        int matrice3[][] = miaCalcolatrice.generaMatrice(5, 5);

        int sommaMatrici_1_2[][] =
            miaCalcolatrice.sommaMatrici(matrice1, matrice2);
        
        int sommaMatrici_1_3[][] =
            miaCalcolatrice.sommaMatrici(matrice1, matrice3);

        System.out.println("-- Matrice 1 --\n" + 
                           Calcolatrice.matriceToString(matrice1) +
                           "-- Matrice 2 --\n" + 
                           Calcolatrice.matriceToString(matrice2) + 
                           "-- Matrice 3 --\n" + 
                           Calcolatrice.matriceToString(matrice3) + 
                           "-- Somma matrici 1 e 2 --\n" + 
                           Calcolatrice.matriceToString(sommaMatrici_1_2) + 
                           "-- Somma matrici 1 e 3 --\n" + 
                           Calcolatrice.matriceToString(sommaMatrici_1_3));
    }

}