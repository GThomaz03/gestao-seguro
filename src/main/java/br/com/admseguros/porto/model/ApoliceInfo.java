package br.com.admseguros.porto.model;

import java.time.LocalDate;

public interface ApoliceInfo {
    public int getNumeroApolice();
    public String getDescricaoApolice();
    public LocalDate getDataEmissaoApolice();

}
