package es02;

public class TestRettangolo {
    public static void main(String args[]) {
        Rettangolo rettangolo = new Rettangolo();
        rettangolo.setLati(5f, 3f);
        System.out.println("Perimetro: " + rettangolo.perimetro() + "\n" +
                           "Area: " + rettangolo.area());
        
    }
}