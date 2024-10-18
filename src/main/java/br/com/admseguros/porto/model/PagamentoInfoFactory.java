package br.com.admseguros.porto.model;

import java.time.LocalDate;

public class PagamentoInfoFactory {
    public static Pagamentoinfo createPagamentoInfo(Long idPagamento, Long idSeguro, FormaPagamento formaPagamento, Double valorPago, LocalDate dataPagamento, StatusPagamento statusPagamento) {
        return new Pagamento(statusPagamento, dataPagamento,valorPago,formaPagamento,idSeguro,idPagamento);
    }
}
