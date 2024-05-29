package org.example.esercizio3_chain_of_reposnsability;

public class Colonnello extends Ufficiale{

    public Colonnello(String funzione) {
        super(funzione);
        super.setStipendio(4000);
    }

}
