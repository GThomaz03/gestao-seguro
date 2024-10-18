package br.com.admseguros.porto.dao;

import br.com.admseguros.porto.model.Pagamento;

import java.sql.SQLException;
import java.util.List;

public interface PagamentoDao {
    //TODO: Criar assinatura para Create
    void create(Pagamento pagamento) throws SQLException;

    //TODO: Criar assinatura para Read
    List<Pagamento> read() throws SQLException;

    //TODO: Criar assinatura para Update
    void update(Pagamento pagamento) throws SQLException;

    //TODO: Criar assinatura para Delete
    void delete(Long id) throws SQLException;

}
