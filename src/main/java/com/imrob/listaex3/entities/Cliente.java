package com.imrob.listaex3.entities;

import java.lang.reflect.Field;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Long id;
    private String nome;
    private String cpf;
    private String dataNacimento;

    public Cliente(Long id, String nome, String cpf, String dataNacimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNacimento = dataNacimento;
    }

    public Cliente(String nome, String cpf, String dataNacimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNacimento = dataNacimento;
    }

    public Cliente() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public List<String> getAttributes() {
        List<String> nomes = new ArrayList<>();
        Field[] campos = this.getClass().getDeclaredFields();
        for (Field campo : campos) {
            nomes.add(campo.getName());
        }
        return nomes;
    }

}
