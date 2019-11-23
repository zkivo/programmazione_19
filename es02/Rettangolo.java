package es02;

public class Rettangolo {

    private static final int NUMERO_LATI = 4;
    private float base;
    private float altezza;

    public Rettangolo() {
        this(0f, 0f);
    }

    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float perimetro() {
        return (base * 2) + (altezza * 2);
    }

    public void setLati(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float area(){
        return base * altezza;
    }
}