package org.example.esercizio3_chain_of_reposnsability;

public class Tenente extends Ufficiale{

    public Tenente(String funzione) {
        super(funzione);
        super.setStipendio(1000);
    }

}
