package com.imrob.listaex3.entities;

public class Carro {
    private Long id;
    private String modelo;
    private Cliente cliente;

    public Carro(String modelo, Cliente cliente) {
        this.modelo = modelo;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
