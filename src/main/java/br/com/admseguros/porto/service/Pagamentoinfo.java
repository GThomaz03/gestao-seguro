package br.com.admseguros.porto.service;

import java.time.LocalDate;

public interface Pagamentoinfo {
    String getFormaPagamento();
    Double getValorPago();
    LocalDate getDataPagamento();
    String getStatusPagamento();
}
