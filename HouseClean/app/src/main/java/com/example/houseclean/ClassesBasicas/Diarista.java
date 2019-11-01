package com.example.houseclean.ClassesBasicas;

import java.util.Date;

public class Diarista extends Pessoa{
    private String descricao;
    private String ocupacoes;
    private Date horarioTrabalho;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOcupacoes() {
        return ocupacoes;
    }

    public void setOcupacoes(String ocupacoes) {
        this.ocupacoes = ocupacoes;
    }

    public Date getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(Date horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }
}
