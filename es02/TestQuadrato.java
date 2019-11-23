package es02;

public class TestQuadrato {
    public static void main(String args[]) {
        Quadrato quadrato = new Quadrato();
        quadrato.setLato(5f);
        System.out.println("Perimetro: " + quadrato.perimetro() + "\n" +
                           "Area: " + quadrato.area());
        
    }
}