package br.com.admseguros.porto.dao;

import br.com.admseguros.porto.DatabaseConfig;
import br.com.admseguros.porto.model.FormaPagamento;
import br.com.admseguros.porto.model.Pagamento;
import br.com.admseguros.porto.model.StatusPagamento;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PagamentoDaoImp implements PagamentoDao{


    private DatabaseConfig dbc;

    public void PagamentoDaoImplementada(DatabaseConfig dbc) {
        this.dbc = dbc;
    }

    public PagamentoDaoImp(DatabaseConfig dbc) {
        this.dbc = dbc;
    }

    @Override
    public void create(Pagamento pagamento) throws SQLException {
        String sql = "INSERT INTO T_JAVA_PAGAMENTO(ID_PAGAMENTO, ID_SEGURO, DS_FORMA_PAGAMENTO, VL_PAGAMENTO, DT_PAGAMENTO, ST_PAGAMENTO) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = dbc.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            // Substituindo os valores nos placeholders
            stmt.setLong(1, pagamento.getId());  // ID_PAGAMENTO
            stmt.setLong(2, pagamento.getIdSeguro());     // ID_SEGURO
            stmt.setString(3, pagamento.getFormaPagamento()); // DS_FORMA_PAGAMENTO
            stmt.setDouble(4, pagamento.getValorPago()); // VL_PAGAMENTO
            stmt.setDate(5, java.sql.Date.valueOf(pagamento.getDataPagamento())); // DT_PAGAMENTO
            stmt.setString(6, pagamento.getStatusPagamento()); // ST_PAGAMENTO

            // Executa o comando SQL
            stmt.executeUpdate();
        }
    }


    @Override
    public List<Pagamento> read() {
        List<Pagamento> result = new ArrayList<>();
        String sql = "SELECT * FROM T_JAVA_PAGAMENTO";

        try{
            //1- Executar o querry select *
            Connection connection = dbc.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //2- mapear linhas para objetos
            while(rs.next()){
                Long id = rs.getLong("ID_PAGAMENTO");
                Long idSeguro = rs.getLong("ID_SEGURO");
                String formaPagamentoStr = rs.getString("FORMA_PAGAMENTO");
                Double valorPagamento = rs.getDouble("VL_PAGAMENTO");
                LocalDate dataPagamento = LocalDate.parse(rs.getString("DT_PAGAMENTO"));
                String statusPagamentoStr = rs.getString("ST_PAGAMENTO");

                // Converter a string para o enum FormaPagamento
                FormaPagamento formaPagamento = FormaPagamento.fromString(formaPagamentoStr);
                StatusPagamento statusPagamento = StatusPagamento.fromString(statusPagamentoStr);
                result.add(new Pagamento(statusPagamento, dataPagamento, valorPagamento, formaPagamento, idSeguro, id));
            }

        } catch (SQLException e){
        }

        return result;
    }
    @Override
    public void update(Pagamento pagamento) throws SQLException {
        String sql = "update T_JAVA_PAGAMENTO set statusPagemento=?, formaPagemento=? where idPagamento=?";

        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, pagamento.getStatusPagamento());
            pstmt.setString(2, pagamento.getFormaPagamento());
            pstmt.setLong(3, pagamento.getId());
            pstmt.executeUpdate();
        }catch (SQLException e){

        }
    }

    @Override
    public void delete(Long id) {
        String sql = "delete T_JAVA_PAGAMENTO where idPagamento=?";

        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        }catch (SQLException e){

        }

    }

}
