package br.com.admseguros.porto.model;

import java.util.Date;

public class Apolice {
    private Long idApolice;
    private Seguro seguro;
    private int numeroApolice;
    private String descricaoApolice;
    private Date dataEmissaoApolice;


    public Apolice(Long idApolice, Seguro seguro, int numeroApolice, String descricaoApolice, Date dataEmissaoApolice) {
        this.idApolice = idApolice;
        this.seguro = seguro;
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

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
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

    public Date getDataEmissaoApolice() {
        return dataEmissaoApolice;
    }

    public void setDataEmissaoApolice(Date dataEmissaoApolice) {
        this.dataEmissaoApolice = dataEmissaoApolice;
    }
}
