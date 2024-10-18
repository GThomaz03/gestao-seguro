package br.com.admseguros.porto.model;

public enum FormaPagamento {
    DEBITO("Débito"),
    CREDITO("Crédito"),
    BOLETO("Boleto"),
    PIX("Pix");

    private final String descricao;

    FormaPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static FormaPagamento fromString(String formaPagamento) {
        try {
            return FormaPagamento.valueOf(formaPagamento.toUpperCase());
        } catch (IllegalArgumentException e) {
            // Lidar com o caso em que a forma de pagamento não é válida
            throw new RuntimeException("Forma de pagamento inválida: " + formaPagamento);
        }
    }
}