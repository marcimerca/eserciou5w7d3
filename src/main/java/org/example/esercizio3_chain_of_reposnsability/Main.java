package org.example.esercizio3_chain_of_reposnsability;

public class Main {
    public static void main(String[] args) {
        Tenente tenente = new Tenente("base");
        Capitano capitano = new Capitano("media");
        Maggiore maggiore= new Maggiore("avanzata");
        Colonnello colonnello = new Colonnello("molto avanzata");
        Generale generale = new Generale("massima");

        tenente.setUfficialeGradoPiuAlto(capitano);
        capitano.setUfficialeGradoPiuAlto(maggiore);
        maggiore.setUfficialeGradoPiuAlto(colonnello);
        colonnello.setUfficialeGradoPiuAlto(generale);

        tenente.verificaImporto(3000);
    }
}
