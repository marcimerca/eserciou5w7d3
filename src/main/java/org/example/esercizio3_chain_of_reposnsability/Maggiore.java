package org.example.esercizio3_chain_of_reposnsability;

public class Maggiore extends Ufficiale{

    public Maggiore(String funzione) {
        super(funzione);
        super.setStipendio(3000);
    }

}
