package br.com.admseguros.porto.model;

public enum StatusPagamento {
    CONCLUIDO,
    PENDENTE;

    public static StatusPagamento fromString(String statusPagamento) {
        try {
            return StatusPagamento.valueOf(statusPagamento.toUpperCase());
        } catch (IllegalArgumentException e) {
            // Lidar com o caso em que a forma de pagamento não é válida
            throw new RuntimeException("Forma de pagamento inválida: " + statusPagamento + "\nTente 'CONCLUIDO' ou 'PENDENTE'");
        }
    }
}
