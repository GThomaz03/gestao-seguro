package br.com.admseguros.porto.dao;

import br.com.admseguros.porto.model.Apolice;

import java.sql.SQLException;
import java.util.List;

public interface ApoliceDao {
    //TODO: Criar assinatura para Create
    void create(Apolice apolice) throws SQLException;

    //TODO: Criar assinatura para Read
    List<Apolice> read() throws SQLException;

    //TODO: Criar assinatura para Update
    void update(Apolice apolice) throws SQLException;

    //TODO: Criar assinatura para Delete
    void delete(Long id) throws SQLException;
}

