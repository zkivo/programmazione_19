package es09;

public class Main {

    private static final int MAX_ELEMENTS = 10;
    private static final int MAX_NUMBER = 10; //il numero massimo è - 3

    public static void main(String args[]) throws MyIlligalArgumentException {
        
        PositiveIntegerSet set_1 = new PositiveIntegerSet();
        PositiveIntegerSet set_2 = new PositiveIntegerSet();
        int numero;

        for (int i = 0; i < (int)(Math.random() * MAX_ELEMENTS) + 1; i++) {
            numero = (int)(Math.random() * MAX_NUMBER) - 2;            
            try {
                set_1.insertElement(numero);
            } catch (MyIlligalArgumentException e) {
                System.out.println("-- Errore (1) --\n" +
                                   "Tentativo di inserire: " + numero + "\n" +
                                   "Exception message: \"" + e.getMessage() +
                                   "\"\n--------------\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < (int)(Math.random() * MAX_ELEMENTS) + 1; i++) {
            numero = (int)(Math.random() * MAX_NUMBER) - 2;
            try {
                set_2.insertElement(numero);
            } catch (MyIlligalArgumentException e) {
                System.out.println("-- Errore (2) --\n" +
                                   "Tentativo di inserire: " + numero + "\n" +
                                   "Exception message: \"" + e.getMessage() +
                                   "\"\n--------------\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Insieme_1 : " + set_1 + "\n" +
                           "Insieme_2 : " + set_2);

    }

}
