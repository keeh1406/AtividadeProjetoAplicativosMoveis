package com.example.opet.projeto;

/**
 * Created by opet on 28/03/2018.
 */

import java.util.Date;

public class Projeto {
    private String nome;
    private Date inicio;
    private Date entrega;
    private Boolean finalizado;

    public Projeto() {
    }

    public Projeto(String nome, Date inicio, Date entrega, Boolean finalizado) {
        this.nome = nome;
        this.inicio = inicio;
        this.entrega = entrega;
        this.finalizado = finalizado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getEntrega() {
        return entrega;
    }

    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }
}
