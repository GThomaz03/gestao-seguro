package br.com.admseguros.porto.dao;

import br.com.admseguros.porto.DatabaseConfig;
import br.com.admseguros.porto.model.Seguro;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class SeguroDaoImp implements SeguroDao{

    private DatabaseConfig dbc;

    @Override
    public void createSeguroVida(Seguro seguro) throws SQLException {
        String sql = "INSERT INTO T_JAVA_SEGURO (id_seguro, id_cliente, tp_seguro, vr_seguro, dt_inicio, dt_fim, ) VALUES (?,?,?,?,?,?,?)";

        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seguro.getIdSeguro());
            pstmt.setLong(2, seguro.getIdCliente());
            pstmt.setDouble(3, seguro.getValor());
            pstmt.setString(4, seguro.getTipo());
            pstmt.setDate(5, java.sql.Date.valueOf(seguro.getDataInicio()));
            pstmt.setDate(6, java.sql.Date.valueOf(seguro.getDataFim()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void createSeguroVeiculo(Seguro seguro) throws SQLException {
        String sql = "INSERT INTO T_JAVA_SEGURO (id_seguro, id_cliente, idVeiculo, tp_seguro, vr_seguro, dt_inicio, dt_fim, ) VALUES (?,?,?,?,?,?,?)";

        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, seguro.getIdSeguro());
            pstmt.setLong(2, seguro.getIdCliente());
            pstmt.setLong(3, seguro.getIdVeiculo());
            pstmt.setString(4, seguro.getTipo());
            pstmt.setDouble(5, seguro.getValor());
            pstmt.setDate(6, java.sql.Date.valueOf(seguro.getDataInicio()));
            pstmt.setDate(6, java.sql.Date.valueOf(seguro.getDataFim()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public List<Seguro> read() {
        List<Seguro> result = new ArrayList<>();
        String sql = "SELECT * FROM T_JAVA_SEGURO";

        try{
            //1- Executar o querry select *
            Connection connection = dbc.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //2- mapear linhas para objetos
            while (rs.next()) {
                Long idSeguro = rs.getLong("id");
                Long idCliente = rs.getLong("idCliente");
                Long idVeiculo = rs.getLong("idVeiculo");
                String tpSeguro = rs.getString("tpSeguro");
                Double vrSeguro = rs.getDouble("vrSeguro");

                // Obter as datas como java.sql.Date
                Date dtInicio = rs.getDate("dtInicio");
                Date dtFim = rs.getDate("dtFim");

                // Definir o formato desejado
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // ou o formato que você preferir

                // Converter as datas para String
                String dtInicioStr = dtInicio != null ? sdf.format(dtInicio) : null; // Verifica se dtInicio não é nulo
                String dtFimStr = dtFim != null ? sdf.format(dtFim) : null; // Verifica se dtFim não é nulo

                result.add(new Seguro(idSeguro, idCliente, idVeiculo, tpSeguro, vrSeguro, dtInicioStr, dtFimStr));
            }

        } catch (SQLException e){
        }

        return result;
    }

    @Override
    public void update(Seguro seguro) throws SQLException {
        String sql = "update T_JAVA_SEGURO set tpSeguro=? where idSeguro=?";
        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
//            Quais gets devo por aqui?
            pstmt.setString(1, seguro.getTipo());
            pstmt.setLong(2, seguro.getIdSeguro());


            pstmt.executeUpdate();
        }catch (SQLException e){

        }
    }

    @Override
    public void delete(Long id) {
        String sql = "delete T_JAVA_SEGURO where idSeguro = ?";

        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
//            Qual get devo por aqui?
            pstmt.setLong(1, id);

            pstmt.executeUpdate();
        } catch (SQLException e) {

        }

    }
}
