package br.com.admseguros.porto.dao;

import br.com.admseguros.porto.DatabaseConfig;
import br.com.admseguros.porto.model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteDaoImp implements ClienteDao{

    private DatabaseConfig dbc;
    public ClienteDaoImp(DatabaseConfig dbc) {
        this.dbc = dbc;
    }


    //TODO: Refatorar na próxima aula
    @Override
    public void create(Cliente cliente) {
        String sql = "INSERT INTO T_JAVA_CLIENTE (NM_CLIENTE, NR_CPF, DS_ENDERECO, DT_NASCIMENTO, NR_TELEFONE)  VALUES (?, ?, ?, ?, ?)";
        try{
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getCpf());
            pstmt.setString(3, cliente.getEndereco());
            pstmt.setDate(4, java.sql.Date.valueOf(cliente.getDataNascimento()));
            pstmt.setString(5, cliente.getTelefone());
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public List<Cliente> read() {
        List<Cliente> result = new ArrayList<>();
        String sql = "SELECT * FROM T_JAVA_CLIENTE";

        try{
            //1- Executar o querry select *
            Connection connection = dbc.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //2- mapear linhas para objetos
            while(rs.next()){
                Long id = rs.getLong("id_CLIENTE");
                String nome = rs.getString("NM_CLIENTE");
                String cpf = rs.getString("NR_CPF");
                String endereco = rs.getString("DS_ENDERECO");
                Date dataNascimento = rs.getDate("DT_NASCIMENTO");
                String telefone = rs.getString("NR_TELEFONE");

                result.add(new Cliente (id, nome, cpf, endereco, ((java.sql.Date) dataNascimento).toLocalDate(), telefone));
            }
        } catch (SQLException e){
        }
        return result;
    }

    @Override
    public void update(Cliente Cliente){
        String sql = "update T_JAVA_CLIENTE set NM_CLIENTE=?, DS_ENDERECO=?, NR_TELEFONE=?  where iD=?";
        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, Cliente.getNome());
            pstmt.setString(2, Cliente.getEndereco());
            pstmt.setString(3, Cliente.getTelefone());
            pstmt.setLong(4, Cliente.getidSeguro());

            pstmt.executeUpdate();
        }catch (SQLException e){

        }
    }

    @Override
    public void delete(Long id) {
        String sql = "delete T_JAVA_CLIENTE where id = ?";

        try {
            Connection connection = dbc.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, id);

            pstmt.executeUpdate();
        }catch (SQLException e){

        }

    }

}

