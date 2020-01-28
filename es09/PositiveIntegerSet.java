package es09;

import java.util.Set;
import java.util.HashSet;

public class PositiveIntegerSet {

    private Set<Integer> set;

    public PositiveIntegerSet(PositiveIntegerSet pos_set) {
        this.set = new HashSet<>();
        this.set.addAll(pos_set.getSet());
    }
    
    public PositiveIntegerSet(Integer... args) 
            throws MyIlligalArgumentException {
        set = new HashSet<>();
        for (int i = 0; i < args.length; i++) {
            if (args[i] <= 0) throw 
                    new MyIlligalArgumentException("La classe accetta solo " + 
                                                   "numeri positivi.");
            set.add(args[i]);
        }
    }

    public void addAll(Set<Integer> set) {
        this.set.addAll(set);
    }

    public PositiveIntegerSet union(PositiveIntegerSet pos_set)
            throws MyIlligalArgumentException {
        PositiveIntegerSet ret = new PositiveIntegerSet(this.set.toArray(
                                                        new Integer[0]));
        ret.addAll(pos_set.getSet());
        return ret;
    }

    public PositiveIntegerSet intersection(PositiveIntegerSet pos_set) 
            throws MyIlligalArgumentException {
        PositiveIntegerSet ret = new PositiveIntegerSet(this.set.toArray(
                                                        new Integer[0]));      
        ret.set.retainAll(pos_set.getSet());
        return ret;
    }

    public PositiveIntegerSet difference(PositiveIntegerSet pos_set) 
            throws MyIlligalArgumentException {
        PositiveIntegerSet unione = this.union(pos_set);
        PositiveIntegerSet intersezione = this.intersection(pos_set);
        unione.set.removeAll(intersezione.set);
        return unione;
    }

    public void insertElement(int element) throws MyIlligalArgumentException {
        if (element <= 0) throw 
                new MyIlligalArgumentException("La classe accetta solo " + 
                                               "numeri positivi.");
        set.add(element);
    }

    public int compareTo(PositiveIntegerSet pos_set) {
        int size     = size();
        int pos_size = pos_set.size();
        if (size == pos_size) return 0;
        else if (size > pos_size) return 1;
        else return -1;
    }

    public boolean deleteElement(int element) {
        return set.remove(element);
    }

    public boolean containsElement(int element) {
        return set.contains(element);
    }

    public boolean equals(PositiveIntegerSet pos_set) {
        return set.equals(pos_set.set);
    }

    public String toString() {
        String ret = "{";
        for (int elemento : set) {
            ret += elemento + ", ";
        }
        if (ret.length() > 1) ret = ret.substring(0, ret.length() - 2);
        return ret + "}";
    }

    public int size() {
        return set.size();
    }

    public Set<Integer> getSet() {
        return set;
    }

}
