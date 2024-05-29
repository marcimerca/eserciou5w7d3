package org.example.esercizio3_chain_of_reposnsability;

public abstract class Ufficiale {
    private double stipendio;
    private String funzione;
    private Ufficiale ufficialeGradoPiuAlto;

    public Ufficiale(String funzione) {
        this.funzione = funzione;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public Ufficiale getUfficialeGradoPiuAlto() {
        return ufficialeGradoPiuAlto;
    }

    public void setUfficialeGradoPiuAlto(Ufficiale ufficialeGradoPiuAlto) {
        this.ufficialeGradoPiuAlto = ufficialeGradoPiuAlto;
    }

    public void verificaImporto(int importo) {
        if (stipendio >= importo) {
            System.out.println("L'ufficiale ha stipendio di " + stipendio + "che è maggiore o uguale all'importo");
        } else {
            System.out.println("L'ufficiale ha stipendio inferiore a " + importo);
        }

        if(ufficialeGradoPiuAlto!=null){
            ufficialeGradoPiuAlto.verificaImporto(importo);
        } else {
            System.out.println("Nessun ufficiale soddisfa il requisito");
        }
    }
}
