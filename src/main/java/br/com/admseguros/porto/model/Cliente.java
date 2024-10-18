
        package br.com.admseguros.porto.model;

import br.com.admseguros.porto.service.ClienteInfo;

import java.time.LocalDate;
import java.time.Period;

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
        validarIdade();
    }

    public Cliente(String nome, String cpf, String endereco, LocalDate dataNascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        validarIdade();
    }

    // Método para validar a idade
    private void validarIdade() {
        if (dataNascimento != null && Period.between(dataNascimento, LocalDate.now()).getYears() < 18) {
            throw new IllegalArgumentException("O cliente deve ter pelo menos 18 anos.");
        }
    }

    // Método para validar CPF
    public boolean validarCpf() {
        return cpf != null && cpf.length() == 11; // Lógica básica de exemplo
    }

    // Método para formatar CPF
    public String getFormattedCpf() {
        if (cpf != null && cpf.length() == 11) {
            return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
        }
        return null;
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
            String maskedCpf = "*".repeat(cpf.length() - 3) + cpf.substring(cpf.length() - 3);
            return maskedCpf;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "Nome:" + nome +
                "\nCpf:" + getFormattedCpf() +
                "\nTelefone: " + telefone +
                "}\n";
    }
}