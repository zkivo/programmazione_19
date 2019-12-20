package es07;

public class AbbonatoPremium extends Abbonato {

    private boolean acquisto_gratuito;
    private float spesa_complessiva;

    public AbbonatoPremium(String nome, String cognome, float
            sconto, boolean acquisto_gratuito) {
        super(nome, cognome, sconto);
        this.acquisto_gratuito = acquisto_gratuito;
    }

    public float getSconto() {
        if (acquisto_gratuito) {
            acquisto_gratuito = false;
            return 1;
        }
        else return super.getSconto();
    }

}