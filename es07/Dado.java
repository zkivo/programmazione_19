package es07;

public class Dado extends Oggetto {

    public Dado() {
        setNumeroFacce(6);
    }

    public void draw() {
        
        int temp;
        int num = (int) (Math.random() * 10 + 1); //intero tra 1 e 10
        for (int prec = 0, i = 0; i < num; i++) {
            if (i == 0) {
                prec = (int) (Math.random() * getNumeroFacce() + 1);
                System.out.print(prec + " ");
            } else {
                do {
                    temp = (int) (Math.random() * getNumeroFacce() + 1);
                } while(temp == prec);
                System.out.print(temp + " ");
                prec = temp;
            }
        }
        System.out.println();
    }

}