package br.com.admseguros.porto.model;

import java.time.LocalDate;

public class ApoliceInfoFactory {
    public static ApoliceInfo createApoliceInfo(Long idApolice, Long idSeguro,  int numeroApolice, String descricaoApolice, LocalDate dataEmissaoApolice) {
        return new Apolice(idApolice, idSeguro, numeroApolice, descricaoApolice, dataEmissaoApolice);
    }
}
