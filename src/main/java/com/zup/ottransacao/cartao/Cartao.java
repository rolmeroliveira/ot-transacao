package com.zup.ottransacao.cartao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String numeroCartao;
    private String email;


    public Cartao() {
    }

    public Cartao(String numeroCartao, String email) {
        this.numeroCartao = numeroCartao;
        this.email = email;
    }

    public Long getId() {
        return id;
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
