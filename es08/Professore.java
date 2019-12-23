package es08;

import es04.Date;
import es07.Persona;

public class Professore extends Persona {

    private Date dataAssunzione;
    private String ruolo;
    private String dipartimento;
    private float salario;

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

}