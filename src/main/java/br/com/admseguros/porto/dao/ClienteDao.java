package br.com.admseguros.porto.dao;

import br.com.admseguros.porto.model.Cliente;

import java.sql.SQLException;
import java.util.List;

public interface ClienteDao {

    //TODO: Criar assinatura para Create
    void create(Cliente cliente) throws SQLException;

    //TODO: Criar assinatura para Read
    List<Cliente> read() throws SQLException;

    //TODO: Criar assinatura para Update
    void update(Cliente cliente) throws SQLException;

    //TODO: Criar assinatura para Delete
    void delete(Long id) throws SQLException;
}
