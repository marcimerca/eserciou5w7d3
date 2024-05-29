package org.example.esercizio3_chain_of_reposnsability;

public class Generale extends Ufficiale{

    public Generale(String funzione) {
        super(funzione);
        super.setStipendio(5000);
    }

}
