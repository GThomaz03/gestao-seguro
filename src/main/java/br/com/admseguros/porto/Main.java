package br.com.admseguros.porto;

import br.com.admseguros.porto.dao.*;
import br.com.admseguros.porto.model.*;
import br.com.admseguros.porto.service.*;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {

    public static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    public static final String USER = "rm558637";
    public static final String PASS = "010405";


    public static void main(String[] args) throws SQLException {
        DatabaseConfig db = new DatabaseConfig(URL, USER, PASS);

    //Criando e exibindo um cliente com factory
        //Implementar o método de exibir do cpf na classe cliente
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("01/04/2005", formatter);
        ClienteInfo clienteInfo = ClienteInfoFactory.createClienteInfo(1L, "Gabriel Alves", "54341782894", "Rua piaui, 185", dataNascimento, "11963320175");

        System.out.println(clienteInfo.getNome() +" "+ clienteInfo.getFinalCpf() +" "+ clienteInfo.getTelefone());

        //Criando uma Apólice com Factory
        LocalDate dataEmissao = LocalDate.parse("07/10/2013", formatter);
        ApoliceInfo apoliceInfo = ApoliceInfoFactory.createApoliceInfo(1L, 1L, 1234657, "Apolice de seguro de vida que cobre tais e tais situações", dataEmissao );

        System.out.println(apoliceInfo.getNumeroApolice() +" "+ apoliceInfo.getDescricaoApolice() +" "+ apoliceInfo.getDataEmissaoApolice());

        //Criando um Pagamento com Factory
        LocalDate dataPagamento = LocalDate.parse("11/10/2013", formatter);
        Pagamentoinfo pagamentoinfo = PagamentoInfoFactory.createPagamentoInfo(1L, 1L, FormaPagamento.PIX, 120.00, dataPagamento, StatusPagamento.PENDENTE);
        System.out.println(pagamentoinfo.getFormaPagamento() + " " + pagamentoinfo.getValorPago() + " " +  pagamentoinfo.getDataPagamento() + " " + pagamentoinfo.getStatusPagamento());

        ClienteDao clienteDao = new ClienteDaoImp(db);

        //Exibindo todos os clientes do banco de dados
        try {
            clienteDao.create(new Cliente(2L, "Pedro Dovigo", "54341782894", "Rua piaui, 185", dataNascimento, "11963320175"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        List<Cliente> clientes;
        try {
            clientes = clienteDao.read();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for(Cliente cliente: clientes){
            System.out.println(cliente.toString());
        }

// criando um seguro

        LocalDate dataInicioSeg1 = LocalDate.parse("18/10/2024", formatter);
        LocalDate dataFimSeg1 = LocalDate.parse("18/10/2025", formatter);
        // O id do seguro não pode ser repetido e o id do cliente precisa existir
        Seguro seguro1 = new Seguro( 10L,  19L, "Vida", 120.00, dataInicioSeg1, dataFimSeg1);

        SeguroDao seguroDao = new SeguroDaoImp(db);

    //Cadastrando o seguro no banco de dados
        try {
            seguroDao.createSeguroVida(seguro1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //Lendo os Seguros do banco de dados
        List<Seguro> seguros;
            seguros = seguroDao.read();
        for(Seguro seguro: seguros){
            System.out.println(seguro.toString());
        }

    }
}