package br.com.admseguros.porto.model;


import java.time.LocalDate;
import java.util.Date;

public class ClienteInfoFactory {

    public static ClienteInfo createClienteInfo(Long id, String nome, String cpf, String endereco, LocalDate dataNascimento, String telefone) {
        return new Cliente(id, nome, cpf, endereco, dataNascimento, telefone);
    }
}
