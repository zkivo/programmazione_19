package es02;

public class Quadrato {

    private static final int NUMERO_LATI = 4;
    private float lato;

    public Quadrato() {
        this(0f);
    }

    public Quadrato(float lato) {
        this.lato = lato;
    }

    public float perimetro() {
        return lato * Quadrato.NUMERO_LATI;
    }

    public void setLato(float lato) {
        this.lato = lato;
    }

    public float area(){
        return lato * lato;
    }
}