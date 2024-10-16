package br.com.admseguros.porto.model;

public class Pagamento {
    private int idPagamento;
    private Apolice apolice;
    private double valorPago;
    private String dataPagamento;
    private String tipoPagamento;
    private String statusPagamento;

    public Pagamento(int idPagamento, Apolice apolice, double valorPago, String dataPagamento, String tipoPagamento, String statusPagamento) {
        this.idPagamento = idPagamento;
        this.apolice = apolice;
        this.valorPago = valorPago;
        this.dataPagamento = dataPagamento;
        this.tipoPagamento = tipoPagamento;
        this.statusPagamento = statusPagamento;
    }

    // Getters e Setters
    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Apolice getApolice() {
        return apolice;
    }

    public void setApolice(Apolice apolice) {
        this.apolice = apolice;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
