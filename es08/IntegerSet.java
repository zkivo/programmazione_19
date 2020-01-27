package es08;

import java.util.Scanner;

public class IntegerSet {

    //MAX_NUM rappresenta il massimo numero rappresentabile + 1
    private static final int MAX_NUM = 100;
    private boolean array[];

    public IntegerSet() {
        array = new boolean[MAX_NUM];
        for (int i = 0; i < MAX_NUM; i++) array[i] = false;
    }

    public void insertElement(int elemento) {
        if (elemento >= 0 && elemento < MAX_NUM) {
            array[elemento] = true;
        } else throw new IndexOutOfBoundsException("elemento non compreso " +
                                                   "tra 0 e " + MAX_NUM);
    }

    public void deleteElement(int elemento) {
        if (elemento >= 0 && elemento < MAX_NUM) {
            array[elemento] = false;
        } else throw new IndexOutOfBoundsException("elemento non compreso " +
                                                   "tra 0 e " + MAX_NUM);
    }

    public IntegerSet unionOfIntegerSet(IntegerSet is) {
        IntegerSet ret = new IntegerSet();
        for (int i = 0; i < MAX_NUM; i++) {
            ret.array[i] = this.array[i] || is.array[i];
        }
        return ret;
    }

    public IntegerSet intersectionOfIntegerSet(IntegerSet is) {
        IntegerSet ret = new IntegerSet();
        for (int i = 0; i < MAX_NUM; i++) {
            ret.array[i] = this.array[i] && is.array[i];
        }
        return ret;
    }

    public String toString() {
        String ret = "{";
        for (int i = 0; i < MAX_NUM; i++) {
            if (array[i]) {
                ret = ret + i + ", ";
            }
        }
        if (ret.length() == 1) return "---";
        return ret.subSequence(0, ret.length() - 2) + "}";
    }

    public static void main(String args[]) {
        IntegerSet i1 = new IntegerSet();
        IntegerSet i2 = new IntegerSet();

        Scanner scanner = new Scanner(System.in);
        int input;
        IntegerSet rf_is;
        do {
            System.out.print("Selezionare IntegerSet 1 o 2? (-1 per uscire)\n>>");
            input = scanner.nextInt();
            if (input == 1) rf_is = i1;
            else if (input == 2) rf_is = i2;
            else if (input == -1) break;
            else {
                System.out.println("- Errore - Puoi inserire solo \'1' o '2'");
                continue;
            }
            System.out.print("Cosa vuoi fare?\n(I)nserire nuovo elemento\n" + 
                             "(E)liminare elemento\n" + 
                             "(S)tampare l'IntegerSet\n" + 
                             "(T)orna indietro\n>>");
            switch (scanner.next().toUpperCase()) {
                case "I":
                    try {
                        System.out.print("Inserire numero\n>>");
                        rf_is.insertElement(scanner.nextInt());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                break;

                case "E":
                    try {
                        System.out.print("Inserire numero\n>>");
                        rf_is.deleteElement(scanner.nextInt());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                break;

                case "S":
                    System.out.println(rf_is);
                break;

                case "T":
                    continue;
            
                default:
                    System.out.println("Input non valido");
                break;
            }
        } while (true);

        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("union: " + i1.unionOfIntegerSet(i2));
        System.out.println("intersection: " + i1.intersectionOfIntegerSet(i2));
        scanner.close();
    }

}