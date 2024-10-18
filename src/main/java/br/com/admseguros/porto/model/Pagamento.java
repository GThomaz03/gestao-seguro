package br.com.admseguros.porto.model;

import br.com.admseguros.porto.service.Pagamentoinfo;

import java.time.LocalDate;

public class Pagamento implements Pagamentoinfo {
    private Long id;
    private Long idSeguro;
    private FormaPagamento formaPagamento;
    private Double valorPago;
    private LocalDate dataPagamento;
    private StatusPagamento statusPagamento;

    public Pagamento(StatusPagamento statusPagamento, LocalDate  dataPagamento, Double valorPago, FormaPagamento formaPagamento, Long idSeguro, long id) {
        this.statusPagamento = statusPagamento;
        this.dataPagamento = dataPagamento;
        this.valorPago = valorPago;
        this.formaPagamento = formaPagamento;
        this.idSeguro = idSeguro;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(Long idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String  getFormaPagamento() {
        String pagamento = String.valueOf(formaPagamento);
        return pagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }


    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public LocalDate  getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate  dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getStatusPagamento() {
        String pagamento = String.valueOf(statusPagamento);
        return pagamento;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
}
