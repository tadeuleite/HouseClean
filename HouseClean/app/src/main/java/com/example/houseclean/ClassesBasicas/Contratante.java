package com.example.houseclean.ClassesBasicas;

import java.util.ArrayList;

public class Contratante extends Pessoa{
    private ArrayList<Endereco> endereco;

    public Contratante(){
        endereco = new ArrayList<>();
    }

    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }
}
