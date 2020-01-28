package es09;

public class SmallPositiveIntegerSet extends PositiveIntegerSet {

    public SmallPositiveIntegerSet(SmallPositiveIntegerSet pos_set) {
        super(pos_set);
    }

    public SmallPositiveIntegerSet(Integer... args) 
            throws MyIlligalArgumentException {
        super(args);
    }

    public void insertElement(int element) throws MyIlligalArgumentException {
        super.insertElement(element);
        if (element > 1000) throw
                new MyIlligalArgumentException("La classe accetta solo " + 
                                               "valori compresi tra 1 e 1000");
    }

}
