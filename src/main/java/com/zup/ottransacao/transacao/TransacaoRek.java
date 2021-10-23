package com.zup.ottransacao.transacao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zup.ottransacao.cartao.Cartao;
import com.zup.ottransacao.cartao.CartaoRek;
import com.zup.ottransacao.estabelecimento.Estabelecimento;
import com.zup.ottransacao.estabelecimento.EstabelecimentoRek;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class TransacaoRek {

    @JsonProperty("id")
    private String numeroTransacao;
    private String valor;
    private String efetivadaEm;
    private EstabelecimentoRek estabelecimento;
    private CartaoRek cartao;

    public TransacaoRek() {
    }

    public TransacaoRek(String numeroTransacao, String valor, String efetivadaEm, EstabelecimentoRek estabelecimento, CartaoRek cartao) {
        this.numeroTransacao = numeroTransacao;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
    }


    public String getNumeroTransacao() {
        return numeroTransacao;
    }

    public String getValor() {
        return valor;
    }

    public String getEfetivadaEm() {
        return efetivadaEm;
    }

    public EstabelecimentoRek getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoRek getCartao() {
        return cartao;
    }

    public void setNumeroTransacao(String numeroTransacao) {
        this.numeroTransacao = numeroTransacao;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setEfetivadaEm(String efetivadaEm) {
        this.efetivadaEm = efetivadaEm;
    }

    public void setEstabelecimento(EstabelecimentoRek estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public void setCartao(CartaoRek cartao) {
        this.cartao = cartao;
    }

    public Transacao toModel(){
        Cartao cartao = this.cartao.toModel();
        Estabelecimento estabelecimento = this.estabelecimento.toModel();
        BigDecimal valorNumeroal = new BigDecimal(this.valor);
        LocalDateTime efetivadaEmData = LocalDateTime.parse(this.efetivadaEm);

        Transacao t = new Transacao(
                this.numeroTransacao,
                valorNumeroal,
                efetivadaEmData,
                estabelecimento,
                cartao);
        return t;
    }



}
