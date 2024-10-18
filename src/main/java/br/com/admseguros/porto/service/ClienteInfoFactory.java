package br.com.admseguros.porto.service;


import br.com.admseguros.porto.model.Cliente;

import java.time.LocalDate;

public class ClienteInfoFactory {

    public static ClienteInfo createClienteInfo(Long id, String nome, String cpf, String endereco, LocalDate dataNascimento, String telefone) {
        return new Cliente(id, nome, cpf, endereco, dataNascimento, telefone);
    }
}
