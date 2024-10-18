package br.com.admseguros.porto.model;

import java.util.Date;

public class Seguro {
    private Long idSeguro;
    private Long idCliente;
    private Long idVeiculo;
    private String tipo;
    private double valor;
    private String  dataInicio;
    private String  dataFim;

    public Seguro(Long idSeguro, Long idCliente, String tipo, double valor, String dataInicio, String dataFim) {
        this.idSeguro = idSeguro;
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Seguro(Long idSeguro, Long idCliente, Long idVeiculo, String tipo, double valor, String dataInicio, String dataFim) {
        this.idSeguro = idSeguro;
        this.idCliente = idCliente;
        this.idVeiculo = idVeiculo;
        this.tipo = tipo;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Long getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(Long idSeguro) {
        this.idSeguro = idSeguro;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}
