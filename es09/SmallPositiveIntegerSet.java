package es09;

public class SmallPositiveIntegerSet extends PositiveIntegerSet {

    private static final int MAX_INTEGER = 1000;

    public SmallPositiveIntegerSet(SmallPositiveIntegerSet pos_set) {
        super(pos_set);
    }

    public SmallPositiveIntegerSet(Integer... args) 
            throws MyIllegalArgumentException {
        super(args);
    }

    public void insertElement(int element) throws MyIllegalArgumentException {
        super.insertElement(element);
        if (element > MAX_INTEGER) throw
                new MyIllegalArgumentException("La classe accetta solo " + 
                                               "valori compresi tra 1 e 1000");
    }

}
