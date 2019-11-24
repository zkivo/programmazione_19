package es03;

public class SommaMatrici {

    public static void main(String args[]) {
        int matrice1[][] = {{(int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100)},
                            {(int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100)},
                            {(int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100)}};
        int matrice2[][] = {{(int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100)},
                            {(int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100)},
                            {(int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100),
                             (int) (Math.random() * 100)}};
        
        int sommaMatrici[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                sommaMatrici[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        SommaMatrici.printMatrice(matrice1, "Matrice1");
        SommaMatrici.printMatrice(matrice2, "Matrice2");
        SommaMatrici.printMatrice(sommaMatrici, "SommaMatrici");
    }

    public static void printMatrice(int matrice[][], String name) {
        System.out.println(name + ".");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 5; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println("|");
        }
    }

}