package br.com.admseguros.porto.model;

public class Veiculo {
    private Long id;
    private String placa;
    private String modelo;
    private String marca;
    private int ano;

    public Veiculo(Long id, String placa, String modelo, String marca, int ano) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        validarAno();
        validarPlaca();
    }

    // Método para validar o ano
    private void validarAno() {
        if (ano <= 2012) {
            throw new IllegalArgumentException("O ano do veículo deve ser maior que 2012.");
        }
    }

    // Método para validar a placa
    private void validarPlaca() {
        if (placa == null || !placa.matches("[A-Z]{3}-\\d{4}")) {
            throw new IllegalArgumentException("A placa do veículo deve estar no formato ABC-1234.");
        }
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
        validarAno();
    }
}