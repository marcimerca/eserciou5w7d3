package org.example.esercizio3_chain_of_reposnsability;

public class Capitano extends Ufficiale{

    public Capitano(String funzione) {
        super(funzione);
        super.setStipendio(2000);
    }

}
