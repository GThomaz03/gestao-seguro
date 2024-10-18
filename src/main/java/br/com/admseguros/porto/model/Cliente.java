package br.com.admseguros.porto.model;

import br.com.admseguros.porto.service.ClienteInfo;

import java.time.LocalDate;


public class Cliente implements ClienteInfo {
    private Long idCliente;
    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
    private String telefone;

    public Cliente(Long idCliente, String nome, String cpf, String endereco, LocalDate dataNascimento, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpf, String endereco, LocalDate dataNascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    // Método para validar CPF
    public boolean validarCpf() {
        return cpf != null && cpf.length() == 11; // Lógica básica de exemplo
    }

    // Getters e Setters

    public Long getidSeguro() {
        return idCliente;
    }

    public void setidSeguro(Long idSeguro) {
        this.idCliente = idCliente;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String getFinalCpf() {
        if (cpf != null && cpf.length() >= 3) {
            return cpf.substring(cpf.length() - 3);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "Nome:" + nome +
                "\nCpf:" + cpf +
                "\nTelefone: " + telefone +
                "}\n";
    }
}
