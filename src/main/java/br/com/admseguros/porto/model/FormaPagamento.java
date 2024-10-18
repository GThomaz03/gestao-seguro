package br.com.admseguros.porto.model;

public enum FormaPagamento {
    DEBITO,
    CREDITO,
    BOLETO,
    PIX;

    public static FormaPagamento fromString(String formaPagamento) {
        try {
            return FormaPagamento.valueOf(formaPagamento.toUpperCase());
        } catch (IllegalArgumentException e) {
            // Lidar com o caso em que a forma de pagamento não é válida
            throw new RuntimeException("Forma de pagamento inválida: " + formaPagamento);
        }
    }
}


