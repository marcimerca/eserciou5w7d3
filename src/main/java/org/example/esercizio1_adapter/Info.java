package org.example.esercizio1_adapter;

import java.time.LocalDate;

public class Info {
    private String nome;
    private String cognome;
    private LocalDate datadiNascita;

    public Info(String nome, String cognome, LocalDate datadiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.datadiNascita = datadiNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDatadiNascita() {
        return datadiNascita;
    }

    public void setDatadiNascita(LocalDate datadiNascita) {
        this.datadiNascita = datadiNascita;
    }
}
