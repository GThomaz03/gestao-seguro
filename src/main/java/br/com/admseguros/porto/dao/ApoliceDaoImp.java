package br.com.admseguros.porto.dao;

import br.com.admseguros.porto.DatabaseConfig;
import br.com.admseguros.porto.model.Apolice;
import br.com.admseguros.porto.model.Seguro;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ApoliceDaoImp implements ApoliceDao{

    private DatabaseConfig dbc;

    @Override
    public void create(Apolice apolice) throws SQLException {
        String sql = "INSERT INTO T_JAVA_APOLICE (id_apolice, id_seguro, nr_apolice, ds_apolice, dt_emissao) VALUES (?,?,?,?,?)";

        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, apolice.getIdApolice());
//            Quais gets devo por aqui?
            pstmt.setLong(2, apolice.getIdSeguro());
            pstmt.setInt(3, apolice.getNumeroApolice());
            pstmt.setString(4, apolice.getDescricaoApolice());
            pstmt.setDate(5, java.sql.Date.valueOf(apolice.getDataEmissaoApolice()) );
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public List<Apolice> read() {
        List<Apolice> result = new ArrayList<>();
        String sql = "SELECT * FROM T_JAVA_APOLICE";

        try{
            //1- Executar o querry select *
            Connection connection = dbc.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //2- mapear linhas para objetos
            while(rs.next()){

                Long idApolice = rs.getLong("id_apolice");
                Long idSeguro = rs.getLong("id_seguro");
                int numeroApolice = rs.getInt("nr_apolice");
                String descricaoApolice = rs.getString("ds_apolice");
                LocalDate dataEmissaoApolice = rs.getDate("dt_emissao").toLocalDate();
                result.add(new Apolice(idApolice, idSeguro, numeroApolice, descricaoApolice, dataEmissaoApolice));
            }

        } catch (SQLException e){
        }

        return result;
    }

    @Override
    public void update(Apolice apolice) throws SQLException {
        String sql = "update T_JAVA_APOLICE set numeroApolice=? where id_apolice=?";
        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, apolice.getNumeroApolice());
            pstmt.setLong(2, apolice.getIdApolice());

            pstmt.executeUpdate();
        }catch (SQLException e){

        }
    }

    @Override
    public void delete(Long id) {
        String sql = "delete T_JAVA_APOLICE where idApolice = ?";

        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);

            pstmt.executeUpdate();
        } catch (SQLException e) {

        }

    }
}
