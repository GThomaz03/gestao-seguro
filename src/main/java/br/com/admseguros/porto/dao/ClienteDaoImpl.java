//package br.com.admseguros.porto.dao;
//
//import br.com.admseguros.porto.DatabaseConfig;
//import br.com.admseguros.porto.model.Cliente;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ClienteDaoImpl implements ClienteDao{
//
//    private DatabaseConfig dbc;
//
//    public void ClienteDaoImplementada(DatabaseConfig dbc) {
//        this.dbc = dbc;
//    }
//
//    public ClienteDaoImpl(DatabaseConfig dbc) {
//        this.dbc = dbc;
//    }
//
//
//    //TODO: Refatorar na próxima aula
//    @Override
//    public void create(Cliente cliente) {
//        String sql = "INSERT INTO Cliente_seguro(name,cpf, endereco, telefone) VALUES (?, ?, ?, ?)";
//
//        try{
//            Connection connection = dbc.getConnection();
//            PreparedStatement pstmt = connection.prepareStatement(sql);
//            pstmt.setString(1, cliente.getNome());
//            pstmt.setString(2, cliente.getCpf());
//            pstmt.setString(3, cliente.getEndereco());
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//        }
//    }
//
//    @Override
//    public List<Cliente> read() {
//        List<Cliente> result = new ArrayList<>();
//        String sql = "SELECT * FROM Cliente_seguro";
//
//        try{
//            //1- Executar o querry select *
//            Connection connection = dbc.getConnection();
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//
//            //2- mapear linhas para objetos
//            while(rs.next()){
//                Long id = rs.getLong("id");
//                String nome = rs.getString("nome");
//                String cpf = rs.getString("cpf");
//                String endereco = rs.getString("endereco");
//                result.add(new Cliente(id, nome, cpf, endereco));
//            }
//
//        } catch (SQLException e){
//        }
//
//        return result;
//    }
//
//    @Override
//    public void update(Cliente Cliente){
//        String sql = "update Cliente_seguro set NOME=?, ENDERECO=? where iD=?";
//        try {
//            Connection connection = dbc.getConnection();
//            PreparedStatement pstmt = connection.prepareStatement(sql);
//            pstmt.setString(1, Cliente.getNome());
//            pstmt.setString(2, Cliente.getEndereco());
//            pstmt.setLong(3, Cliente.getId());
//
//            pstmt.executeUpdate();
//        }catch (SQLException e){
//
//        }
//    }
//
//    @Override
//    public void delete(Long id) {
//        String sql = "delete Cliente_seguro where id = ?";
//
//        try {
//            Connection connection = dbc.getConnection();
//            PreparedStatement pstmt = connection.prepareStatement(sql);
//            pstmt.setLong(1, id);
//
//            pstmt.executeUpdate();
//        }catch (SQLException e){
//
//        }
//
//    }
//
//
//
//
//
//}
//
