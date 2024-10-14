package br.com.admseguros.porto.model;

public class Pagamento {
    private int idPagamento;
    private Apolice apolice;
    private double valorPago;
    private String dataPagamento;

    public Pagamento(int idPagamento, Apolice apolice, double valorPago, String dataPagamento) {
        this.idPagamento = idPagamento;
        this.apolice = apolice;
        this.valorPago = valorPago;
        this.dataPagamento = dataPagamento;
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

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
