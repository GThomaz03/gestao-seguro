package br.com.admseguros.porto.model;

import br.com.admseguros.porto.service.ApoliceInfo;

import java.time.LocalDate;

public class Apolice implements ApoliceInfo {
    private Long idApolice;
    private Long idSeguro;
    private int numeroApolice;
    private String descricaoApolice;
    private LocalDate dataEmissaoApolice;


    public Apolice(Long idApolice, Long idSeguro, int numeroApolice, String descricaoApolice, LocalDate dataEmissaoApolice) {
        this.idApolice = idApolice;
        this.idApolice = idSeguro;
        this.numeroApolice = numeroApolice;
        this.descricaoApolice = descricaoApolice;
        this.dataEmissaoApolice = dataEmissaoApolice;
    }

    public Long getIdApolice() {
        return idApolice;
    }

    public void setIdApolice(Long idApolice) {
        this.idApolice = idApolice;
    }

    public Long getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(Long idSeguro) {
        this.idSeguro = idSeguro;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getDescricaoApolice() {
        return descricaoApolice;
    }

    public void setDescricaoApolice(String descricaoApolice) {
        this.descricaoApolice = descricaoApolice;
    }

    public LocalDate getDataEmissaoApolice() {
        return dataEmissaoApolice;
    }

    public void setDataEmissaoApolice(LocalDate  dataEmissaoApolice) {
        this.dataEmissaoApolice = dataEmissaoApolice;
    }
}
