package br.com.admseguros.porto;

import br.com.admseguros.porto.model.ClienteInfo;
import br.com.admseguros.porto.model.ClienteInfoFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse("01/04/2005", formatter);
        ClienteInfo clienteInfo = ClienteInfoFactory.createClienteInfo(1L, "Gabriel Alves", "54341782894", "Rua piaui, 185", dataNascimento, "11963320175");

        System.out.println(clienteInfo.getNome() +" "+ clienteInfo.getFinalCpf() +" "+ clienteInfo.getTelefone());
    }
}