package es02;

public class ContaParola {

    public static void main(String args[]){
        int count = 0;
        for (String arg: args) {
            if (arg.equals("Ciao")) count ++;
        }
        System.out.println("Hai inserito " + count + " argomenti uguali alla parola Ciao.");
    }

}