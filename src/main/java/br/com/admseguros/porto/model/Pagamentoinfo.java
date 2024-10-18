package br.com.admseguros.porto.model;

import java.time.LocalDate;

public interface Pagamentoinfo {
    String getFormaPagamento();
    Double getValorPago();
    LocalDate getDataPagamento();
    String getStatusPagamento();
}
