package br.com.admseguros.porto.dao;

import br.com.admseguros.porto.DatabaseConfig;
import br.com.admseguros.porto.model.Seguro;
import br.com.admseguros.porto.model.Veiculo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDaoImp implements VeiculoDao {

        private DatabaseConfig dbc;

        @Override
        public void create(Veiculo veiculo) throws SQLException {
            String sql = "INSERT INTO T_JAVA_VEICULO (id_veiculo, nr_placa, nm_modelo, nm_marca, nr_ano) VALUES (?,?,?,?,?)";

            try {
                Connection connection = dbc.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setLong(1, veiculo.getId());
                pstmt.setString(2, veiculo.getPlaca());
                pstmt.setString(3, veiculo.getModelo());
                pstmt.setString(4, veiculo.getMarca());
                pstmt.setInt(5, veiculo.getAno());
                pstmt.executeUpdate();
            } catch (SQLException e) {
            }
        }

        @Override
        public List<Veiculo> read() {
            List<Veiculo> result = new ArrayList<>();
            String sql = "SELECT * FROM T_JAVA_VEICULO";

            try{
                //1- Executar o querry select *
                Connection connection = dbc.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                //2- mapear linhas para objetos
                while(rs.next()){
                    Long id = rs.getLong("id");
                    String placa = rs.getString("placa");
                    String modelo = rs.getString("modelo");
                    String marca = rs.getString("marca");
                    int ano = rs.getInt("ano");
                    result.add(new Veiculo(id, placa, modelo, marca, ano));
                }

            } catch (SQLException e){
            }

            return result;
        }

        @Override
        public void update(Veiculo veiculo) throws SQLException {
            String sql = "update T_JAVA_VEICULO set ano=? where id=?";
            try {
                Connection connection = dbc.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setInt(1, veiculo.getAno());
                pstmt.setLong(2, veiculo.getId());

                pstmt.executeUpdate();
            }catch (SQLException e){

            }
        }

    @Override
    public void delete(Long id) throws SQLException {
        String sql = "delete T_JAVA_VEICULO where idSeguro = ?";

        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);

            pstmt.executeUpdate();
        } catch (SQLException e) {

        }
    }

}