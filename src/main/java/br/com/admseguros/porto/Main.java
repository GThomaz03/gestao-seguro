package br.com.admseguros.porto;

import br.com.admseguros.porto.model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("01/04/2005", formatter);
        ClienteInfo clienteInfo = ClienteInfoFactory.createClienteInfo(1L, "Gabriel Alves", "54341782894", "Rua piaui, 185", dataNascimento, "11963320175");


        System.out.println(clienteInfo.getNome() +" "+ clienteInfo.getFinalCpf() +" "+ clienteInfo.getTelefone());

        LocalDate dataEmissao = LocalDate.parse("07/10/2013", formatter);
        ApoliceInfo apoliceInfo = ApoliceInfoFactory.createApoliceInfo(1L, 1L, 1234657, "Apolice de seguro de vida que cobre tais e tais situações", dataEmissao );

        System.out.println(apoliceInfo.getNumeroApolice() +" "+ apoliceInfo.getDescricaoApolice() +" "+ apoliceInfo.getDataEmissaoApolice());

        LocalDate dataPagamento = LocalDate.parse("11/10/2013", formatter);
        Pagamentoinfo pagamentoinfo = PagamentoInfoFactory.createPagamentoInfo(1L, 1L, FormaPagamento.PIX, 120.00, dataPagamento, StatusPagamento.PENDENTE);
        System.out.println(pagamentoinfo.getFormaPagamento() + " " + pagamentoinfo.getValorPago() + " " +  pagamentoinfo.getDataPagamento() + " " + pagamentoinfo.getStatusPagamento());
    }
}