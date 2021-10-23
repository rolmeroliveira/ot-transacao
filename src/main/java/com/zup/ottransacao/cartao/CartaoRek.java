package com.zup.ottransacao.cartao;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CartaoRek {

    @JsonProperty("id")
    private String numeroCartao;
    private String email;


    public CartaoRek() {
    }

    public CartaoRek(String id, String email) {
        this.numeroCartao = numeroCartao;
        this.email = email;
    }

    public String getnumeroCartao() {
        return numeroCartao;
    }

    public void setId(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cartao toModel(){
        Cartao cartao = new Cartao(this.numeroCartao, this.email);
        return cartao;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "id='" + numeroCartao + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
