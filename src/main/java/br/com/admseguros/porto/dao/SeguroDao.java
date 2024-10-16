package br.com.admseguros.porto.dao;

import br.com.admseguros.porto.model.Seguro;

import java.sql.SQLException;
import java.util.List;

public interface SeguroDao {

    //TODO: Criar assinatura para Create
    void createSeguroVida(Seguro seguro) throws SQLException;

    void createSeguroVeiculo(Seguro seguro) throws SQLException;

    //TODO: Criar assinatura para Read
    List<Seguro> read() throws SQLException;

    //TODO: Criar assinatura para Update
    void update(Seguro seguro) throws SQLException;

    //TODO: Criar assinatura para Delete
    void delete(Long id) throws SQLException;
}
