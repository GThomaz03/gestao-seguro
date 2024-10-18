package br.com.admseguros.porto.model;

import java.time.LocalDate;
import java.util.Date;

public class Seguro {
    private Long idSeguro;
    private Long idCliente;
    private Long idVeiculo;
    private String tipo;
    private double valor;
    private LocalDate dataInicio;
    private LocalDate  dataFim;

    public Seguro(Long idSeguro, Long idCliente, String tipo, double valor, LocalDate dataInicio, LocalDate dataFim) {
        this.idSeguro = idSeguro;
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Seguro(Long idSeguro, Long idCliente, Long idVeiculo, String tipo, double valor, LocalDate dataInicio, LocalDate dataFim) {
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }


    @Override
    public String toString() {
        return "Seguro{"+
                "\nNúmero seguro: " + idSeguro +
                "\nTipo seguro: " + tipo +
                "\nData inicio: " + dataInicio +
                "\nData fim: " + dataFim +
                " }\n";
    }
}
