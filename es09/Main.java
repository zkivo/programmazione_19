package es09;

public class Main {

    private static final int MAX_ELEMENTS = 10;
    private static final int MAX_NUMBER = 10; //il numero massimo è - 3
    private static final int MAX_SMALL_NUMBER = 2000;

    public static void main(String args[]) throws MyIllegalArgumentException {
        
        PositiveIntegerSet set_1 = new PositiveIntegerSet();
        PositiveIntegerSet set_2 = new PositiveIntegerSet();
        int numero;

        System.out.println("-- Random test for PositiveIntegerSet class --");

        for (int i = 0; i < (int)(Math.random() * MAX_ELEMENTS) + 1; i++) {
            numero = (int)(Math.random() * MAX_NUMBER) - 2;            
            try {
                set_1.insertElement(numero);
            } catch (MyIllegalArgumentException e) {
                System.out.println("Exception message: \"" + 
                                   e.getMessage() + "\"");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < (int)(Math.random() * MAX_ELEMENTS) + 1; i++) {
            numero = (int)(Math.random() * MAX_NUMBER) - 2;
            try {
                set_2.insertElement(numero);
            } catch (MyIllegalArgumentException e) {
                System.out.println("Exception message: \"" + 
                                   e.getMessage() + "\"");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nInsieme_1 : " + set_1 + "\n" +
                           "Insieme_2 : " + set_2 + "\n" +
                           (set_1.equals(set_2) ? 
                               "I due insiemi sono uguali\n" : 
                               "I due insiemi non sono uguali\n") +
                           "Unione : " + set_1.union(set_2) + "\n" +
                           "Intersezione : " + set_1.intersection(set_2) +
                           "\nDifferenza : " + set_1.difference(set_2)); 

        System.out.println(
            "\n-- Random test for SmallPositiveIntegerSet class --\n");

        set_1 = new SmallPositiveIntegerSet();
        set_2 = new SmallPositiveIntegerSet();

        for (int i = 0; i < (int)(Math.random() * MAX_ELEMENTS) + 1; i++) {
            numero = (int)(Math.random() * MAX_SMALL_NUMBER) - 2;            
            try {
                set_1.insertElement(numero);
            } catch (MyIllegalArgumentException e) {
                System.out.println("Exception message: \"" + 
                                   e.getMessage() + "\"");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        

        for (int i = 0; i < (int)(Math.random() * MAX_ELEMENTS) + 1; i++) {
            numero = (int)(Math.random() * MAX_SMALL_NUMBER) - 2;
            try {
                set_2.insertElement(numero);
            } catch (MyIllegalArgumentException e) {
                System.out.println("Exception message: \"" + 
                                   e.getMessage() + "\"");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nInsieme_1 : " + set_1 + "\n" +
                           "Insieme_2 : " + set_2 + "\n" +
                           (set_1.equals(set_2) ? 
                               "I due insiemi sono uguali\n" : 
                               "I due insiemi non sono uguali\n") +
                           "Unione : " + set_1.union(set_2) + "\n" +
                           "Intersezione : " + set_1.intersection(set_2) +
                           "\nDifferenza : " + set_1.difference(set_2)); 

    }

}
