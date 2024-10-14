package br.com.admseguros.porto.model;

public class Sinistro {
    private int numeroSinistro;
    private Apolice apolice;
    private String descricao;
    private boolean foiProcessado;

    public Sinistro(int numeroSinistro, Apolice apolice, String descricao) {
        this.numeroSinistro = numeroSinistro;
        this.apolice = apolice;
        this.descricao = descricao;
        this.foiProcessado = false;
    }

    // Método para processar o sinistro
    public void processarSinistro() {
        if (!foiProcessado) {
            // Lógica para processar o sinistro
            System.out.println("Sinistro processado para a apólice: " + apolice.getNumeroApolice());
            foiProcessado = true;
        } else {
            System.out.println("Sinistro já foi processado.");
        }
    }

    // Getters e Setters
    public int getNumeroSinistro() {
        return numeroSinistro;
    }

    public void setNumeroSinistro(int numeroSinistro) {
        this.numeroSinistro = numeroSinistro;
    }

    public Apolice getApolice() {
        return apolice;
    }

    public void setApolice(Apolice apolice) {
        this.apolice = apolice;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFoiProcessado() {
        return foiProcessado;
    }
}
