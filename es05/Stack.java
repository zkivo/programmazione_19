package es05;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {

    private static final int MAX_SIZE = 100;
    private ArrayList<String> stack; 

    public Stack() {
        stack = new ArrayList<String>();
    }

    public void push(String a) {
        if (stack.size() >= MAX_SIZE) return;
        stack.add(a);
    }

    public String pop() {
        if (isEmpty()) return null;
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return (stack.size() == 0);
    }

    public boolean isFull() {
        return (stack.size() >= MAX_SIZE);
    }

    public String toString() {
        return stack.toString();
    }

    public boolean equals(Stack s) {
        return stack.equals(s.stack);
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        
        Stack stack = new Stack();

        do {
            System.out.print("---- Menu' ----\n" + 
                            "1) push\n" +
                            "2) pop\n" + 
                            "3) is empty\n" +
                            "4) is full\n" + 
                            "5) print stack\n" +
                            "6) exit\n>>");
            
            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("Inserire stringa\n>>");
                    stack.push(scanner.next());
                break;

                case 2:
                    System.out.println("Stringa prelevata: \"" + 
                                       stack.pop() + "\"");
                break;

                case 3:
                    if (stack.isEmpty()) System.out.println("Stack vuoto");
                    else System.out.println("Stack non vuoto");
                break;

                case 4:
                    if (stack.isFull()) System.out.println("Stack pieno");
                    else System.out.println("Stack non pieno");
                break;

                case 5:
                    System.out.println(stack.toString());
                break;

                case 6:
                    return;
                
                default:
                    System.out.println("--Errore in input--");
                break;
            }

        } while(true);
    }

}