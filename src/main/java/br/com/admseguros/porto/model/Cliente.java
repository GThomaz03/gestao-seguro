package br.com.admseguros.porto.model;

public class Cliente {
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(Long id, String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // Método para validar CPF
    public boolean validarCpf() {
        return cpf != null && cpf.length() == 11; // Lógica básica de exemplo
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
