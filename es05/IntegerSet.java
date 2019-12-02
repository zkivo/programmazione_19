package es05;

public class IntegerSet {

    //MAX_NUM rappresenta il massimo numero rappresentabile + 1
    private static final int MAX_NUM = 100;
    private boolean array[];

    public IntegerSet() {
        array = new boolean[MAX_NUM];
        for (int i = 0; i < MAX_NUM; i++) array[i] = false;
    }

    public boolean insertElement(int elemento) {
        if (elemento >= 0 && elemento < MAX_NUM) {
            array[elemento] = true;
            return true;
        }
        return false;
    }

    public boolean deleteElement(int elemento) {
        if (elemento >= 0 && elemento < MAX_NUM) {
            array[elemento] = false;
            return true;
        }
        return false;
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

        System.out.println(i1);
        i1.insertElement(0);
        i1.insertElement(100);
        i1.insertElement(47);
        i2.insertElement(2);
        i2.insertElement(32);
        i2.insertElement(47);
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("union: " + i1.unionOfIntegerSet(i2));
        System.out.println("intersection: " + i1.intersectionOfIntegerSet(i2));
    }

}