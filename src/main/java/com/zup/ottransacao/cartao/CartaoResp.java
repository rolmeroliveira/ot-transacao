package com.zup.ottransacao.cartao;

public class CartaoResp {

    private String numeroCartao;
    private String email;

    public CartaoResp() {
    }

    public CartaoResp(Cartao cartao ) {
        this.numeroCartao = cartao.getNumeroCartao();
        this.email = cartao.getEmail();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getEmail() {
        return email;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
