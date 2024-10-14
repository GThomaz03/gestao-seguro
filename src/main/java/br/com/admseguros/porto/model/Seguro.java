package br.com.admseguros.porto.model;

public class Seguro {
    private String tipo;
    private double valorApolice;
    private double premio;

    public Seguro(String tipo, double valorApolice) {
        this.tipo = tipo;
        this.valorApolice = valorApolice;
        calcularPremio(); // Chamando o cálculo do prêmio na criação
    }

    // Método que calcula o prêmio do seguro
    public void calcularPremio() {
        if ("automóvel".equalsIgnoreCase(tipo)) {
            this.premio = valorApolice * 0.05; // Exemplo de regra de cálculo
        } else if ("vida".equalsIgnoreCase(tipo)) {
            this.premio = valorApolice * 0.03;
        }
    }

    // Getters e Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorApolice() {
        return valorApolice;
    }

    public void setValorApolice(double valorApolice) {
        this.valorApolice = valorApolice;
    }

    public double getPremio() {
        return premio;
    }
}
