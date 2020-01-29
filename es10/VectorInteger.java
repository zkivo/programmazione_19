package es10;

import es09.MyIllegalArgumentException;
import java.util.List;
import java.util.ArrayList;

public class VectorInteger implements Comparable<VectorInteger> {

    private List<Integer> vector;
    private int dimensione;

    public VectorInteger(int dimensione) throws MyIllegalArgumentException {
        if (dimensione <= 0) throw new MyIllegalArgumentException("La " + 
                                                  "dimensione minima e' 1.");
        this.dimensione = dimensione;
        vector = new ArrayList<>(dimensione);
        for (int i = 0; i < dimensione; i++) {
            vector.add(0);  
        }
    }

    public int compareTo(VectorInteger vec_int) {
        double modulo_1 = this.modulo();
        double modulo_2 = vec_int.modulo();
        if (modulo_1 == modulo_2) return 0;
        else if (modulo_1 > modulo_2) return 1;
        else return -1;
    }

    public double modulo() {
        int somma = 0;
        for (int i = 0; i < dimensione; i++) {
            somma += vector.get(i) * vector.get(i); 
        }
        return Math.sqrt(somma);
    }
    
    public void set(int posizione, int valore) 
            throws MyIllegalArgumentException {
        if (posizione < 0 || posizione >= dimensione) throw 
                new MyIllegalArgumentException("La posizione accessibile e' " +
                                 "compresa tra 0 e " + (dimensione - 1) + ".");
        vector.set(posizione, valore);
    }

    public Integer get(int posizione) 
            throws MyIllegalArgumentException {
        if (posizione < 0 || posizione >= dimensione) throw 
                new MyIllegalArgumentException("La posizione accessibile e' " +
                                 "compresa tra 0 e " + (dimensione - 1) + ".");
        return vector.get(posizione);
    }

    public VectorInteger somma(VectorInteger vec_int) 
            throws MyIllegalArgumentException {
        VectorInteger somma = new VectorInteger(this.dimensione);
        if (this.dimensione != vec_int.dimensione) 
            throw new MyIllegalArgumentException("I vettori devono avere " +
                                                 "la stessa dimensione.");
        for (int i = 0; i < dimensione; i++) {
            somma.set(i, this.get(i) + vec_int.get(i));
        }
        return somma;
    }

    public VectorInteger differenza(VectorInteger vec_int) 
            throws MyIllegalArgumentException {
        VectorInteger differenza = new VectorInteger(this.dimensione);
        if (this.dimensione != vec_int.dimensione) 
            throw new MyIllegalArgumentException("I vettori devono avere" +
                                                 "la stessa dimensione.");
        for (int i = 0; i < dimensione; i++) {
            differenza.set(i, this.get(i) - vec_int.get(i));
        }
        return differenza;
    }

    public VectorInteger prodottoPerScalare(int scalare)
            throws MyIllegalArgumentException {
        VectorInteger prodotto = new VectorInteger(this.dimensione);
        for (int i = 0; i < dimensione; i++) {
            prodotto.set(i, this.get(i) * scalare);
        }
        return prodotto;
    }

    public String toString() {
        String ret = "(";
        for (Integer intero : vector) {
            ret += intero + ", ";
        }
        if (ret.length() > 1) ret = ret.substring(0, ret.length() - 2);
        else return "- Vettore nullo -";
        return ret + ")";
    }

    public static void main(String args[]) throws MyIllegalArgumentException {
            
        int max_dimensione = 3;
        int max_integer = 3;
        int max_test_operazioni = 5;
        int numero_di_vettori = (int)(Math.random() * 2) + 2; //tra 2 e 3
        int dim;
        int op;        
        int i;
        int j;
        
        List<VectorInteger> lista = new ArrayList<>();   
        VectorInteger vec_1;
        VectorInteger vec_2;

        for (i = 0; i < numero_di_vettori; i++) {
            dim = (int)(Math.random() * max_dimensione) + 1;
            lista.add(new VectorInteger(dim));
            vec_1 = lista.get(i);
            for (j = 0; j < dim; j++) {
                vec_1.set(j, (int)(Math.random() * max_integer) + 1);
            }
        
        }
        System.out.println("Vettori:");
        for (VectorInteger vec_int : lista) {
            System.out.println(vec_int);
        }

        for (i = 0; i < max_test_operazioni; i++) {
            op    = (int)(Math.random() * 4) + 1;
            vec_1 = lista.get((int)(Math.random() * numero_di_vettori));
            vec_2 = lista.get((int)(Math.random() * numero_di_vettori));
            j = (int)(Math.random() * 10);
            if (op == 1) {
                try {
                    System.out.println("Somma: " + vec_1 + " + " + 
                                       vec_2 + " = " +
                                       vec_1.somma(vec_2));
                } catch (MyIllegalArgumentException e) {
                    System.out.println("Eccezzione per somma: " + vec_1 + 
                                       " + " + vec_2 + " : " + 
                                       e.getMessage());           
                } catch (Exception e) {
                    e.printStackTrace();
                }            
            } else if (op == 2) {
                try {
                    System.out.println("Differenza: " + vec_1 + " - " + 
                                       vec_2 + " = " +
                                       vec_1.differenza(vec_2));
                } catch (MyIllegalArgumentException e) {
                    System.out.println("Eccezzione per differenza: " + vec_1 + 
                                       " - " + vec_2 + " : " + 
                                       e.getMessage());           
                } catch (Exception e) {
                    e.printStackTrace();
                }           
            } else if (op == 3) {
                System.out.println("Prodotto per uno scalare: " + vec_1 + 
                                   " * " + j + " = " +
                                   vec_1.prodottoPerScalare(j));
            } else {
                System.out.println("Modulo: |" + vec_1 + "| = " + 
                                   vec_1.modulo()); 
            }   
        }
    }

}
