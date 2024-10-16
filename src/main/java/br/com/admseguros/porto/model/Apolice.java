package br.com.admseguros.porto.model;

public class Apolice {
    private Long idApolice;
    private int numeroApolice;
    private Cliente cliente;
    private Seguro seguro;

    public Apolice(int numeroApolice, Cliente cliente, Seguro seguro) {
        this.numeroApolice = numeroApolice;
        this.cliente = cliente;
        this.seguro = seguro;
    }

    // Getters e Setters
    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
}
