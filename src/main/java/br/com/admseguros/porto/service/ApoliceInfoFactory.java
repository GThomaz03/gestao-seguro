package br.com.admseguros.porto.service;

import br.com.admseguros.porto.model.Apolice;

import java.time.LocalDate;

public class ApoliceInfoFactory {
    public static ApoliceInfo createApoliceInfo(Long idApolice, Long idSeguro,  int numeroApolice, String descricaoApolice, LocalDate dataEmissaoApolice) {
        return new Apolice(idApolice, idSeguro, numeroApolice, descricaoApolice, dataEmissaoApolice);
    }
}
